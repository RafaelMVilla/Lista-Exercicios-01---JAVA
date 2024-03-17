
/*
Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volume calculado de acordo com a seguinte fórmula: 
volume = 3.14 * raio² * altura;
Exemplo: raio = 10, altura = 15. Volume = 4710
 */

public class Exercicio19 {
    
    public static void executar(){

        double raio = Prompt.lerDecimal("Digite o raio: ");
        double altura = Prompt.lerDecimal("Digite a altura: ");

        double volume = 3.14 * (raio * raio) * altura;

        Prompt.imprimir("Raio: " + raio);
        Prompt.imprimir("Altura: " + altura);
        Prompt.imprimir("Volume: " + volume);

    }
}
