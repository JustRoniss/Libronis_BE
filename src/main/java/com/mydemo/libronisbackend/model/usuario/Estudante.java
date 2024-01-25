package com.mydemo.libronisbackend.model.usuario;

import jakarta.persistence.Entity;

@Entity
public class Estudante extends Usuario{
    private String curso;
    private static final int MAX_LIVROS_EMPRESTIMO = 5;
    private static final int MAX_PERIODO_EMPRESTIMO = 15;

    public Estudante(long id, String nome, String email, TipoUsuario tipoUsuario, boolean ativo, String curso) {
        super(id, nome, email, tipoUsuario, ativo);
        this.curso = curso;
    }

    public Estudante() {

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
