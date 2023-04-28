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
            System.out.println("Java is easy");
            //version 2
            System.out.println("Learn Java earn money");
            //version 3
            System.out.println("Git ogrenmek cok kolay");
            //version 4

            System.out.println("yeni branchde kodlari yazdim");
            //version emn1

            System.out.println("yeni kodlar eklendi");
            //emn2

            System.out.println();
            //emn3
            System.out.println();
            //localde degisiklik yaptim
        }
    }//main
}
