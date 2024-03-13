/*
 Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número menor ou igual a 10!”, caso este número seja menor ou igual.
 */


public class Exercicio01 {
    
    public static void main(String[] args) {
        
        double valor = Prompt.lerDecimal("Digite o seu número: ");

        if (valor > 10) {
            Prompt.imprimir("Número maior do que 10!");
        } else {
            Prompt.imprimir("Número menor ou igual a 10!");
        }
    }
}
