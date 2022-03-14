package com.exen.skills.controller;

import com.exen.skills.entity.Language;
import com.exen.skills.entity.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user", new Programmer(1L, "Ivan",
                Arrays.asList(
                        new Language(1L, "Java", "cool language", null),
                        new Language(1L, "Python", "also cool language", null)
                ), null));

        return "index";
    }

    @GetMapping("/create-developer")
    public String developer(){
        return "developer";
    }

    @GetMapping("/create-language")
    public String language(){
        return "language";
    }

    @GetMapping("/vacancies")
    public String vacancies(){
        return "vacancies";
    }
}
