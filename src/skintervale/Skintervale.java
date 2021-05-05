package skintervale;

import java.util.Scanner;

public class Skintervale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Ivesti du skaicius ir atspausdinti visu skaiciu, esanciu intervale suma
         3 6 -> 3 + 4 + 5 + 6
         6 3 -> 3 + 4 + 5 + 6
         */
        
        System.out.println("Ivesk pirma skaiciu");
        int sk1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int sk2 = sc.nextInt();
        System.out.println("---------");

        int sum = 0;
        if (sk1 > sk2) {
            int tmp = sk1;
            sk1 = sk2;
            sk2 = tmp;
        }
        while (sk1 <= sk2) {
            sum += sk1;
            sk1++;
        }
        System.out.println("Suma yra lygi: " + sum);
    }
}
