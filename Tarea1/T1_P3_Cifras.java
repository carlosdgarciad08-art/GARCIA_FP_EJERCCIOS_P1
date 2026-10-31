package Tareaa1;
import java.util.Scanner;
 
public class T1_P3_Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Ingrese un numero de 3 cifras: ");
        int n = sc.nextInt();
 
        int Centenas = n / 100;
        int Decenas = (n / 10) % 10;
        int Unidades = n % 10;
 
        System.out.println("Centenas: " + Centenas);
        System.out.println("Decenas: " + Decenas);
        System.out.println("Unidades: " + Unidades);
 
        sc.close();
    }

}

// Autor: Carlos Garcia