import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Tem carteira? (true/false): ");
        boolean temCarteira = scanner.nextBoolean();
        
        // Operador ternário
        String categoria = (idade < 12) ? "Criança" : 
                          (idade < 18) ? "Adolescente" : "Adulto";
        
        // Múltiplas condições
        String podeDirigir = (idade >= 18 && temCarteira) ? "Pode dirigir" : "Não pode dirigir";
        
        System.out.println("Categoria: " + categoria);
        System.out.println("Situação: " + podeDirigir);
        
        scanner.close();
    }
}
