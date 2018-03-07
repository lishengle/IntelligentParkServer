package com.example.ssm.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 李盛乐 on 2018.3.7.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    private static  final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/index")
    public String index() {
        logger.debug("index");
        return "index";
    }
}
