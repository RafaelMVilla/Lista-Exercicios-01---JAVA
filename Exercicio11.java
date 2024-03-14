
/*
Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente.
 */

public class Exercicio11 {
    
    public static void executar(){

        int valor1 = Prompt.lerInteiro("Digite 3 números distintos: \n Valor 1: ");
        int valor2 = Prompt.lerInteiro("Valor 2: ");
        int valor3 = Prompt.lerInteiro("Valor 3: ");

        int maior = 0;
        int meio;
        int menor = 0;

        ////////// MAIOR VALOR ////////////
        if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
            Prompt.imprimir("Eu pedi 3 valores DISTINTOS, por favor.");
        } else if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else if (valor3 > valor1 && valor3 > valor2) {
            maior = valor3;
        }
        ////////// MENOR VALOR ////////////
        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else if (valor3 < valor1 && valor3 < valor2) {
            menor = valor3;
        }
        ////////// VALOR MEIO  ////////////
        meio = valor1 + valor2 + valor3 - menor - maior;

        Prompt.imprimir("Valores em ordem Crescente: \n" + menor + "," + meio + "," + maior);
    }
}
