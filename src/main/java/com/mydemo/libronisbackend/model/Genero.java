package com.mydemo.libronisbackend.model;

public enum Genero {
    FICCAO("Ficção"),
    NAO_FICCAO("Não-ficção"),
    FANTASIA("Fantasia"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    MISTERIO("Mistério"),
    SUSPENSE("Suspense"),
    ROMANCE("Romance"),
    TERROR("Terror"),
    FICCAO_HISTORICA("Ficção Histórica"),
    JOVEM_ADULTO("Jovem Adulto"),
    LITERATURA_INFANTIL("Literatura Infantil"),
    BIOGRAFIA("Biografia"),
    AUTOBIOGRAFIA("Autobiografia"),
    AUTOAJUDA("Autoajuda"),
    POESIA("Poesia"),
    NOVELA_GRAFICA("Novela Gráfica"),
    AVENTURA("Aventura"),
    CRIME("Crime"),
    DRAMA("Drama"),
    LITERATURA_CLASSICA("Literatura Clássica");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
