package com.testweb.jenrique.controller;

import com.testweb.jenrique.model.People;

import com.testweb.jenrique.repo.IPeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IPeopleRepo repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        //logica

        People p = new People();
        p.setIdPeople(2);
        p.setName("Code");
        repo.save(p);

        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/listar")
    public String greeting(Model model) {
        //logica
        model.addAttribute("personas", repo.findAll());
        return "greeting";
    }
}
