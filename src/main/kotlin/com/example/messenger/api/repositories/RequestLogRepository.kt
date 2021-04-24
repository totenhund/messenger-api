package com.example.messenger.api.repositories

import com.example.messenger.api.models.RequestLog
import org.springframework.data.repository.CrudRepository


interface RequestLogRepository : CrudRepository<RequestLog, Long>