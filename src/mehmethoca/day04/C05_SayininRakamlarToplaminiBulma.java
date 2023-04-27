package mehmethoca.day04;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz :");

        //int sayi = scan.nextInt();
        // int lastDigit = sayi%10;
        // sayi = sayi/10;
        //int secondDigit = sayi%10;
        //sayi = sayi/10;
        //int firstDigit = sayi%10;

       // System.out.println("Rakamlar toplami :" + (lastDigit+secondDigit+firstDigit));


        int girilenSayi= scan.nextInt(); // 135

        int rakam= girilenSayi % 10;

        int rakamlarToplami= rakam;

        // ========

        girilenSayi = girilenSayi / 10; // sayi = 13

        rakam = girilenSayi % 10 ; // rakam = 3

        rakamlarToplami = rakamlarToplami + rakam; // rt= 8

        // ======

        girilenSayi= girilenSayi / 10 ; // 13 / 10 ==> sayi=1

        rakam = girilenSayi % 10; // rakam= 1

        rakamlarToplami= rakamlarToplami + rakam; // 9



        System.out.println("Girilan sayinin rakamlar toplami : " + rakamlarToplami);
    }

}
