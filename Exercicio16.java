
/*
Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
 */

public class Exercicio16 {
    
    public static void executar(){

        double nota1 = Prompt.lerDecimal("Digite sua primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite sua segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite sua terceira nota: ");

        double media = ((nota1 + nota2 + nota3) / 3);

        Prompt.imprimir("Nota 1: " + nota1);
        Prompt.imprimir("Nota 2: " + nota2);
        Prompt.imprimir("Nota 3: " + nota3);
        Prompt.imprimir("Média: " + media);
    }
}
