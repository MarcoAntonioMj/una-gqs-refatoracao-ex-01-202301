import java.util.Scanner;

public class Pessoa {
  public int idade;
  public String cartaoVacinaEmDia;
  public String teveSintomasRecentemente;
  public String teveContatoComPessoasSintomaticas;
  public String estaRetornandoViagem;
  public int porcentagemInfeccao;
  public String orientacaoFinal;
  public String nome; 
  
    public void coletaNome(Scanner scanner) {
    System.out.println("\nInforme o seu nome: ");
    nome = scanner.nextLine();
    }
   

  public void coletaIdade(Scanner scanner) {
    System.out.println("\nInforme a sua idade: ");
    idade = scanner.nextInt();
  }


  public int getIdade() {
    return idade;
  }


  public void setIdade(int idade) {
    this.idade = idade;
  }


  public String getCartaoVacinaEmDia() {
    return cartaoVacinaEmDia;
  }


  public void setCartaoVacinaEmDia(String cartaoVacinaEmDia) {
    this.cartaoVacinaEmDia = cartaoVacinaEmDia;
  }


  public String getTeveSintomasRecentemente() {
    return teveSintomasRecentemente;
  }


  public void setTeveSintomasRecentemente(String teveSintomasRecentemente) {
    this.teveSintomasRecentemente = teveSintomasRecentemente;
  }


  public String getTeveContatoComPessoasSintomaticas() {
    return teveContatoComPessoasSintomaticas;
  }


  public void setTeveContatoComPessoasSintomaticas(String teveContatoComPessoasSintomaticas) {
    this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
  }


  public String getEstaRetornandoViagem() {
    return estaRetornandoViagem;
  }


  public void setEstaRetornandoViagem(String estaRetornandoViagem) {
    this.estaRetornandoViagem = estaRetornandoViagem;
  }


  public int getPorcentagemInfeccao() {
    return porcentagemInfeccao;
  }


  public void setPorcentagemInfeccao(int porcentagemInfeccao) {
    this.porcentagemInfeccao = porcentagemInfeccao;
  }


  public String getOrientacaoFinal() {
    return orientacaoFinal;
  }


  public void setOrientacaoFinal(String orientacaoFinal) {
    this.orientacaoFinal = orientacaoFinal;
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }
  
}
