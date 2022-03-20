package com.bajurus.constructorarticles.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        String response = "{your IP : " + request.getRemoteAddr() + "}";
        logger.info(response);
        return response;
    }

}
