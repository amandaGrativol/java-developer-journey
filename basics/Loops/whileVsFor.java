/**
 * ARQUIVO: WHILE vs FOR - QUANDO USAR CADA UM
 * CONCEITO: Diferenças fundamentais entre while e for
 * OBJETIVO: Saber escolher o loop certo para cada situação
 */
import java.util.Scanner;

public class WhileVsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("WHILE vs FOR - QUANDO USAR CADA UM?");
        System.out.println("========================================");
        
        // EXEMPLO 1 Tabuada: FOR - quando SABEMOS quantas repetições
        System.out.println("\nEXEMPLO 1: FOR LOOP");
        System.out.println("Use FOR quando sabe quantas vezes repetir:");
        
        System.out.print("Tabuada de qual número? ");
        int number = scanner.nextInt();
        
        System.out.println("Tabuada do " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        // EXEMPLO 2 Adivinhar: WHILE - quando NÃO SABEMOS quantas repetições
        System.out.println("\nEXEMPLO 2: WHILE LOOP");
        System.out.println("Use WHILE quando NÃO sabe quantas vezes repetir:");
        
        int secretNumber = 7;
        int attempts = 0;
        boolean guessed = false;
        
        System.out.println("Adivinhe o número entre 1-10!");
        
        while (!guessed) {
            System.out.print("Seu palpite: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                guessed = true;
                System.out.println("Acertou em " + attempts + " tentativas!");
            } else {
                System.out.println("Errou! Tente novamente.");
            }
        }
        
        System.out.println("\nRESUMO:");
        System.out.println("FOR → Quantidade conhecida de repetições");
        System.out.println("WHILE → Condição complexa/desconhecida");
        
        scanner.close();
    }
}
