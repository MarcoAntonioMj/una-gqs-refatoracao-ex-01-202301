package com.marco;

import java.util.Scanner;

import com.marco.model.Pessoa;
import com.marco.view.Mensagem;
import com.marco.view.Validacao;

public class Programa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\tRelatório Auxiliar de Controle de Infecções");

            Pessoa pessoa = coletarInformacoesPessoa(scanner);
            Mensagem mensagem = new Mensagem();

            boolean erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa, scanner);

            Validacao validacao = new Validacao();

            validacao.validacaoDasProximasPerguntas(pessoa, erroTentativas, scanner);

            validacao.calcularValidacaoFinal(pessoa, erroTentativas);

        } // O scanner será fechado automaticamente aqui
    }

    public static Pessoa coletarInformacoesPessoa(Scanner scanner) {
        Pessoa pessoa = new Pessoa();
        pessoa.coletaNome(scanner);
        pessoa.coletaIdade(scanner);
        return pessoa;
    }
}


