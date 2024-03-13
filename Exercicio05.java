
/*
Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A. Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.
 */

public class Exercicio05 {
    
    public static void executar(){

        double valor1 = Prompt.lerDecimal("Digite o primeiro número: ");

        double valor2 = Prompt.lerDecimal("Digite o segundo número: ");

        double coringa1;
        double coringa2;

        coringa1 = valor1; 

        coringa2 = valor2;

        Prompt.imprimir("VALORES ORIGINAIS:");
        Prompt.imprimir("Valor1: " + valor1);
        Prompt.imprimir("Valor2: " + valor2);
        Prompt.imprimir("VALORES TROCADOS: ");
        Prompt.imprimir("Valor1: " + coringa2);
        Prompt.imprimir("Valor2: " + coringa1);

    }
}
