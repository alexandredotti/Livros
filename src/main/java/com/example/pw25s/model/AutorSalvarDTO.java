package com.example.pw25s.model;

import javax.validation.constraints.NotBlank;

public class AutorSalvarDTO {

    @NotBlank
    private String nomeAutor;

    public AutorSalvarDTO() {
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Autor toAutor() {
        Autor autor = new Autor();
        autor.setNome(nomeAutor);
        return autor;
    }
}
