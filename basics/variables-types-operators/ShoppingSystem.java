import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SHOPPING CART ===");
        
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        
        System.out.print("Enter product price: R$ ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();
        
        // Calculations
        double subtotal = price * quantity;
        double discountAmount = subtotal * (discountPercent / 100);
        double total = subtotal - discountAmount;
        
        System.out.println("\n=== INVOICE ===");
        System.out.println("Product: " + productName);
        System.out.println("Unit price: R$ " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: R$ " + String.format("%.2f", subtotal));
        System.out.println("Discount: " + discountPercent + "% (-R$ " + String.format("%.2f", discountAmount) + ")");
        System.out.println("TOTAL: R$ " + String.format("%.2f", total));
        
        scanner.close();
    }
}
