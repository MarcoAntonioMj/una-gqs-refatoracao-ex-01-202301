package main;

import java.util.Scanner;

import main.controller.CalculoPorcentagem;
import main.model.Pessoa;
import main.view.Mensagem;
import main.view.Validacao;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoPorcentagemTest {

    @Test
    public void testCalculaPorcentagem_retornandoViagem() {
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
