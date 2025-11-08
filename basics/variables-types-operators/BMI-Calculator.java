import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BMI CALCULATOR ===");
        
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.println("\n=== BMI RESULT ===");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
         System.out.println("BMI: " + String.format("%.2f", bmi));
         
        // Classification
        String classification;
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 25) {
            classification = "Normal weight";
        } else if (bmi < 30) {
            classification = "Overweight";
        } else {
            classification = "Obesity";
        }
        
        System.out.println("Classification: " + classification);
        
        scanner.close();
    }
}
