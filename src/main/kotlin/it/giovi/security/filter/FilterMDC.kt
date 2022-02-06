package it.giovi.security.filter

import org.slf4j.MDC
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import java.io.IOException
import java.util.*
import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.springframework.util.StringUtils

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class FilterMDC(
    @Value("\${mdc.request.header}") private val requestHeader: String,
    @Value("\${mdc.response.header}") private val responseHeader: String,
    @Value("\${mdc.token}") private val mdcTokenKey: String,
    @Value("\${mdc.clientIP}") private val mdcClientIpKey: String
) : OncePerRequestFilter() {

    @Throws(IOException::class, ServletException::class)
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        try {
            val token = extractToken(request)
            val clientIP = extractClientIP(request)
            MDC.put(mdcClientIpKey, clientIP)
            MDC.put(mdcTokenKey, token)
            if (StringUtils.hasText(responseHeader)) {
                response.addHeader(responseHeader, token)
            }
            filterChain.doFilter(request, response)
        } finally {
            MDC.remove(mdcTokenKey)
            MDC.remove(mdcClientIpKey)
        }
    }

    private fun extractToken(request: HttpServletRequest): String {
        val token: String =
            if (StringUtils.hasText(requestHeader) && StringUtils.hasText(request.getHeader(requestHeader))) {
            request.getHeader(requestHeader)
        } else {
            UUID.randomUUID().toString().toUpperCase().replace("-", "")
        }
        return token
    }

    private fun extractClientIP(request: HttpServletRequest): String {
        val clientIP: String = if (request.getHeader("X-Forwarded-For") != null) {
            request.getHeader("X-Forwarded-For").split(",").toTypedArray()[0]
        } else {
            request.remoteAddr
        }
        return clientIP
    }
}