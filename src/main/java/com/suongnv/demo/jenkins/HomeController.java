package com.suongnv.demo.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/greeting")
    public String getGreeting(@RequestParam(defaultValue = "world") String name) {
        return "Hello " + name;
    }
}
