
/*
Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”.
 */

public class Exercicio10 {
    
    public static void executar(){

        int valor1 = Prompt.lerInteiro("Digite um valor entre 1 e 5:");

        if (valor1 < 1 || valor1 > 5) {
            Prompt.imprimir("O número informado está forá do intevalo de 1 a 5!");
        } else {
            switch (valor1) {
                case 1:
                Prompt.imprimir("O número digitado é o: Um.");
                    break;
                case 2:
                Prompt.imprimir("O número digitado é o: Dois.");
                    break;
                case 3:
                Prompt.imprimir("O número digitado é o: Três.");
                    break;
                case 4:
                Prompt.imprimir("O número digitado é o: Quatro.");
                    break;
                case 5:
                Prompt.imprimir("O número digitado é o: Cinco.");
                default:
                    break;
            }
        }
    }
}
