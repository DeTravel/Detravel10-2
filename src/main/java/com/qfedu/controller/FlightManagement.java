package com.qfedu.controller;

import com.qfedu.entry.Flight;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightManagement {

    @RequestMapping("/")
    public static void main(String[] args) {
        System.out.println("hello");

    }
}
