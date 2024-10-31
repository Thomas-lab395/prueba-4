package prueba.pkg4;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mayra Bardales
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int meses = 12;
        double consumoTotal = 0;

       
        for (int i = 1; i <= meses; i++) {
            System.out.print("Ingrese el consumo de agua en litros para el mes " + i + ": ");
            double consumoMensual = scanner.nextDouble();
            
            
            consumoTotal += consumoMensual;
        }
        
        
        double promedioMensual = consumoTotal / meses;

        
        System.out.println("El consumo total anual de agua es: " + consumoTotal + " litros");
        System.out.println("El promedio mensual de consumo de agua es: " + promedioMensual + " litros");

        scanner.close();
    }
}
    

