package Tareaa1;

import java.util.Locale;
import java.util.Scanner;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double b = sc.nextDouble();
        System.out.print("Altura: ");
        double h = sc.nextDouble();

        double Area = b * h;
        double Perimetro = 2 * (b + h);

        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);

        sc.close();
    }
}
// Autor: Carlos Garcia