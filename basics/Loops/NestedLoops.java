/**
 * ARQUIVO: LOOPS ANINHADOS - LOOP DENTRO DE LOOP
 * CONCEITO: Como funcionam loops dentro de outros loops
 * OBJETIVO: Entender combinações e padrões com múltiplos loops
 */
import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" LOOPS ANINHADOS - LOOP DENTRO DE LOOP");
        System.out.println("=========================================");
        
        System.out.print("Tamanho do padrão (ex: 5): ");
        int size = scanner.nextInt();
    
        System.out.println("\n PADRÃO DE ASTERISCOS:");
        System.out.println("Loop externo controla LINHAS");
        System.out.println("Loop interno controla COLUNAS");
        
        // Padrão de asteriscos
        for (int linha = 1; linha <= size; linha++) {
            System.out.print("Linha " + linha + ": ");
            
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("* ");
            }
            
            System.out.println(" ← " + linha + " asteriscos");
        }
        
        System.out.println("\n TABUADA COMPLETA:");
        System.out.println("Loop externo: números de 1 a " + size);
        System.out.println("Loop interno: multiplicadores de 1 a 10");
        
        for (int numero = 1; numero <= size; numero++) {
            System.out.println("\nTabuada do " + numero + ":");
            
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            }
        }
        
        System.out.println("\n COMO FUNCIONA:");
        System.out.println("Para CADA volta do loop externo,");
        System.out.println("o loop interno executa TODAS as suas voltas!");
        
        scanner.close();
    }
}
