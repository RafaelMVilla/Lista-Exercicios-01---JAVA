
/*
Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
F = (9 * C + 160) / 5
 */

public class Exercicio06 {
    
    public static void executar(){

        double temperatura = Prompt.lerDecimal("DIgite a temperatura em Celsius: ");

        double fahrenheit;

        fahrenheit = ((9 * temperatura + 160) / 5);

        Prompt.imprimir("Temperatura em Celsius: " + temperatura);
        Prompt.imprimir("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
