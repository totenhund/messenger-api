package com.example.messenger.api.components

import com.example.messenger.api.service.RequestLogServiceImpl
import org.springframework.stereotype.Component
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Component
class RequestLogInterceptor(val requestLogService: RequestLogServiceImpl) : HandlerInterceptorAdapter() {
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        requestLogService.logRequest(request)
        return super.preHandle(request, response, handler)
    }
}