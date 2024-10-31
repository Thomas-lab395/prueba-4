/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.pkg4;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Prueba4 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de productos a registrar: ");
        int cantidadProductos = scanner.nextInt();
        
        double costoTotal = 0;

        
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = scanner.nextDouble();
            
            System.out.print("Ingrese la cantidad del producto " + i + ": ");
            int cantidad = scanner.nextInt();
            
            
            costoTotal += precio * cantidad;
        }
        
        
        System.out.println("El costo total de la compra es: $" + costoTotal);
        
        
    }
}
