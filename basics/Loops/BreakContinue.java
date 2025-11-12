/**
 * ARQUIVO: BREAK & CONTINUE - CONTROLE DE LOOPS
 * CONCEITO: Como interromper (break) ou pular (continue) voltas
 * OBJETIVO: Controlar fluxo dentro dos loops
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("BREAK & CONTINUE - CONTROLE DE LOOPS");
        System.out.println("========================================");
        
        System.out.println("\nBREAK - INTERROMPE O LOOP COMPLETAMENTE");
        System.out.println("Encontre o primeiro múltiplo de 7 entre 1-20:");
        
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                System.out.println("encontrei: " + i + " é múltiplo de 7!");
                System.out.println("BREAK - parando busca...");
                break; // Para o loop imediatamente
            }
            System.out.println("Testando: " + i);
        }
        
        System.out.println("\nCONTINUE - PULA PARA PRÓXIMA VOLTA");
        System.out.println("Números ímpares entre 1-10 (pulando pares):");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("CONTINUE - pulando número par: " + i);
                continue; // Pula para próxima volta
            }
            System.out.println("Número ímpar: " + i);
        }
        
        System.out.println("\nRESUMO PRÁTICO:");
        System.out.println("BREAK    → 'Pare tudo, já encontrei!'");
        System.out.println("CONTINUE → 'Pule este, vamos para o próximo!'");
        
        scanner.close();
    }
}
