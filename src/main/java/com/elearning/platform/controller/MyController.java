package com.elearning.platform.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MyController {

    @Value("${OPENAI_API_KEY}")
    private String apiKey;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("apiKey", apiKey);
        return "index";  // This returns the index.html template
    }

    @ModelAttribute("apiKey")
    public String globalApiKey() {
        return apiKey;
    }
}