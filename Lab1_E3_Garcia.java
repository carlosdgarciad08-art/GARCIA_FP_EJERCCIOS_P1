package Laboratorio1;

import java.util.Scanner;

public class Lab1_E3_Garcia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INCIO
        System.out.print("Ingrese un entero de cuatro cifras: ");
        int n = sc.nextInt();

        // DESARROLLO: extraccion de cifras con / y %
        int unidades = n % 10;
        int decenas = (n / 10) % 10;
        int centenas = (n / 100) % 10;
        int millares = (n / 1000) % 10;

        int suma = unidades + decenas + centenas + millares;
       

        int invertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;
        boolean esPar = n % 2 == 0;

        // FINAL
        System.out.println("Suma de cifras: " + suma);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);

        sc.close();
    }
}