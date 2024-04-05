
package com.mycompany.prueba2;

import java.util.Scanner;

public class Prueba2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del vector
        final int TAMANO_VECTOR = 10;
        int[] vector = new int[TAMANO_VECTOR];

        // Leer los elementos del vector
        System.out.println("Ingrese los " + TAMANO_VECTOR + " elementos del vector:");
        
        
        for (int i = 0; i < TAMANO_VECTOR; i++) {
            vector[i] = scanner.nextInt();
        }

        // Mostrar los elementos del vector en pantalla
        System.out.println("Los " + TAMANO_VECTOR + " elementos del vector son:");
        
        
        for (int i = 0; i < TAMANO_VECTOR; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
