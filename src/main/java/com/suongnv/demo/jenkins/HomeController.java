package com.suongnv.demo.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/greeting")
    public String getGreeting(@RequestParam(defaultValue = "world") String name) {
        log.info("param name: {}", name);
        return "Hello " + name;
    }
}
