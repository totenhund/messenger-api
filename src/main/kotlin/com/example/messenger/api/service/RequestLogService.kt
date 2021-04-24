package com.example.messenger.api.service

import javax.servlet.http.HttpServletRequest

interface RequestLogService {

    fun logRequest(request: HttpServletRequest)
}