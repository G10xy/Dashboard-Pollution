package it.giovi.security.filter

import it.giovi.service.filter.FilterLoggingService
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.DispatcherType

@Component
class LogInterceptor(private val filterLoggingService: FilterLoggingService) : HandlerInterceptor {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        if (DispatcherType.REQUEST.name == request.dispatcherType.name
            && request.method == HttpMethod.GET.name
        ) {
            filterLoggingService.logRequest(request, null)
        }
        return true
    }
}