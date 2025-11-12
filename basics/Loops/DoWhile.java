/**
 * ARQUIVO: DO-WHILE - EXECUÇÃO GARANTIDA
 * CONCEITO: Do-while executa PELO MENOS UMA VEZ
 * OBJETIVO: Entender quando usar do-while vs while
 */
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("DO-WHILE - EXECUÇÃO GARANTIDA");
        System.out.println("=================================");
        
        System.out.println("\nDIFERENÇA CRUCIAL:");
        System.out.println("WHILE: Pode NUNCA executar");
        System.out.println("DO-WHILE: Executa PELO MENOS UMA VEZ");
        
        // EXEMPLO PRÁTICO: Menu que sempre aparece
        int choice;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Ver configurações");
            System.out.println("2 - Alterar senha");
            System.out.println("3 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Configurações do sistema...");
                    break;
                case 2:
                    System.out.println("Alterando senha...");
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 3); // Repete até usuário escolher sair
        
        System.out.println("\nPOR QUE USAR DO-WHILE AQUI?");
        System.out.println("- Menu PRECISA aparecer pelo menos uma vez");
        System.out.println("- Usuário pode querer sair imediatamente");
        System.out.println("- Garante experiência consistente");
        
        scanner.close();
    }
}
