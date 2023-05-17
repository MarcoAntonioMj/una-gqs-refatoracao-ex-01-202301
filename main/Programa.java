package main;

import java.util.Scanner;

import main.model.Pessoa;
import main.view.Mensagem;
import main.view.Validacao;

public class Programa {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      boolean erroTentativas = false;
      Pessoa pessoa = new Pessoa();
      Mensagem mensagem = new Mensagem();
      Validacao validacao = new Validacao();

      System.out.println("\tRelatório Auxiliar de Controle de Infecções");

      pessoa.coletaNome(scanner);
      pessoa.coletaIdade(scanner);

      erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa, scanner);

      validacao.validacaoDasProximasPerguntas(mensagem, pessoa, erroTentativas, scanner);

      validacao.calcularValidacaoFinal(pessoa, mensagem, erroTentativas);

      Programa.imprimirRelatorioFinal(pessoa); // Adicionei esta linha para imprimir o relatório final
    } // O scanner será fechado automaticamente aqui
  }

  public static void imprimirRelatorioFinal(Pessoa pessoa) {
    System.out.println("\nNome: " + pessoa.nome);
    System.out.println("Idade: " + pessoa.idade + " anos");
    System.out.println("Cartão Vacinal em Dia: " + pessoa.cartaoVacinaEmDia);
    System.out.println("Teve sintomas recentemente: " + pessoa.teveSintomasRecentemente);
    System.out.println("Teve contato com pessoas infectadas: " + pessoa.teveContatoComPessoasSintomaticas);
    System.out.println("Está retornando de viagem: " + pessoa.estaRetornandoViagem);
    System.out.println("Porcentagem infecção: " + pessoa.porcentagemInfeccao);
    System.out.println("Orientação Final: " + pessoa.orientacaoFinal);
  }
}