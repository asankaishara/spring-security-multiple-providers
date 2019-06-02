package org.ai.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/endpoint/rest/private/api-key")
    public String getPrivateResponse() {
        return "private response from api key endpoint";
    }

    @RequestMapping("/endpoint/rest/public/api-key")
    public String getPublicResponse() {
        return "public response from api key endpoint";
    }

}
