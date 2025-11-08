import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE PLANO DE SAÚDE ===");
        System.out.print("Digite a idade do beneficiário: ");
        int age = scanner.nextInt();
        
        System.out.print("Tipo de plano (1-Básico, 2-Executivo, 3-Premium): ");
        int planType = scanner.nextInt();
        
        double baseprice = 0;
        if(planType == 1){
            baseprice = 150;
        }else if(planType == 2){
            baseprice = 250;
        }else if(planType == 3){
            baseprice = 400;
        }
        
        double percentage = 0;
        if(age <= 18){
            percentage = 0.20;
        }else if(age <= 40){
            percentage = 0.15;
        }else if(age <= 60){
            percentage = 0.25;    
        }else{
            percentage = 0.35;
        }
        
        double finalprice = baseprice + (baseprice * percentage);
        
        System.out.println("Base Price: $" + baseprice +  " Age percentage: %" + percentage + " Final price: $" + finalprice);
        
        scanner.close();
    }
}
