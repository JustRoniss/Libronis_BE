package com.mydemo.libronisbackend.model.usuario;

import jakarta.persistence.Entity;

@Entity
public class Professor extends Usuario{
    private String departamento;
    private static final int MAX_LIVROS_EMPRESTIMO = 10;

    private static final int MAX_PERIODO_EMPRESTIMO = 30;

    public Professor(long id, String nome, String email, TipoUsuario tipoUsuario, boolean ativo, String departamento){
        super(id, nome, email, tipoUsuario,ativo);
        this.departamento = departamento;
    }

    public Professor() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
