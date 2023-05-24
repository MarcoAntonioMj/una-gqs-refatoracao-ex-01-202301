package com.marco.controller;

import com.marco.model.Pessoa;

public class CalculoPorcentagem {
  public void calculaPorcentagem(Pessoa pessoa) {
    if (pessoa.getEstaRetornandoViagem().equals("SIM")) {
      pessoa.setPorcentagemInfeccao(pessoa.getPorcentagemInfeccao() + 30);
    }

    if (pessoa.getCartaoVacinaEmDia().equals("NAO")) {
      pessoa.setPorcentagemInfeccao(pessoa.getPorcentagemInfeccao() + 10);
    }

    if (pessoa.getTeveSintomasRecentemente().equals("SIM")) {
      pessoa.setPorcentagemInfeccao(pessoa.getPorcentagemInfeccao() + 30);
    }

    if (pessoa.getTeveContatoComPessoasSintomaticas().equals("SIM")) {
      pessoa.setPorcentagemInfeccao(pessoa.getPorcentagemInfeccao() + 30);
    }
  }
}


