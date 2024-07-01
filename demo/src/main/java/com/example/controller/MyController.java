package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class MyController {


    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }


}