/**
 * ARQUIVO: ARRAYS BÁSICOS - COMO FUNCIONAM
 * OBJETIVO: Entender a sintaxe fundamental dos arrays
 */
public class BasicArrays {
    public static void main(String[] args) {
        System.out.println("ARRAYS BÁSICOS - COMO FUNCIONAM");
        System.out.println("===============================");
        
        //ARRAY SIMPLES
        String[] nomes = {"Ana", "João", "Maria"};
        
        System.out.println("\n1. ARRAY DE NOMES:");
        System.out.println("String[] nomes = {\"Ana\", \"João\", \"Maria\"};");
        
        // Acessando elementos
        System.out.println("nomes[0] = " + nomes[0]); // Ana
        System.out.println("nomes[1] = " + nomes[1]); // João
        System.out.println("nomes[2] = " + nomes[2]); // Maria
        
        //PERCORRENDO COM LOOP
        System.out.println("\n2. PERCORRENDO COM FOR LOOP:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
        
        //ARRAY DE NÚMEROS
        int[] numeros = {10, 20, 30, 40, 50};
        
        System.out.println("\n3. ARRAY DE NÚMEROS:");
        System.out.println("int[] numeros = {10, 20, 30, 40, 50};");
        
        // Exemplo: Soma dos números
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média: " + (soma / numeros.length));
    }
}
