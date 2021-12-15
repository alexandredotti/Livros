package com.example.pw25s.controller;


import com.example.pw25s.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/home", ""})
public class HomeController {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping(value = "")
    public String home(Model model) {
        model.addAttribute("livros",  livroRepository.findAll());
        return "home";
    }


}
