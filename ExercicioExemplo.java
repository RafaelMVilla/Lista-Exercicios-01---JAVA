//import java.util.Scanner;

public class ExercicioExemplo {
    
    public static void main(String[] args) {

        //////// JEITO PADRAO DE IMPRIMIR///////////
        
        // Scanner leitor = new Scanner(System.in);

        // System.out.println("Digite o nome: ");
        // String nome = leitor.nextLine();

        // System.out.println("Digite a nota: ");
        // double nota = leitor.nextDouble();

        // System.out.println("Nome: " + nome);
        // System.out.println("Nota: " + nota);
        
        /////// JEITO COM A PASTA "Prompt.java" //////////

        String nome = Prompt.lerLinha("Digite o nome: ");
        double nota = Prompt.lerDecimal("Digite a nota: ");

        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Nota: " + nota);
    
    }
}
