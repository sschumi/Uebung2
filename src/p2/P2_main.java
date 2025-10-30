package p2;

import java.util.Scanner;

public class P2_main {
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.print("Gebe eine ganzzahlige Zahl an: ");
        i = s.nextInt();
        boolean b = false;
        if (i > 10) {
            b = true;
            System.out.println("Die Zahl ist größer als 10!");
        } else {
            System.out.println("Die Zahl ist kleiner als 10!");
        }
    }
}
