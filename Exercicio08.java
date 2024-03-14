
/*
Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou igual a 50, outra se ele for menor que 50.
 */

public class Exercicio08 {
    
    public static void executar(){

        double valor1 = Prompt.lerDecimal("Digite um número: ");

        if (valor1 >= 50) {
            Prompt.imprimir("O número digitado é maior ou igual a 50.");
        }else {
            Prompt.imprimir("O número digitado é menor do que 50.");
        }
    }
}
