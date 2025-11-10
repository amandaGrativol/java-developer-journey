import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== DIAS DA SEMANA ===");
        System.out.print("Digite um número (1-7): ");
        int dayNumber = scanner.nextInt();
        
        String dayName;
        String dayType;
        
        switch (dayNumber) {
            case 1:
                dayName = "Domingo";
                break;
            case 2:
                dayName = "Segunda-feira";
                break;
            case 3:
                dayName = "Terça-feira";
                break;
            case 4:
                dayName = "Quarta-feira";
                break;
            case 5:
                dayName = "Quinta-feira";
                break;
            case 6:
                dayName = "Sexta-feira";
                break;
            case 7:
                dayName = "Sábado";
                break;
            default:
                dayName = "Dia inválido";
        }
        
        dayType = (dayNumber == 1 || dayNumber == 7) ? "Fim de semana" : "Dia útil";
        
        System.out.println(dayNumber + " → " + dayName + " (" + dayType + ")");
        scanner.close();
    }
}
