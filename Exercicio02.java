
/*
 Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.
 */

public class Exercicio02 {
    

    public static void main(String[] args) {
        
        double valor1 = Prompt.lerDecimal("Digite o primeiro número: ");

        double valor2 = Prompt.lerDecimal("Digite o segundo número: ");

        double soma = valor1 + valor2;

        Prompt.imprimir("O resultado da soma é: " + soma);
    }
}
