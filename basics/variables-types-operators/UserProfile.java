public class UserProfile {
    public static void main(String[] args) {
        String name = "John Silva";
        int age = 30;
        double height = 1.75;
        char gender = 'M';
        boolean isStudent = true;
        double salary = 3500.50;
        
        System.out.println("=== USER PROFILE ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + "m");
        System.out.println("Gender: " + gender);
        System.out.println("Is student: " + isStudent);
        System.out.println("Salary: R$ " + salary);
        
        double annualSalary = salary * 12;
        int ageInMonths = age * 12;
        System.out.println("Annual salary: R$ " + annualSalary);
        System.out.println("Age in months: " + ageInMonths);
    }
}
