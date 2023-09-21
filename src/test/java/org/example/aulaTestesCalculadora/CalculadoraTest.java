package org.example.aulaTestesCalculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void testarSoma() {
        Calculadora c = new Calculadora();
        int resultado = c.somar(2,3);
        assertEquals(5, resultado);
    }

    @Test
    public void testarSubtracao() {
        Calculadora c = new Calculadora();
        int resultado = c.subtrair(5, 2);
        assertEquals(3, resultado);
    }

    @Test
    public void testarMultiplicacao() {
        Calculadora c = new Calculadora();
        int resultado = c.multiplicar(5, 4);
        assertEquals(20, resultado);
    }

    @Test
    public void testarDivisao() {
        Calculadora c = new Calculadora();
        int resultado = c.dividir(21, 7);
        assertEquals(3, resultado);
    }

    @Test
    public void testDivisaoPorZero() {
        Calculadora c = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            c.dividir(21, 0);
        });
    }

    @Test
    public void testarVerificaoDePar() {
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificarSeEPar(2);
        assertTrue(verifica);
    }

    @Test
    public void testarVerificacaoDeImpar() {
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificarSeEImpar(37);
        assertTrue(verifica);
    }

}
