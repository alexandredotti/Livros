package com.example.pw25s.controller;

import com.example.pw25s.model.LivroSalvarDTO;
import com.example.pw25s.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @RequestMapping("/novo")
    public String novoLivro(LivroSalvarDTO livroSalvarDTO){
        return "livro/formulario";
    }

    @PostMapping(value = "/salvar")
    public String salvarLivro(@Valid LivroSalvarDTO livroSalvarDTO, BindingResult result){
        if(!result.hasErrors()) {
            livroRepository.save(livroSalvarDTO.toLivro());
        }
        return "livro/formulario";
    }
}
