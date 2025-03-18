package Ejercicio1Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú para que el usuario elija qué función probar
        System.out.println("Seleccione una opción:");
        System.out.println("1. Encontrar duplicado y faltante");
        System.out.println("2. Encontrar prefijo común");
        System.out.println("3. Convertir número romano a entero");
        System.out.println("4. Convertir número entero a romano");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                // Prueba de encontrarDuplicadoYFaltante
                System.out.println("Ingrese los números separados por espacios:");
                String[] numeros = scanner.nextLine().split(" ");
                int[] nums = new int[numeros.length];
                for (int i = 0; i < numeros.length; i++) {
                    nums[i] = Integer.parseInt(numeros[i]);
                }
                Ejercicio1.DuplicadoYFaltante solucion = new Ejercicio1.DuplicadoYFaltante();
                int[] resultado = solucion.encontrarDupYFal(nums);
                System.out.println("Duplicado: " + resultado[0] + ", Faltante: " + resultado[1]);
                break;

            case 2:
                // Prueba de prefijoComún
                System.out.println("Ingrese las cadenas separadas por comas:");
                String[] cadenas = scanner.nextLine().split(",");
                String prefijo = Ejercicio1.prefijoComún(cadenas);
                System.out.println("Prefijo común: " + prefijo);
                break;

            case 3:
                // Prueba de romanoAEntero
                System.out.println("Ingrese un número romano:");
                String romano = scanner.nextLine();
                try {
                    int entero = Ejercicio1.romanoAEntero(romano);
                    System.out.println("Número romano " + romano + " convertido a entero: " + entero);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;

            case 4:
                // Prueba de enteroRomano
                System.out.println("Ingrese un número entero (entre 1 y 3999):");
                int numero = scanner.nextInt();
                try {
                    String romanoConvertido = Ejercicio1.enteroRomano(numero);
                    System.out.println("Número entero " + numero + " convertido a romano: " + romanoConvertido);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}