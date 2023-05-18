package com.marco.view;
import java.util.Scanner;

import com.marco.Programa;
import com.marco.controller.CalculoPorcentagem;
import com.marco.model.Pessoa;

public class Validacao {
  public void calcularValidacaoFinal(Pessoa pessoa, Mensagem mensagem, boolean erroTentativas) {
    // Valido se imprimo a mensagem de erro
    if (erroTentativas) {
      mensagem.imprimirMensagemErro();
    } else {
      CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
      calculoPorcentagem.calculaPorcentagem(pessoa);

      // Verifico se a pessoa está retornando de viagem
      if (pessoa.estaRetornandoViagem.equalsIgnoreCase("SIM")) {
        pessoa.orientacaoFinal = "Você ficará sob observação por 05 dias.";
        if (pessoa.porcentagemInfeccao <= 30) {
          pessoa.orientacaoFinal += " Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
        } else if (pessoa.porcentagemInfeccao <= 60) {
          pessoa.orientacaoFinal += " Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
        } else if (pessoa.porcentagemInfeccao <= 89) {
          pessoa.orientacaoFinal += " Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.";
        } else {
          pessoa.orientacaoFinal += " Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
        }
        Programa.imprimirRelatorioFinal(pessoa);

      } else {
        if (pessoa.porcentagemInfeccao <= 30) {
          pessoa.orientacaoFinal = "Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
        } else if (pessoa.porcentagemInfeccao <= 60) {
          pessoa.orientacaoFinal = "Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
        } else if (pessoa.porcentagemInfeccao <= 89) {
          pessoa.orientacaoFinal = "Paciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.";
        } else {
          pessoa.orientacaoFinal = "Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.";
        }
        Programa.imprimirRelatorioFinal(pessoa);
      }
    }
  }

  public void validacaoDasProximasPerguntas(Mensagem mensagem, Pessoa pessoa, boolean erroTentativas, Scanner scanner) {
    // Valido se continuo perguntando ou se vou direto para a mensagem final
    if (!erroTentativas)
      erroTentativas = mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);

    if (!erroTentativas) {
      erroTentativas = mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);
    }

    if (!erroTentativas) {
      erroTentativas = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa, scanner);
    }
  }
}
