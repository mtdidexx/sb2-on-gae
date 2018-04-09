package net.katrinka.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SayHelloService {
    @GetMapping(path = "/sayhello")
    public String sayHello() {
        log.info("sayHello GET request");
        return "Hello, Sucka!";
    }

    @PutMapping(path = "/sayhello/{name}")
    public String sayHelloToSomeone(@PathVariable("name") String name) {
        return String.format("Hello there, %s", name);
    }
}
