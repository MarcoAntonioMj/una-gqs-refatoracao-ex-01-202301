package com.marco;

import com.marco.view.Mensagem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestView_Mensagem {

    @Test
    void testValidarResposta_RespostaValida_DeveRetornarTrue() {
        String respostaValida = "SIM";

        boolean resultado = Mensagem.validarResposta(respostaValida);

        assertTrue(resultado);
    }

    @Test
    void testValidarResposta_RespostaInvalida_DeveRetornarFalse() {
        String respostaInvalida = "TESTE";

        boolean resultado = Mensagem.validarResposta(respostaInvalida);

        assertFalse(resultado);
    }

    @Test
    void testLerRespostaValida_RespostaInvalidaSeguidaDeRespostaValida_DeveRetornarRespostaValida() {
        String respostaInvalida = "TESTE";
        String respostaValida = "NAO";
        String input = respostaInvalida + System.lineSeparator() + respostaValida;
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        Scanner scanner = new Scanner(System.in);

        String resposta = Mensagem.lerRespostaValida(scanner);

        assertEquals(respostaValida, resposta);
    }

    @Test
    void testLerRespostaValida_RespostaValida_DeveRetornarResposta() {
        String respostaValida = "SIM";
        InputStream inputStream = new ByteArrayInputStream(respostaValida.getBytes());
        System.setIn(inputStream);
        Scanner scanner = new Scanner(System.in);

        String resposta = Mensagem.lerRespostaValida(scanner);

        assertEquals(respostaValida, resposta);
    }

    @Test
    void testImprimirMensagemErro() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Mensagem mensagem = new Mensagem();
        mensagem.imprimirMensagemErro();

        String mensagemErro = outputStream.toString().trim();

        assertEquals(
                "Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.",
                mensagemErro);
    }

}
