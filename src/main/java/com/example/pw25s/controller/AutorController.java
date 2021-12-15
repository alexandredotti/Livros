package com.example.pw25s.controller;

import com.example.pw25s.model.AutorSalvarDTO;
import com.example.pw25s.model.LivroSalvarDTO;
import com.example.pw25s.repository.AutorRepository;
import com.example.pw25s.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    AutorRepository autorRepository;

    @RequestMapping("/novo")
    public String novoAutor(AutorSalvarDTO autorSalvarDTO){
        return "autor/formulario";
    }

    @PostMapping(value = "/salvar")
    public String salvarAutor(@Valid AutorSalvarDTO autorSalvarDTO, BindingResult result){
        if(!result.hasErrors()) {
            autorRepository.save(autorSalvarDTO.toAutor());
        }
        return "autor/formulario";
    }
}
