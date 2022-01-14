package it.giovi.errorhandling

import mu.KotlinLogging
import org.springframework.core.annotation.AnnotationUtils
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*
import javax.servlet.http.HttpServletRequest


@EnableWebMvc
@ControllerAdvice
class GlobalDefaultExceptionHandler : ResponseEntityExceptionHandler() {
    private val logger = KotlinLogging.logger {}

    @ExceptionHandler(Exception::class)
    @Throws(Exception::class)
    fun handleError(req: HttpServletRequest, ex: Exception): ModelAndView {
        logger.error{"Request: $req.requestURL raised by  $ex.message"}

        if (AnnotationUtils.findAnnotation(ex.javaClass, ResponseStatus::class.java) != null) throw ex
        val mav = ModelAndView()
        mav.addObject("exception", ex)
        mav.addObject("message", ex.message)
        mav.addObject("url", req.requestURL)
        mav.addObject("timestamp", Date())
        mav.viewName = "error"
        return mav
    }
}