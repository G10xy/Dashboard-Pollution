package it.giovi.service.filter

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


interface FilterLoggingService {
    fun logRequest(httpServletRequest: HttpServletRequest, body: Any?)
    fun logResponse(
        httpServletRequest: HttpServletRequest,
        httpServletResponse: HttpServletResponse?,
        body: Any?
    )
}