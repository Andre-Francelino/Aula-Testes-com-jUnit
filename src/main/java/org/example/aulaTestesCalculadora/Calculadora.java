package org.example.aulaTestesCalculadora;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int c, int d) {
        return c - d;
    }

    public int multiplicar(int x, int y) {
        return x * y;
    }

    public int dividir(int q, int r) {
        return q / r;
    }

    public Boolean verificarSeEPar(int p) {
        return p % 2 == 0;
    }

    public Boolean verificarSeEImpar(int i) {
        return i % 2 != 0;
    }

}
