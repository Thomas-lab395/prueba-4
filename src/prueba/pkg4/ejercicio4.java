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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = Integer.parseInt(scanner.nextLine());

        int[] totalHorasPorEmpleado = new int[numEmpleados]; 

        for (int i = 0; i < numEmpleados; i++) {
            int totalHoras = 0;

            System.out.println("\nEmpleado " + (i + 1) + ":");
            for (int j = 1; j <= 7; j++) {
                System.out.print("Horas trabajadas el dia " + j + ": ");
                int horas = Integer.parseInt(scanner.nextLine());
                totalHoras += horas;
            }

            totalHorasPorEmpleado[i] = totalHoras; 
            double promedioHoras = totalHoras / 7.0;
            System.out.println("Total de horas trabajadas en la semana: " + totalHoras);
            System.out.println("Promedio de horas trabajadas por dia: " + promedioHoras);
        }

        
        System.out.println("\nResumen de horas trabajadas por cada empleado:");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ": " + totalHorasPorEmpleado[i] + " horas");
        }

        
    }
}
