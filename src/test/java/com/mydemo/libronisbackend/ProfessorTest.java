package com.mydemo.libronisbackend;

import com.mydemo.libronisbackend.model.usuario.Professor;
import com.mydemo.libronisbackend.model.usuario.TipoUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    public void testCriacaoProfessor(){
        long id = 1L;
        String nome = "Ronaldo Luiz";
        String email = "ronaldo@email.com";
        TipoUsuario tipoUsuario = TipoUsuario.PROFESSOR;
        boolean ativo = true;
        String departamento = "TI";

        Professor professor = new Professor(id, nome, email, tipoUsuario, ativo, departamento);

        Assertions.assertEquals(id, professor.getId());
        Assertions.assertEquals(nome, professor.getNome());

        Assertions.assertEquals(email, professor.getEmail());
        Assertions.assertEquals(tipoUsuario, professor.getTipoUsuario());
        Assertions.assertEquals(ativo, professor.isAtivo());
        Assertions.assertEquals(departamento, professor.getDepartamento());

    }
}
