package com.marco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.marco.model.Pessoa;

public class TestModel {
    @Test
    void test_get_set_nome() {
        Pessoa pessoa = new Pessoa();
        String nomeEsperado = "marco";

        pessoa.setNome(nomeEsperado);
        String nomeRetornado = pessoa.getNome();

        assertEquals(nomeEsperado, nomeRetornado);
    }

    @Test
    void test_get_set_idade() {
        Pessoa pessoa = new Pessoa();
        int idadeEsperada = 30;

        pessoa.setIdade(idadeEsperada);
        int idadeRetornada = pessoa.getIdade();

        assertEquals(idadeEsperada, idadeRetornada);
    }

    @Test
    void test_get_set_cartao_vacina_em_dia() {
        Pessoa pessoa = new Pessoa();
        String cartaoVacinaEmDiaEsperado = "Sim";

        pessoa.setCartaoVacinaEmDia(cartaoVacinaEmDiaEsperado);
        String cartaoVacinaEmDiaRetornado = pessoa.getCartaoVacinaEmDia();

        assertEquals(cartaoVacinaEmDiaEsperado, cartaoVacinaEmDiaRetornado);
    }

    @Test
    void test_get_set_teve_sintomas_recentemente() {
        Pessoa pessoa = new Pessoa();
        String teveSintomasRecentementeEsperado = "Sim";

        pessoa.setTeveSintomasRecentemente(teveSintomasRecentementeEsperado);
        String teveSintomasRecentementeRetornado = pessoa.getTeveSintomasRecentemente();

        assertEquals(teveSintomasRecentementeEsperado, teveSintomasRecentementeRetornado);
    }

    @Test
    void test_get_set_teve_contato_com_pessoas_sintomaticas() {
        Pessoa pessoa = new Pessoa();
        String teveContatoComPessoasSintomaticasEsperado = "Sim";

        pessoa.setTeveContatoComPessoasSintomaticas(teveContatoComPessoasSintomaticasEsperado);
        String teveContatoComPessoasSintomaticasRetornado = pessoa.getTeveContatoComPessoasSintomaticas();

        assertEquals(teveContatoComPessoasSintomaticasEsperado, teveContatoComPessoasSintomaticasRetornado);
    }

    @Test
    void test_get_set_esta_retornando_viagem() {
        Pessoa pessoa = new Pessoa();
        String estaRetornandoViagemEsperado = "Sim";

        pessoa.setEstaRetornandoViagem(estaRetornandoViagemEsperado);
        String estaRetornandoViagemRetornado = pessoa.getEstaRetornandoViagem();

        assertEquals(estaRetornandoViagemEsperado, estaRetornandoViagemRetornado);
    }

    @Test
    void test_get_set_porcentagem_infeccao() {
        Pessoa pessoa = new Pessoa();
        int porcentagemInfeccaoEsperada = 50;

        pessoa.setPorcentagemInfeccao(porcentagemInfeccaoEsperada);
        int porcentagemInfeccaoRetornada = pessoa.getPorcentagemInfeccao();

        assertEquals(porcentagemInfeccaoEsperada, porcentagemInfeccaoRetornada);
    }

    @Test
    void test_get_set_orientacao_final() {
        Pessoa pessoa = new Pessoa();
        String orientacaoFinalEsperada = "Ficar em quarentena";

        pessoa.setOrientacaoFinal(orientacaoFinalEsperada);
        String orientacaoFinalRetornada = pessoa.getOrientacaoFinal();

        assertEquals(orientacaoFinalEsperada, orientacaoFinalRetornada);
    }
}





