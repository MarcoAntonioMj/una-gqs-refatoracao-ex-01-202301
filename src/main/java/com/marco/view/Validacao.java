package com.marco.view;

import java.util.Scanner;

import com.marco.controller.CalculoPorcentagem;
import com.marco.model.Pessoa;

public class Validacao {
    public void calcularValidacaoFinal(Pessoa pessoa, boolean erroTentativas) {
        // Valido se imprimo a mensagem de erro
        if (erroTentativas) {
            Mensagem.imprimirMensagemErro();
            return;
        }

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        String orientacaoFinal = pessoa.getEstaRetornandoViagem().equalsIgnoreCase("SIM")
                ? "Você ficará sob observação por 05 dias. "
                : "";

        if (pessoa.getPorcentagemInfeccao() <= 30) {
            orientacaoFinal += "Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
        } else if (pessoa.getPorcentagemInfeccao() <= 60) {
            orientacaoFinal += "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
        } else if (pessoa.getPorcentagemInfeccao() <= 89) {
            orientacaoFinal += "Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.";
        } else {
            orientacaoFinal += "Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
        }

        pessoa.setOrientacaoFinal(orientacaoFinal);
        Mensagem.imprimirRelatorioFinal(pessoa);
    }

    public void validacaoDasProximasPerguntas(Pessoa pessoa, boolean erroTentativas, Scanner scanner) {
        if (erroTentativas) {
            Mensagem.imprimirMensagemErro();
            return;
        }

        Mensagem mensagem = new Mensagem();
        mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);
        mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);
        mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);
    }
}

