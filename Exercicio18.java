
/*
Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.

                              3
Média harmônica = --------------------------
                    1       1       1
                  ----- + ----- + -----
                  nota1   nota2   nota3

Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
Média: 7.37
 */

public class Exercicio18 {
    
    public static void executar(){

        double nota1 = Prompt.lerDecimal("Digite sua primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite sua segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite sua terceira nota: ");
        
        double mediaharmonica = (3 / ((1 / nota1) + (1 / nota2) + (1 / nota3)));

        Prompt.imprimir("Nota 1: " + nota1);
        Prompt.imprimir("Nota 2: " + nota2);
        Prompt.imprimir("Nota 3: " + nota3);
        Prompt.imprimir("Média harmônica: " + mediaharmonica);
    }
}
