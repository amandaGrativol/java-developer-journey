import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE MULTAS ===");
        System.out.print("Velocidade medida (km/h): ");
        double speed = scanner.nextDouble();
        
        System.out.print("Tipo de via (1-Urbana, 2-Rodovia): ");
        int roadType = scanner.nextInt();
        
        // what of roadType
        double speedLimit;
        if(roadType == 1){
            speedLimit = 60;
        } else {
            speedLimit = 100;
        }
        
        //creat and defined excess
        double excess = speed - speedLimit;
        
        // creat and defined percentage
        double percentage = (excess / speedLimit) * 100; 
        
        // conditional fines:
        if(excess <= 0){
            System.out.println("Dentro do limite de velocidade");
        }else if(percentage <= 20){
            System.out.println("Multa leve R$ 130,16");
        }else if(percentage <= 50){
            System.out.println("Multa grave (R$ 195,23)");
        }else{
            System.out.println("Multa gravíssima (R$ 880,41)");
        }
        
        
        scanner.close();
    }
}
