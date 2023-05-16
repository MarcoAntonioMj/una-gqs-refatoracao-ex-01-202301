import java.util.Scanner;

class Programa {
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
    } // O scanner será fechado automaticamente aqui
  }
}