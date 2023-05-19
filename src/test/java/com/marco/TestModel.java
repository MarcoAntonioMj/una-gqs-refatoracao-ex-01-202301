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

    @Test
    void testGetTeveSintomasRecentemente() {
        Pessoa pessoa = new Pessoa();
        String TeveSintomasRecentementesperado = "Sim";

        pessoa.setTeveSintomasRecentemente(TeveSintomasRecentementesperado);
        String TeveSintomasRecentementeRetornado = pessoa.getTeveSintomasRecentemente();

        assertEquals(TeveSintomasRecentementesperado, TeveSintomasRecentementeRetornado);
    }
    @Test
    void testGetcartaoVacinaEmDia() {
        Pessoa pessoa = new Pessoa();
        String cartaoVacinaEmDiaEsperado = "Sim";

        pessoa.setCartaoVacinaEmDia(cartaoVacinaEmDiaEsperado);
        String cartaoVacinaEmDiaRetornado = pessoa.getCartaoVacinaEmDia();

        assertEquals(cartaoVacinaEmDiaEsperado, cartaoVacinaEmDiaRetornado);
    }
    @Test
    void testGetSetTeveContatoComPessoasSintomaticas() {
        Pessoa pessoa = new Pessoa();
        String teveContatoCompessoasSintomaticasEsperado = "Sim";

        pessoa.setTeveContatoComPessoasSintomaticas(teveContatoCompessoasSintomaticasEsperado);
        String TeveContatoComPessoasSintomaticasRetornado = pessoa.getTeveContatoComPessoasSintomaticas();

        assertEquals(teveContatoCompessoasSintomaticasEsperado, TeveContatoComPessoasSintomaticasRetornado);
    }
    @Test
    void testgetEstaRetornandoViagem() {
        Pessoa pessoa = new Pessoa();
        String EstaRetornandoViagemEsperado = "Sim";

        pessoa.setEstaRetornandoViagem(EstaRetornandoViagemEsperado);
        String EstaRetornandoViagemRetornado = pessoa.getEstaRetornandoViagem();

        assertEquals(EstaRetornandoViagemEsperado, EstaRetornandoViagemRetornado);
    }
}



