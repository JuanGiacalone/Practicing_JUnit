package Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        int resultado = Calculadora.suma(2,3);
        int esperado = 5 ; // 2 + 3
        assertEquals(esperado,resultado);
    }

    @Test
    void resta() {
        int resultado = Calculadora.resta(3,2);
        int esperado = 1 ; // 3 - 2
        assertEquals(esperado,resultado);
    }
}