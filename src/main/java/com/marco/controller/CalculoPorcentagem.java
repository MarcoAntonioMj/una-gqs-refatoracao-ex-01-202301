package com.marco.controller;

import com.marco.model.Pessoa;

;

public class CalculoPorcentagem {
  public void calculaPorcentagem(Pessoa pessoa) {
    if (pessoa.estaRetornandoViagem.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }

    if (pessoa.cartaoVacinaEmDia.equals("NAO")) {
      pessoa.porcentagemInfeccao += 10;
    }

    if (pessoa.teveSintomasRecentemente.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }

    if (pessoa.teveContatoComPessoasSintomaticas.equals("SIM")) {
      pessoa.porcentagemInfeccao += 30;
    }
  }
}

