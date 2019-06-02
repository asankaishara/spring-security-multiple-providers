package org.ai.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @RequestMapping("/endpoint/web/private/basic")
    public String getPrivatePage() {
        return "private response from  web endpoint";
    }

    @RequestMapping("/endpoint/web/public/basic")
    public String getHome() {
        return "home";
    }
}
