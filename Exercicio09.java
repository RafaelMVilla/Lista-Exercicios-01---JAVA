
/*
Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. Caso sejam diferentes, informe que são diferentes e qual número é o maior.
 */

public class Exercicio09 {
    
    public static void executar(){

        double valor1 = Prompt.lerDecimal("Digite o primeiro valor: ");

        double valor2 = Prompt.lerDecimal("Digite o segundo número: ");

        if (valor1 == valor2) {
            Prompt.imprimir("Os números digitados são iguais.");
        } else if (valor1 > valor2) {
            Prompt.imprimir("Os números digitados são diferentes.");
            Prompt.imprimir("Valor maior: " + valor1);
            Prompt.imprimir("Valor menor: " + valor2);
        } else {
            Prompt.imprimir("Os números digitados são diferentes.");
            Prompt.imprimir("Valor maior: " + valor2);
            Prompt.imprimir("Valor menor: " + valor1);
        }
    }
}
