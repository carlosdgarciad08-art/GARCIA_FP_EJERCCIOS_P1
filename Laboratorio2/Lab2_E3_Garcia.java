//Nombre : Carlos Garcia
//NRC: 37712
//Fecha: 29/10/2026
//Ejercicio 1:
package Laboratorio2;

import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Garcia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();

        final int Max_INTENTOS = 7;
        int secreto = azar.nextInt(100) + 1; // numero entre 1 y 100
        int intentos = 0;
        boolean acerto = false;

        System.out.println("Adivina el numero entre 1 y 100. Tienes " + Max_INTENTOS + " intentos.");

        // do-while: el usuario debe intentar al menos una vez
        do {
            System.out.print("Intento " + (intentos + 1) + " de " + Max_INTENTOS + ": ");
            int intento = sc.nextInt();
            intentos++;

            if (intento == secreto) {
                acerto = true;
            } else if (intento < secreto) {
                System.out.println("El numero secreto es mas alto.");
            } else {
                System.out.println("El numero secreto es mas bajo.");
            }
            // Se repite mientras no haya acertado y queden intentos
        } while (!acerto && intentos < Max_INTENTOS);

        if (acerto) {
            System.out.println("Acertaste en " + intentos + " intento(s).");
        } else {
            System.out.println("Perdiste. El numero era " + secreto + ".");
        }

        sc.close();
    }
}
