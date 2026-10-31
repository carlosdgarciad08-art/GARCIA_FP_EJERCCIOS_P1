package Tareaa1;
import java.util.Scanner;

public class T1_P2_Espar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un Numero Entero: ");
        int n = sc.nextInt();

        System.out.println(n % 2 == 0);

        sc.close();
    }
}
// Autor: Carlos Garcia