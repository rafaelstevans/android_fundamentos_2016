package br.com.fabricadeprogramador.cursoandroid;

import java.io.Serializable;

/**
 * Created by rafae on 15/10/2016.
 */

public class Usuario implements Serializable {
    private Long id;
    private String nome;
    private int imagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                " Nome: " + nome;
    }
}
