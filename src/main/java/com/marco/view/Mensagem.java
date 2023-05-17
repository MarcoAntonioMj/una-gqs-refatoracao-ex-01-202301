package com.marco.view;

import java.util.Scanner;

import com.marco.model.Pessoa;

public class Mensagem {

  private static final int MAX_TENTATIVAS = 3;
  int contador = 0;

  private static boolean validarResposta(String resposta) {
    return resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("NAO");
  }

  public static String lerRespostaValida(Scanner scanner) {
    int contador = 0;
    String resposta;

    do {
      System.out.print("Digite SIM ou NAO: ");
      resposta = scanner.next().toUpperCase();

      if (validarResposta(resposta)) {
        break;
      } else {
        contador++;
        System.out.println("Resposta inválida! Digite SIM ou NAO.");
        if (contador == MAX_TENTATIVAS) {
          break;
        }
      }
    } while (true);

    return resposta;
  }

  public boolean realizaPerguntaVacinaEmDia(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nSeu cartão de vacina está em dia?");
    pessoa.cartaoVacinaEmDia = lerRespostaValida(scanner);
    return contador == MAX_TENTATIVAS;
  }

  public boolean realizaPerguntaTeveSintomasRecenmente(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
    pessoa.teveSintomasRecentemente = lerRespostaValida(scanner);
    return contador == MAX_TENTATIVAS;
  }

  public boolean realizaPerguntaTeveContatoPessoasAssintomaticas(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?");
    pessoa.teveContatoComPessoasSintomaticas = lerRespostaValida(scanner);
    return contador == MAX_TENTATIVAS;
  }

  public boolean realizaPerguntaEstaRetornandoViagemExterior(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nEstá retornando de viagem do exterior?");
    pessoa.estaRetornandoViagem = lerRespostaValida(scanner);
    return contador == MAX_TENTATIVAS;
  }

  public void imprimirMensagemErro() {
    System.out.println("Não foi possível realizar a validação. Por favor, verifique suas respostas e tente novamente.");
  }
}
