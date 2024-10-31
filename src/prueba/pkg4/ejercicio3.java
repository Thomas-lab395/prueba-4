/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg4;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class ejercicio3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Control de Inventario");
        int totalProductos = 0;
        String inventario = "";
        String producto = "";

        while (!producto.equalsIgnoreCase("salir")) {
            System.out.print("Ingrese el nombre del producto (o 'salir' para finalizar): ");
            producto = scanner.nextLine();

            if (producto.equalsIgnoreCase("salir")) {
                continue;
            }

            System.out.print("Ingrese la cantidad de " + producto + ": ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            totalProductos += cantidad;
            inventario += producto + ": " + cantidad + "\n";
        }

        System.out.println("\nInventario final:");
        System.out.println(inventario);
        System.out.println("Total de productos registrados: " + totalProductos);

        
        
        }

        
    }
