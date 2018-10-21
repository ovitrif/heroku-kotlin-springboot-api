package com.example

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

    @RequestMapping(Routes.STATUS_CODE, method = [RequestMethod.GET])
    internal fun getStatusCode(
            @PathVariable("statusCode") statusCode: Int): ResponseEntity<Any> {
        val response = object {
            val statusCode = statusCode;
        }

        return ResponseEntity.status(statusCode).body(response);
    }
}
