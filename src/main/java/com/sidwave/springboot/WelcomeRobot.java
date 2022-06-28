package com.sidwave.springboot;
//Sidney Seay
//Created June 7, 2022

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRobot {

    @GetMapping("/boopBeep")
    public String boopBeep() {
        return "Welcome to...the..boop...fu...beep...ture...*high-pitched rings*. You are in the year 2035.";
    }
}
