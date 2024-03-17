
/*
Elabore um algoritmo que receba três notas de um aluno os pesos referentes a cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada:

Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3
                  ---------------------------------------------
                            peso1 + peso2 + peso3

Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
Média ponderada = 8.25
 */

public class Exercicio17 {
    
    public static void executar(){

        double nota1 = Prompt.lerDecimal("Digite sua primeira nota: ");
        int peso1 = Prompt.lerInteiro("Digite o peso referente a primeira nota: ");

        double nota2 = Prompt.lerDecimal("Digite sua segunda nota: ");
        int peso2 = Prompt.lerInteiro("Digite o peso referente a segunda nota: ");

        double nota3 = Prompt.lerDecimal("Digite sua terceira nota: ");
        int peso3 = Prompt.lerInteiro("Digite o peso referente a terceira nota: ");

        double mediaponderada = (((nota1 * peso1) + (nota2 * peso2)+ (nota3 * peso3)) / (peso1 + peso2 + peso3));

        Prompt.imprimir("Nota1: " + nota1);
        Prompt.imprimir("Nota2: " + nota2);
        Prompt.imprimir("Nota3: " + nota3);
        Prompt.imprimir("Peso1: " + peso1);
        Prompt.imprimir("Peso2: " + peso2);
        Prompt.imprimir("Peso3: " + peso3);
        Prompt.imprimir("Média Ponderada: " + mediaponderada);
    }
}
