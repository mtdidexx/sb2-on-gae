package net.katrinka.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SayHelloService {
    @GetMapping(path = "/sayhello")
    public String sayHello() {
        log.info("sayHello GET request");
        return "Hello, Sucka!";
    }
}
