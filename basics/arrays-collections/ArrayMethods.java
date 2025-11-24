/**
 Import obrigatorio das arrays 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("DEMONSTRAÇÃO - MÉTODOS ÚTEIS PARA ARRAYS");
        System.out.println("============================================");
        
        //EXEMPLO 1: Arrays.toString() - Visualizar arrays
        System.out.println("\n1. Arrays.toString() - VISUALIZAR ARRAYS");
        System.out.println("--------------------------------------------");
        
        int[] numeros = {10, 20, 30, 40, 50};
        String[] frutas = {"Maçã", "Banana", "Laranja"};
        
        //JEITO ERRADO (mostra endereço de memória)
        System.out.println("Jeito errado: " + numeros);
        
        // JEITO CORRETO (mostra conteúdo real)
        System.out.println("Arrays.toString(): " + Arrays.toString(numeros));
        System.out.println("Arrays.toString(): " + Arrays.toString(frutas));
        
        
        // EXEMPLO 2: Arrays.sort() - Ordenar arrays
        System.out.println("\n2. Arrays.sort() - ORDENAR ARRAYS");
        System.out.println("------------------------------------");
        
        int[] notasDesordenadas = {85, 92, 78, 95, 88};
        String[] nomesDesordenados = {"Carlos", "Ana", "Bruno", "Diana"};
        
        System.out.println("Antes de ordenar: " + Arrays.toString(notasDesordenadas));
        System.out.println("Antes de ordenar: " + Arrays.toString(nomesDesordenados));
        
        // Ordenando os arrays
        Arrays.sort(notasDesordenadas);
        Arrays.sort(nomesDesordenados);
        
        System.out.println("Depois de ordenar: " + Arrays.toString(notasDesordenadas));
        System.out.println("Depois de ordenar: " + Arrays.toString(nomesDesordenados));
        
        
        //EXEMPLO 3: Arrays.fill() - Preencher arrays
        System.out.println("\n3. Arrays.fill() - PREENCHER ARRAYS");
        System.out.println("-------------------------------------");
        
        int[] arrayVazio = new int[5];
        String[] arrayTexto = new String[4];
        
        System.out.println("Array vazio: " + Arrays.toString(arrayVazio));
        System.out.println("Array texto vazio: " + Arrays.toString(arrayTexto));
        
        // Preenchendo com valores
        Arrays.fill(arrayVazio, 7);
        Arrays.fill(arrayTexto, "Padrão");
        
        System.out.println("Preenchido com 7: " + Arrays.toString(arrayVazio));
        System.out.println("Preenchido com 'Padrão': " + Arrays.toString(arrayTexto));
        
        
        //EXEMPLO 4: Arrays.equals() - Comparar arrays
        System.out.println("\n4. Arrays.equals() - COMPARAR ARRAYS");
        System.out.println("--------------------------------------");
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};
        
        //JEITO ERRADO (compara endereços, não conteúdo)
        System.out.println(" array1 == array2: " + (array1 == array2));
        
        //JEITO CORRETO (compara conteúdo)
        System.out.println("Arrays.equals(array1, array2): " + Arrays.equals(array1, array2));
        System.out.println("Arrays.equals(array1, array3): " + Arrays.equals(array1, array3));
        
        
        //EXEMPLO 5: Arrays.copyOf() - Copiar arrays
        System.out.println("\n5. Arrays.copyOf() - COPIAR ARRAYS");
        System.out.println("------------------------------------");
        
        int[] original = {10, 20, 30, 40, 50};
        
        // Copiando todo o array
        int[] copiaCompleta = Arrays.copyOf(original, original.length);
        
        // Copiando apenas parte do array
        int[] copiaParcial = Arrays.copyOf(original, 3);
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Cópia completa: " + Arrays.toString(copiaCompleta));
        System.out.println("Cópia parcial (3 elementos): " + Arrays.toString(copiaParcial));
        
        
        // EXEMPLO PRÁTICO: Sistema de Notas Completo
        System.out.println("\n6. EXEMPLO PRÁTICO: SISTEMA DE NOTAS");
        System.out.println("--------------------------------------");
        
        double[] notas = {8.5, 7.0, 9.0, 6.5, 8.0};
        
        System.out.println("Notas dos alunos: " + Arrays.toString(notas));
        
        // Criar cópia para ordenar sem perder original
        double[] notasOrdenadas = Arrays.copyOf(notas, notas.length);
        Arrays.sort(notasOrdenadas);
        
        System.out.println("Notas ordenadas: " + Arrays.toString(notasOrdenadas));
        System.out.println("Melhor nota: " + notasOrdenadas[notasOrdenadas.length - 1]);
        System.out.println("Pior nota: " + notasOrdenadas[0]);
        
        
        //EXEMPLO PRÁTICO: Sistema de Produtos
        System.out.println("\n7. EXEMPLO PRÁTICO: SISTEMA DE PRODUTOS");
        System.out.println("-----------------------------------------");
        
        String[] produtos = {"Notebook", "Mouse", "Teclado", "Monitor"};
        double[] precos = {2500.00, 89.90, 150.00, 800.00};
        
        System.out.println("Produtos em estoque:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("   " + (i + 1) + ". " + produtos[i] + " - R$ " + precos[i]);
        }
        
        // Encontrar produto mais caro
        int indiceMaisCaro = 0;
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[indiceMaisCaro]) {
                indiceMaisCaro = i;
            }
        }
        
        System.out.println("Produto mais caro: " + produtos[indiceMaisCaro] + 
                          " - R$ " + precos[indiceMaisCaro]);
        
        
        // DICAS FINAIS E BOAS PRÁTICAS
        System.out.println("\n8. DICAS E BOAS PRÁTICAS");
        System.out.println("---------------------------");
        
        System.out.println("SEMPRE importe: import java.util.Arrays;");
        System.out.println("Use Arrays.toString() para debug e relatórios");
        System.out.println("Crie cópias com copyOf() antes de modificar arrays importantes");
        System.out.println("Use Arrays.sort() para rankings e estatísticas");
        System.out.println("Arrays.equals() compara CONTEÚDO, == compara ENDEREÇOS");
        
        System.out.println("\n EVITE:");
        System.out.println("System.out.println(array) - mostra endereço de memória");
        System.out.println("Modificar arrays originais sem fazer cópia");
        System.out.println("Comparar arrays com == (sempre use Arrays.equals())");
        
        scanner.close();
        
        System.out.println("\n CONCLUÍDO!");
        System.out.println("Agora você domina os métodos essenciais para trabalhar com arrays! 🚀");
    }
}
