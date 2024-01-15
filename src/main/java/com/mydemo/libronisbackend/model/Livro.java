package com.mydemo.libronisbackend.model;


import jakarta.validation.constraints.Size;

public class Livro {

    private String titulo;
    private String autor;
    private String anoPublicacao;
    private Genero genero;
    @Size(min = 13, max = 13, message = "O ISBN deve conter 13 caracteres")
    private String isbn;
    private boolean disponivel;

}
