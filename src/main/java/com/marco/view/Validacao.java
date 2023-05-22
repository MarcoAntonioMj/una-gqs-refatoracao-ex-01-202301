package com.marco.view;
import java.util.Scanner;

import com.marco.Programa;
import com.marco.controller.CalculoPorcentagem;
import com.marco.model.Pessoa;

public class Validacao {
    public void calcularValidacaoFinal(Pessoa pessoa, Mensagem mensagem, boolean erroTentativas) {
        // Valido se imprimo a mensagem de erro
        if (erroTentativas) {
          Mensagem.imprimirMensagemErro();
          return;
        }

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        String orientacaoFinal = pessoa.estaRetornandoViagem.equalsIgnoreCase("SIM")
          ? "Você ficará sob observação por 05 dias. "
          : "";

        if (pessoa.porcentagemInfeccao <= 30) {
          orientacaoFinal += "Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
        } else if (pessoa.porcentagemInfeccao <= 60) {
          orientacaoFinal += "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
        } else if (pessoa.porcentagemInfeccao <= 89) {
          orientacaoFinal += "Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.";
        } else {
          orientacaoFinal += "Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
        }

        pessoa.orientacaoFinal = orientacaoFinal;
        Mensagem.imprimirRelatorioFinal(pessoa);
      }

      public void validacaoDasProximasPerguntas(Mensagem mensagem, Pessoa pessoa, boolean erroTentativas, Scanner scanner) {
        if (erroTentativas) {
          Mensagem.imprimirMensagemErro();
          return;
        }

        mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);
        mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);
        mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);
      }

}
