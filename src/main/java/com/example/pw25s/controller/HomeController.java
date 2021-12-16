package com.example.pw25s.controller;


import com.example.pw25s.model.Autor;
import com.example.pw25s.repository.AutorRepository;
import com.example.pw25s.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/home", ""})
public class HomeController {

    @Autowired
    LivroRepository livroRepository;
    @Autowired
    AutorRepository autorRepository;

    @GetMapping(value = "")
    public String home(Model model) {
        model.addAttribute("autores",  autorRepository.findAll());
        model.addAttribute("livros",  livroRepository.findAll());
        return "home";
    }

    @PostMapping(value = "{autor}")
    public String filtroLivro(@PathVariable String nomeAutor, Model model){
        Autor autor = autorRepository.findByNome(nomeAutor).orElse(null);
        model.addAttribute("autores",  autorRepository.findAll());
        model.addAttribute("livros",   livroRepository.findByAutor(autor));
        return "redirect:/home";
    }




}
