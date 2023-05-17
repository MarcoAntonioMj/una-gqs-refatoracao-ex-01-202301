package com.marco;

import org.junit.jupiter.api.Test;

import com.marco.controller.CalculoPorcentagem;
import com.marco.model.Pessoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testCalculaPorcentagem_retornandoViagem() {
        Pessoa pessoa = new Pessoa();
        pessoa.estaRetornandoViagem = "SIM";
        pessoa.cartaoVacinaEmDia = "SIM";
        pessoa.teveSintomasRecentemente = "NAO";
        pessoa.teveContatoComPessoasSintomaticas = "NAO";

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(30, pessoa.porcentagemInfeccao);
        assertEquals("Você ficará sob observação por 05 dias.", pessoa.orientacaoFinal);
    }
}
