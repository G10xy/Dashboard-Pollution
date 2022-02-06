package it.giovi.security.filter

import it.giovi.service.filter.FilterLoggingService
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServletServerHttpRequest
import org.springframework.http.server.ServletServerHttpResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.lang.Nullable

@ControllerAdvice
class CustomResponseBodyAdviceAdapter(private val filterLoggingService: FilterLoggingService) : ResponseBodyAdvice<Any?> {


    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean {
        return true
    }

    override fun beforeBodyWrite(
        @Nullable obj: Any?,
        methodParameter: MethodParameter,
        mediaType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        serverHttpRequest: ServerHttpRequest,
        serverHttpResponse: ServerHttpResponse
    ): Any? {
        if (serverHttpRequest is ServletServerHttpRequest && serverHttpResponse is ServletServerHttpResponse) {
            filterLoggingService.logResponse(
                serverHttpRequest.servletRequest,
                serverHttpResponse.servletResponse,
                obj
            )
        }
        return obj
    }
}