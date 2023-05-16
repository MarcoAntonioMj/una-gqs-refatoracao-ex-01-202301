import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");

    pessoa.coletaNome(sc);
    pessoa.coletaIdade(sc);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa);

    validacao.validacaoDasProximasPerguntas(pessoa);

    validacao.calcularValidacaoFinal(erroTentativass);

    // scanner.close();
  }
}