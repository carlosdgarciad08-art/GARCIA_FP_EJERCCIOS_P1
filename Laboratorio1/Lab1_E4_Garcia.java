package Laboratorio1;

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Garcia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double Iva = 0.15; // constante

        // INICIO
        System.out.print("Producto: ");
        String producto = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio Unitario : ");
        double precio = sc.nextDouble();

        // DESARROLLO
        double subtotal = cantidad * precio;
        double valorIva = subtotal * Iva;
        double total = subtotal + valorIva;

        // FINAL
        System.out.println();
        System.out.println(producto);
        System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s%10.2f%n", "Iva 15%", valorIva);
        System.out.printf("%-25s%10.2f%n", "Total", total);

        sc.close();
    }
}