/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadoradetemperatura;

import java.util.Scanner;

/**
 *
 * @author DAM116
 */
public class CalculadoraDeTemperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\tBienvenido al conversor de temperaturas\n");
        System.out.print("Introduce el valor que quiere convertir : ");
        float value = scan.nextFloat();
        System.out.println("  Introduce 1 para convertir de Celsius a Fahrenheit....");
        System.out.println("  Introduce 2 para convertir de Fahrenheit a Celsius....");
        System.out.print("\nSeleccion...   ");
        int ans = scan.nextInt();
        if (ans == 1) {
            float value1 = (float) ((value * (1.8)) + 32);
            System.out.print("Su conversion es.. " + value1 + "°F");
        }
        if (ans == 2) {
            float value2 = (float) (value - 32);
            float value3 = (float) (value2 * (5) / 9);
            System.out.print("Su conversion es.. " + value3 + "°C");
        }
        System.out.println("\n\t:)..");
    }

}
