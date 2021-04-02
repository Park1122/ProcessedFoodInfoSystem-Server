package com.plim.plimserver.hello.controller;

import com.plim.plimserver.hello.domain.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/demo")
    public Hello getHello(){
        return Hello.builder()
                .name("PLIM")
                .age(20)
                .say("Hi")
                .date(LocalDate.of(2021, 3,26))
                .build();
    }

    @GetMapping("/test")
    public Hello getTest() {
        return Hello.builder()
                .name("PLIM")
                .age(15)
                .say("Hi")
                .date(LocalDate.of(2021, 3,26))
                .build();
    }
}