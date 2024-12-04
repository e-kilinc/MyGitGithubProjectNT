package mehmethoca.day04_sayininRakamToplami;

import java.util.Scanner;

public class C06_SayininRakamlariToplami {
    //Kullanicidan alacagınız 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
    //rakamlarin toplamini yazidiran kodu yaziniz.

    public static void main(String[] args){
        System.out.println("rakamlarToplami() = " + rakamlarToplami());

    }

    public static int rakamlarToplami(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 5 digit number");

        int sayi = input.nextInt();

        int sonRakam = sayi%10;
        sayi = sayi/10;

        int sondanIkinciRakam = sayi%10;
        sayi = sayi/10;

        int ucuncuRakam = sayi%10;
        sayi = sayi/10;

        int ikinciRakam = sayi%10;
        sayi = sayi/10;

        int ilkRakam = sayi%10;
        sayi = sayi/10;

        int toplam = ilkRakam+ikinciRakam+sondanIkinciRakam+sonRakam;
        return toplam;

    }
}
