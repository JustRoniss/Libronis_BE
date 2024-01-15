package com.mydemo.libronisbackend.model.usuario;

public enum TipoUsuario {

    ESTUDANTE("Estudante"),
    PROFESSOR("Professor"),
    OUTROS("Outros");

    private String descricao;
    TipoUsuario(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
