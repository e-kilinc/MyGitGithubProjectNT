package mehmethoca.day03;

import java.util.Scanner;

public class C01_ScannerMehmet {
    public static void main(String[] args) {
        //Kullanicidan ismini soyismini ve yasini alip asagidaki formatta yazdirin
        /*
        Isminiz : John
        Soyisminiz: Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = input.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas = input.nextDouble();

        /* ************ 1.yol *****************
        System.out.println("Isminiz : " + isim);

        System.out.println("Soyisminiz : " + soyisim);

        System.out.println("yas = " + yas);

        System.out.println("Kaydiniz basariyla tamamlanmistir");

         */

        // ******************* 2.Yol **************************************
        System.out.println("Isminiz : " + isim +
                           "\nSoyisminiz : "+ soyisim +
                            "\nYasiniz : "+yas+
                            "\nKaydiniz basariyla tamamlanmistir");


    }//main
}//class
