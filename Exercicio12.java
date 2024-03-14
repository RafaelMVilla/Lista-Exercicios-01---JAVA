
/*
Escreva um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido.
 */

public class Exercicio12 {
    
    public static void executar(){

        int num1 = Prompt.lerInteiro("Digite o número do mês: ");

        if (num1 < 1 || num1 > 12) {
            Prompt.imprimir("Digite um número correspondente aos meses do ano (1 - 12).");
        } else {
            switch (num1) {
                case 1:
                    Prompt.imprimir("Mês digitado: JANEIRO");
                    break;
                case 2:
                    Prompt.imprimir("Mês digitado: FEVEREIRO");
                    break;
                case 3:
                    Prompt.imprimir("Mês digitado: MARÇO");
                    break;
                case 4:
                    Prompt.imprimir("Mês digitado: ABRIL");
                    break;
                case 5:
                    Prompt.imprimir("Mês digitado: MAIO");
                    break;
                case 6:
                    Prompt.imprimir("Mês digitado: JUNHO");
                    break;
                case 7:
                    Prompt.imprimir("Mês digitado: JULHO");
                    break;
                case 8:
                    Prompt.imprimir("Mês digitado: AGOSTO");
                    break;
                case 9:
                    Prompt.imprimir("Mês digitado: SETEMBRO");
                    break;
                case 10:
                    Prompt.imprimir("Mês digitado: OUTUBRO");
                    break;
                case 11:
                    Prompt.imprimir("Mês digitado: NOVEMBRO");
                    break;
                case 12:
                    Prompt.imprimir("Mês digitado: DEZEMBRO");
                    break;
            
                default:
                    break;
            }
        }
    }
}
