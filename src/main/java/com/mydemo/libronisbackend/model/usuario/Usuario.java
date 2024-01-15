package com.mydemo.libronisbackend.model.usuario;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    @Email
    private String email;

    private TipoUsuario tipoUsuario;

    private boolean ativo;


    public Usuario(long id, String nome, String email, TipoUsuario tipoUsuario, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.ativo = ativo;
    }

    public Usuario() {

    }
}
