package it.giovi.service.filter

import mu.KotlinLogging
import org.springframework.stereotype.Service
import java.util.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Service
class FilterLoggingServiceImpl : FilterLoggingService {
    private val logger = KotlinLogging.logger {}

    override fun logRequest(httpServletRequest: HttpServletRequest, body: Any?) {
        val stringBuilder = StringBuilder()
        val parameters = buildParametersMap(httpServletRequest)
        stringBuilder.append("REQUEST ")
        stringBuilder.append("method=[").append(httpServletRequest.method).append("] ")
        stringBuilder.append("path=[").append(httpServletRequest.requestURI).append("] ")
        stringBuilder.append("headers=[").append(buildHeadersMap(httpServletRequest)).append("] ")
        if (!parameters.isEmpty()) {
            stringBuilder.append("parameters=[").append(parameters).append("] ")
        }
        if (body != null) {
            stringBuilder.append("body=[").append(body).append("]")
        }
        logger.info{stringBuilder.toString()}
    }

    override fun logResponse(
        httpServletRequest: HttpServletRequest,
        httpServletResponse: HttpServletResponse?,
        body: Any?
    ) {
        val stringBuilder = StringBuilder()
        stringBuilder.append("RESPONSE ")
        stringBuilder.append("method=[").append(httpServletRequest.method).append("] ")
        stringBuilder.append("path=[").append(httpServletRequest.requestURI).append("] ")
        stringBuilder.append("responseHeaders=[").append(buildHeadersMap(httpServletResponse)).append("] ")
        stringBuilder.append("responseBody=[").append(body).append("] ")
        logger.info{stringBuilder.toString()}
    }

    private fun buildParametersMap(httpServletRequest: HttpServletRequest): Map<String, String> {
        val resultMap: MutableMap<String, String> = HashMap()
        val parameterNames = httpServletRequest.parameterNames
        while (parameterNames.hasMoreElements()) {
            val key = parameterNames.nextElement()
            val value = httpServletRequest.getParameter(key)
            resultMap[key] = value
        }
        return resultMap
    }

    private fun buildHeadersMap(request: HttpServletRequest): Map<String, String> {
        val map: MutableMap<String, String> = HashMap()
        val headerNames: Enumeration<*> = request.headerNames
        while (headerNames.hasMoreElements()) {
            val key = headerNames.nextElement() as String
            val value = request.getHeader(key)
            map[key] = value
        }
        return map
    }

    private fun buildHeadersMap(response: HttpServletResponse?): Map<String, String> {
        val map: MutableMap<String, String> = HashMap()
        val headerNames = response!!.headerNames
        for (header in headerNames) {
            map[header] = response.getHeader(header)
        }
        return map
    }
}