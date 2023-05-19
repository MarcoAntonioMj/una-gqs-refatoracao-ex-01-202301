package com.marco;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import com.marco.model.Pessoa;

public class TestModel {
    @Test
    void testGetSet_Nome() {
        Pessoa pessoa = new Pessoa();
       String nomeEsperado = "marco";

        pessoa.setNome(nomeEsperado);
        String nomeRetonado = pessoa.getNome();

        assertEquals(nomeEsperado, nomeRetonado);
    }

    @Test
    void testGetSet_Idade() {
        Pessoa pessoa = new Pessoa();
        int idadeEsperada = 30;

        pessoa.setIdade(idadeEsperada);
        int idadeRetornada = pessoa.getIdade();

        assertEquals(idadeEsperada, idadeRetornada);
    }
}


