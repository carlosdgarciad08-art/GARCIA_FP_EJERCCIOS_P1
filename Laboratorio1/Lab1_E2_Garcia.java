package Laboratorio1;

import java.util.Scanner;

public class Lab1_E2_Garcia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INICIO
        System.out.print("Ingrese el tiempo total en minutos: ");
        int totalSegu = sc.nextInt();

        // DESARRROLLO
        int hours = totalSegu / 3600;
        int minutos = (totalSegu % 3600) / 60;
        int segundos = totalSegu % 60;

        // FINAL
        System.out.println("Tiempo total: " + totalSegu + " segundos");
        System.out.println("Equivalente: " + hours + " hours, " + minutos + " minutos, " + segundos + " segundos");

        // VERIFICACION: 
        int verificacion = hours * 3600 + minutos * 60 + segundos;
        System.out.println("Verificacion: " + horas + "*3600 + " + minutos
                + "*60 + " + segundos + " = " + verificacion);
        System.out.println("Coincide con el valor leido: "
                + (verificacion  == totalSegu));

        sc.close();
    }
}