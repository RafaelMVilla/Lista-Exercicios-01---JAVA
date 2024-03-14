
/*
Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo o usuário também deverá ser informado.
 */

public class Exercicio07 {
    
    public static void executar(){

        double valor1 = Prompt.lerDecimal("Informe o número: ");

        if (valor1 >= 100 && valor1 <= 200) {
            Prompt.imprimir("O número informado está no intervalo entre (100 - 200)");
        } else {
            Prompt.imprimir("Seu número está fora do intervalo de (100 - 200)");
        }
    }
}
