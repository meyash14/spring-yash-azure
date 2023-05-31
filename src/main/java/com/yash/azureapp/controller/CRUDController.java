package com.yash.azureapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {
    @GetMapping("/")
    public String greeting()
    {
        return "Yash Loves Pooja ,But Pooja doesn't think so";
    }
}
