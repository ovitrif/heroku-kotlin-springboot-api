package com.example

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class Controller {

    @RequestMapping(Routes.ROOT)
    internal fun index(): String {
        return "index"
    }
}
