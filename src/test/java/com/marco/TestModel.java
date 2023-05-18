package com.marco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.marco.model.Pessoa;

public class TestModel {
    @Test
    void testColetaNome(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("");
        String mensagemErroEsperada ="Nome inválido. Por favor, informe um nome válido:";
        String nomeRetornado = pessoa.getNome();
        assertEquals(mensagemErroEsperada, nomeRetornado);
    }
     @Test
   void testColetaIdade(){
       Pessoa pessoa = new Pessoa();
       double idadeInvalida = 19.5;
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
       void setIdade(int idade) ;

    });
}
}

