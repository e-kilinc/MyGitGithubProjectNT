package mehmethoca.day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_IfStatementsMehmet {
    public static void main(String[] args) {
        //Soru 1: Kullanicidan bir sayi isteyin,
        //sayidaki sartlari kontrol edip 5 ile bolunebiliyorsa
        //        "Sayi 5`in tam kati" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5`in tam kati");
        }

        //Soru 1: Kullanicidan bir sayi isteyin,
        // 3 ile bolunebiliyorsa "3 ile bolunebilen bir sayi
        // 5 ile bolunebiliyorsa  "3 ile bolunebilen bir sayi yazdirin

        if (sayi%3==0){
            System.out.println("3 ile bolunebilen bir sayi");
            //version 1
        }
    }//main
}
