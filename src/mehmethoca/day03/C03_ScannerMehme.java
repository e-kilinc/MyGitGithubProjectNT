package mehmethoca.day03;

import java.util.Scanner;

public class C03_ScannerMehme {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip cevresini ve alanini yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapiniz yaziniz");

        double yaricap = input.nextDouble();

        System.out.println("Cevre : " + (2*3.14*yaricap));
        System.out.println("Alan : "+ (3.14*yaricap*yaricap));
    }
}
