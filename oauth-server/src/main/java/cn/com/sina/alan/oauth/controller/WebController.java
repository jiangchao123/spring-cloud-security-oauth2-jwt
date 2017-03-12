package cn.com.sina.alan.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangchao08 on 17/3/6.
 */
@RestController
public class WebController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello word!";
    }
}
