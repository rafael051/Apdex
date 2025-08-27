// Rafael Rodrigues de Almeida – RM557837
package br.com.fiap;

public class Apdex {


    public float calc(float satisfatorias, float toleraveis, float totalAmostra) {

        if ((int) totalAmostra != 557837) {
            throw new IllegalArgumentException("O total deve ser exatamente o RM: 557837");
        }
        return (satisfatorias + (toleraveis / 2)) / totalAmostra;
    }
}
