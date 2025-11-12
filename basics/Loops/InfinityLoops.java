/**
 * ARQUIVO : LOOPS INFINITOS - PERIGOS E CONTROLES
 * CONCEITO: Como evitar e controlar loops infinitos
 * OBJETIVO: Programar loops seguros com condições de parada
 */
import java.util.Scanner;

public class InfiniteLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("LOOPS INFINITOS - PERIGOS E CONTROLES");
        System.out.println("=========================================");
        
        System.out.println("\nEXEMPLO PERIGOSO - LOOP INFINITO:");
        System.out.println("while (true) {");
        System.out.println("    // CUIDADO! Executa para SEMPRE!");
        System.out.println("}");
        
        System.out.println("\n  EXEMPLO SEGURO - LOOP CONTROLADO:");
        
        int counter = 0;
        int maxAttempts = 5;
        boolean success = false;
        
        System.out.println("Tentando conectar... (máximo " + maxAttempts + " tentativas)");
        
        while (!success && counter < maxAttempts) {
            counter++;
            System.out.println("Tentativa " + counter + "/" + maxAttempts);
            
            // Simulando conexão (50% de chance de sucesso)
            boolean connected = (Math.random() > 0.5);
            
            if (connected) {
                success = true;
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Falha na conexão...");
                
                if (counter < maxAttempts) {
                    System.out.println("🔄 Tentando novamente...");
                }
            }
        }
        
        if (!success) {
            System.out.println("\nLOOP INFINITO EVITADO!");
            System.out.println("Parou após " + maxAttempts + " tentativas");
            System.out.println("Sistema permanece responsivo");
        }
        
        System.out.println("\nDICAS DE SEGURANÇA:");
        System.out.println("1. Sempre tenha condição de parada");
        System.out.println("2. Use contadores de segurança");
        System.out.println("3. Teste condições extremas");
        System.out.println("4. Considere timeouts");
        
        scanner.close();
    }
}
