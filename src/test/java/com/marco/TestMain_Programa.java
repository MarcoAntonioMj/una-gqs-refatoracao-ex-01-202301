package com.marco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.marco.model.Pessoa;

public class TestMain_Programa {

    @Test
    public void testColetaNome() {
        String input = "Marco";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.coletaNome(scanner);

        assertEquals("Marco", pessoa.getNome());
    }

    @Test
    public void testColetaIdade() {
        String input = "30";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.coletaIdade(scanner);

        assertEquals(30, pessoa.getIdade());
    }
}
