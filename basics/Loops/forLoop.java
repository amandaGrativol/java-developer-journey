/**
 * ARQUIVO: ESTRUURA COMPLETA DO FOR LOOP
 * CONCEITO: Partes do for (inicialização, condição, incremento)
 * OBJETIVO: Entender CADA parte do for e como elas trabalham juntas
 */
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ESTRUTURA DO FOR LOOP");
        System.out.println("========================");
        System.out.print("Quantas vezes repetir? ");
        int times = scanner.nextInt();
        
        System.out.println("PARTES DO FOR LOOP:");
        System.out.println("for (int i = 1; i <= " + times + "; i++) {");
        System.out.println("    // Código que se repete");
        System.out.println("}");
        
        System.out.println("EXPLICAÇÃO:");
        System.out.println("1. int i = 1    → INICIALIZAÇÃO (cria variável)");
        System.out.println("2. i <= " + times + "   → CONDIÇÃO (enquanto verdade)");
        System.out.println("3. i++         → INCREMENTO (aumenta contador)");
        
        System.out.println("EXECUÇÃO PASSO A PASSO:");
        for (int i = 1; i <= times; i++) {
            System.out.println("Loop " + i + ": i = " + i + " → " + i + " <= " + times + "? " + (i <= times));
        }
        
        scanner.close();
    }
}
