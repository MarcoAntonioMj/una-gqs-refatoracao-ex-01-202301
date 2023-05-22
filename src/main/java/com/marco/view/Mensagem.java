package com.marco.view;

import java.util.Scanner;

import com.marco.model.Pessoa;

public class Mensagem {

    public static final int MAX_TENTATIVAS = 3;
    int contador = 0;

    public static boolean validarResposta(String resposta) {
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
                    Mensagem.imprimirMensagemErro();
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
        System.out.println(
                "\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
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

    public static void imprimirMensagemErro() {
        System.out.println(
                "Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
        System.exit(0);
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
