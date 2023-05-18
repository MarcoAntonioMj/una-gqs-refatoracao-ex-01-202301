package com.marco;

import org.junit.jupiter.api.Test;
import com.marco.controller.CalculoPorcentagem;
import com.marco.model.Pessoa;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testCalculaPorcentagem_teveSintomasRecentemente() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstaRetornandoViagem("NAO");
        pessoa.setCartaoVacinaEmDia("NAO");
        pessoa.setTeveSintomasRecentemente("SIM");
        pessoa.setTeveContatoComPessoasSintomaticas("NAO");

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(40, pessoa.getPorcentagemInfeccao());
    }

    @Test
    void testCalculaPorcentagem_teveContatoComPessoasSintomaticas() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstaRetornandoViagem("NAO");
        pessoa.setCartaoVacinaEmDia("NAO");
        pessoa.setTeveSintomasRecentemente("NAO");
        pessoa.setTeveContatoComPessoasSintomaticas("SIM");

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(40, pessoa.getPorcentagemInfeccao());
    }

    @Test
    void testCalculaPorcentagem_nenhumFatorDeRisco() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstaRetornandoViagem("NAO");
        pessoa.setCartaoVacinaEmDia("SIM");
        pessoa.setTeveSintomasRecentemente("NAO");
        pessoa.setTeveContatoComPessoasSintomaticas("NAO");

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(0, pessoa.getPorcentagemInfeccao());
    }
}
