
/*
Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra variável do tipo CARACTERE. Imprima o resultado da operação de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma mensagem de operador não definido. Tratar erro de divisão por zero.
 */

public class Exercicio13 {
    
    public static void executar(){

        double valorA = Prompt.lerDecimal("Digite o primeiro número: ");
        double valorB = Prompt.lerDecimal("Digite o segundo número: ");
        double valorfinal;
        String caractere = Prompt.lerLinha("Digite o Operador lógico (+ , - , * , /): ");
        
        if (caractere.equals("+")) {
            valorfinal = valorA + valorB;
            Prompt.imprimir("Resultado da soma: " + valorfinal);
        }else if (caractere.equals("-")) {
            valorfinal = valorA - valorB;
            Prompt.imprimir("Resultado da subtração: " + valorfinal);
        }else if (caractere.equals("*")) {
            valorfinal = valorA * valorB;
            Prompt.imprimir("Resultado da multiplicação: " + valorfinal);
        }else if (caractere.equals("/")) {
            
            if (valorA == 0 || valorB == 0) {
                Prompt.imprimir("Erro! Divisão inválida.");
            }else {
            valorfinal = valorA / valorB;
            Prompt.imprimir("Resultado da divisão: " + valorfinal);
            }
        }else {
            Prompt.imprimir("Operador Inválido ou não definido.");
        }

    }
}
