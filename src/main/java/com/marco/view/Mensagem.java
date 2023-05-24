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
        pessoa.setCartaoVacinaEmDia(lerRespostaValida(scanner));
        return contador == MAX_TENTATIVAS;
    }

    public boolean realizaPerguntaTeveSintomasRecenmente(Pessoa pessoa, Scanner scanner) {
        System.out.println(
                "\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
        pessoa.setTeveSintomasRecentemente(lerRespostaValida(scanner));
        return contador == MAX_TENTATIVAS;
    }

    public boolean realizaPerguntaTeveContatoPessoasAssintomaticas(Pessoa pessoa, Scanner scanner) {
        System.out.println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?");
        pessoa.setTeveContatoComPessoasSintomaticas(lerRespostaValida(scanner));
        return contador == MAX_TENTATIVAS;
    }

    public boolean realizaPerguntaEstaRetornandoViagemExterior(Pessoa pessoa, Scanner scanner) {
        System.out.println("\nEstá retornando de viagem do exterior?");
        pessoa.setEstaRetornandoViagem(lerRespostaValida(scanner));
        return contador == MAX_TENTATIVAS;
    }

    public static void imprimirMensagemErro() {
        System.out.println(
                "Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
        System.exit(0);
    }

    public static void imprimirRelatorioFinal(Pessoa pessoa) {
        System.out.println("\nNome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Cartão Vacinal em Dia: " + pessoa.getCartaoVacinaEmDia());
        System.out.println("Teve sintomas recentemente: " + pessoa.getTeveSintomasRecentemente());
        System.out.println("Teve contato com pessoas infectadas: " + pessoa.getTeveContatoComPessoasSintomaticas());
        System.out.println("Está retornando de viagem: " + pessoa.getEstaRetornandoViagem());
        System.out.println("Porcentagem infecção: " + pessoa.getPorcentagemInfeccao());
        System.out.println("Orientação Final: " + pessoa.getOrientacaoFinal());
    }

}

