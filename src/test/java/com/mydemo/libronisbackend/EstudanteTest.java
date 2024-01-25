package com.mydemo.libronisbackend;

import com.mydemo.libronisbackend.model.usuario.Estudante;
import com.mydemo.libronisbackend.model.usuario.TipoUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudanteTest {

    @Test
    public void testCriacaoEstudante(){
        long id = 2L;
        String nome = "Ronaldo Luiz2";
        String email = "ronaldo2@email.com";
        TipoUsuario tipoUsuario = TipoUsuario.ESTUDANTE;
        boolean ativo = true;
        String curso = "Engenharia de software";

        Estudante estudante = new Estudante(id, nome, email, tipoUsuario, ativo, curso);

        Assertions.assertEquals(id, estudante.getId());
        Assertions.assertEquals(nome, estudante.getNome());

        Assertions.assertEquals(email, estudante.getEmail());
        Assertions.assertEquals(tipoUsuario, estudante.getTipoUsuario());
        Assertions.assertEquals(ativo, estudante.isAtivo());
        Assertions.assertEquals(curso, estudante.getCurso());
    }
}
