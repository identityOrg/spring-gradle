package net.prasenjit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PRASENJIT-NET on 7/11/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/test")
    public String home() {
        return "Home content";
    }
}
