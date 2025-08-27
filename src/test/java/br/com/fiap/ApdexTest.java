// Rafael Rodrigues de Almeida – RM557837
package br.com.fiap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApdexTest {

    private Apdex apdex;


    @BeforeEach
    public void arrange() {
        this.apdex = new Apdex();
    }

    @Test
    public void ValidationApdexExcelente() {
        //act  (~0.95 com TOTAL = 557837)
        float result = apdex.calc(529945, 0, 557837);
        //assert
        assertEquals(0.95, result, 0.01);
    }

    @Test
    public void ValidationApdexBom() {
        float result = apdex.calc(392000, 165000, 557837);
        assertTrue(result >= 0.85 && result <= 0.93);
    }

    @Test
    public void ValidationApdexRazoavel() {
        float result = apdex.calc(224000, 333000, 557837);
        assertTrue(result >= 0.70 && result <= 0.84);
    }

    @Test
    public void ValidationApdexRuim() {
        float result = apdex.calc(1000, 556000, 557837);
        assertTrue(result >= 0.50 && result <= 0.69);
    }

    @Test
    public void ValidationApdexInaceitavel() {
        float result = apdex.calc(0, 0, 557837);
        assertTrue(result >= 0.00 && result <= 0.49);
    }
}
