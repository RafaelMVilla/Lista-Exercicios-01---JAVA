
/*
 Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.
 */

public class Exercicio04 {
    
    public static void executar(){

        double valor1 = Prompt.lerDecimal("Digite o primeiro número: ");

        double valor2 = Prompt.lerDecimal("Digite o segundo número: ");

        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;

        Prompt.imprimir("Soma: " + soma);
        Prompt.imprimir("Subtração: " + subtracao);
        Prompt.imprimir("Multiplicação: " + multiplicacao);
        Prompt.imprimir("Divisão: " + divisao);
    }
}
