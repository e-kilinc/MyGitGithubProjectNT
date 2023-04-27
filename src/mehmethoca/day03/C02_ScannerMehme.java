package mehmethoca.day03;

import java.util.Scanner;

public class C02_ScannerMehme {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin
        //girilen bilgiler J Doe, 44

        Scanner input = new Scanner(System.in);

        //Kullanicidan tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra Enter`a basiniz");

        char isimIlkHarf = input.nextLine().charAt(0);
        //Scanner methodunda nextChar() yoktur
        //bunun icin once kullanicidan girisine gore next() veya nextLine() yazip
        //sonra charAt(0) yazariz. Parantez icindeki 0 almak istedigimiz charin indexidir.
        //Javada index 0dan baslar

        String soyisim = input.nextLine();
        double yas = input.nextDouble();

        //girilen bilgiler : J Doe, 44

        System.out.println("girilen bilgier : "+ isimIlkHarf+ " "+ soyisim+", "+ yas);


    }
}
