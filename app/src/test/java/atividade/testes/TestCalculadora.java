package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
class TestCalculadora {
    @Test
    void testSomar() {
        // Teste de Soma (Adição)
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void testSubtrair() {
        // Teste de Subtração
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    void testMultiplicar() {
        // Teste de Multiplicação
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(6, 7);
        assertEquals(42, resultado);
    }

    @Test
    void testDividir() {
        // Teste de Divisão
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(20, 4);
        assertEquals(5, resultado);
    }

    @Test
    void testDividirPorZero() {
        // Teste de Divisão por Zero (deve lançar uma exceção)
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }

    @Test
    void testValoresNegativos() {
        // Teste de valores negativos
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(4, 10);
        assertEquals(-6, resultado);
    }
}
