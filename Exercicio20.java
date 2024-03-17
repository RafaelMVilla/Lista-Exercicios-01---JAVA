
/*
Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média da viagem.
 */

public class Exercicio20 {
    
    public static void executar(){

        int tempo = Prompt.lerInteiro("Digite o tempo da viagem (horas): ");
        double velocidademedia = Prompt.lerDecimal("Digite a velocidade média da viagem (km / h): ");
        int consumo = 12;
        double distancia = velocidademedia * tempo;

        double litrosgastos = distancia / consumo;

        Prompt.imprimir("Distância  percorrida: " + distancia + "km");
        Prompt.imprimir("Litros gastos: " + litrosgastos + "litros");
    }
}
