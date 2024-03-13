
/*
 Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida.
 */

public class Exercicio03 {
    
    public static void executar() {
        
        double A = Prompt.lerDecimal("Digite o primeiro valor: ");

        double B = Prompt.lerDecimal("Digite o segundo valor: ");

        if (A == B) {
            Prompt.imprimir("A sequência de números informados é inválida!");
        } else {
            Prompt.imprimir("Primeiro valor: " + A + "\nSegundo Valor: " + B);
        }
    }
}
