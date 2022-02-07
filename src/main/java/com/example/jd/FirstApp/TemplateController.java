package com.example.jd.FirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {
    @GetMapping("/")
    public String getPrueba(){
        return "hello Carmen!";
    }
}
