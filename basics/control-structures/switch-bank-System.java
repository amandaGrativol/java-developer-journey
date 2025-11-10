import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 1000.00;
        double withdraw = 0;
        double deposit = 0;
        
        System.out.println("=== SISTEMA BANCÁRIO ===");
        System.out.println("Saldo atual: R$ " + balance);
        
        System.out.print("Operação (1-Saque, 2-Depósito, 3-Consulta): ");
        int operation = scanner.nextInt();
        
        switch (operation){
        case 1:
            System.out.print("Valor do saque: ");
            withdraw = scanner.nextDouble();
            
            if(withdraw <= balance){
                balance = balance - withdraw;
                System.out.println("Novo saldo: $" + balance);
            }else{
                System.out.println("Salo insuficiente.!");
            }
            break;
            
        case 2:
            System.out.print("Valor do depósito: ");
            deposit = scanner.nextDouble();
            balance = balance + withdraw;
            break;
            
        case 3:
            System.out.println("Seu saldo: $" + balance);
            break;
            
        default:
            System.out.println("Operação invalida!");
            break;
        }
        
        scanner.close();
    }
}
