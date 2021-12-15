package com.example.pw25s.model;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public class LivroSalvarDTO {

    @NotBlank
    private String nomeLivro;

    private BigDecimal valorLivro;

    private String editoraLivro;

    private Autor autorLivro;

    public LivroSalvarDTO() {
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public BigDecimal getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(BigDecimal valorLivro) {
        this.valorLivro = valorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public Autor getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }

    public Livro toLivro() {
        Livro livro = new Livro();
        livro.setNome(nomeLivro);
        livro.setValor(valorLivro);
        livro.setEditora(editoraLivro);
        livro.setAutor(autorLivro);
        return livro;
    }
}
