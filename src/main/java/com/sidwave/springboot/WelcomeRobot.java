package com.sidwave.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRobot {

    @GetMapping("/boopBeep")
    public String boopBeep() {
        return "Welcome to...the..boop...fu...beep...ture...*high-pitched rings*";
    }
}
