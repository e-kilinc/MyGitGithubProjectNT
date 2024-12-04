package mehmethoca.day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz ==> Kisa kenar * Uzun Kenar
        //ii) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter short side of the rectangle");
        double shortSide = input.nextDouble();

        System.out.println("Please enter long side of the rectangle");
        double longSide = input.nextDouble();

        double area = shortSide*longSide;
        System.out.println("area = " + area);
        double perimeter = 2*(shortSide+longSide);
        System.out.println("perimeter = " + perimeter);
    }
}
