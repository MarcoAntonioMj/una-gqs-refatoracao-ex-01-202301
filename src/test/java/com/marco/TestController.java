package com.marco;

import org.junit.jupiter.api.Test;
import com.marco.controller.CalculoPorcentagem;
import com.marco.model.Pessoa;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestController {
    @Test
    void testCalculaPorcentagem_1_possibilidade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstaRetornandoViagem("SIM");
        pessoa.setCartaoVacinaEmDia("SIM");
        pessoa.setTeveSintomasRecentemente("SIM");
        pessoa.setTeveContatoComPessoasSintomaticas("SIM");

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(90, pessoa.getPorcentagemInfeccao());
    }
     @Test
    void testCalculaPorcentagem_2_possibilidade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstaRetornandoViagem("SIM");
        pessoa.setCartaoVacinaEmDia("SIM");
        pessoa.setTeveSintomasRecentemente("SIM");
        pessoa.setTeveContatoComPessoasSintomaticas("NAO");

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(60, pessoa.getPorcentagemInfeccao());
    }
     @Test
    void testCalculaPorcentagem_3_possibilidade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstaRetornandoViagem("SIM");
        pessoa.setCartaoVacinaEmDia("SIM");
        pessoa.setTeveSintomasRecentemente("NAO");
        pessoa.setTeveContatoComPessoasSintomaticas("NAO");

        CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
        calculoPorcentagem.calculaPorcentagem(pessoa);

        assertEquals(30, pessoa.getPorcentagemInfeccao());
    }
    @Test
void testCalculaPorcentagem_4_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("SIM");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("NAO");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(70, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_5_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("SIM");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("SIM");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(100, pessoa.getPorcentagemInfeccao());
}

@Test
void testCalculaPorcentagem_6_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("SIM");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("SIM");
    pessoa.setTeveContatoComPessoasSintomaticas("NAO");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(70, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_7_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("SIM");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("NAO");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(70, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_8_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("SIM");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("NAO");
    pessoa.setTeveContatoComPessoasSintomaticas("NAO");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(40, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_9_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("SIM");
    pessoa.setTeveSintomasRecentemente("SIM");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(60, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_10_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("SIM");
    pessoa.setTeveSintomasRecentemente("SIM");
    pessoa.setTeveContatoComPessoasSintomaticas("NAO");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(30, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_11_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("SIM");
    pessoa.setTeveSintomasRecentemente("NAO");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(30, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_12_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("SIM");
    pessoa.setTeveSintomasRecentemente("NAO");
    pessoa.setTeveContatoComPessoasSintomaticas("NAO");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(0, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_13_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("SIM");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(70, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_14_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("SIM");
    pessoa.setTeveContatoComPessoasSintomaticas("NAO");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(40, pessoa.getPorcentagemInfeccao());
}
@Test
void testCalculaPorcentagem_15_possibilidade() {
    Pessoa pessoa = new Pessoa();
    pessoa.setEstaRetornandoViagem("NAO");
    pessoa.setCartaoVacinaEmDia("NAO");
    pessoa.setTeveSintomasRecentemente("NAO");
    pessoa.setTeveContatoComPessoasSintomaticas("SIM");

    CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
    calculoPorcentagem.calculaPorcentagem(pessoa);

    assertEquals(40, pessoa.getPorcentagemInfeccao());
}
}
