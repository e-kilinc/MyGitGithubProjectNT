package mehmethoca.day11_Switch;

import java.util.Scanner;

public class C02_Calculator {
    public static void main (String[] args){
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the operation");
        System.out.println("Please write two integers");

        char operation = input.next().charAt(0);
        int sayi1 = input.nextInt();
        int sayi2= input.nextInt();

        switch (operation){
            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Please enter a valid operation");
        }
    }
}
