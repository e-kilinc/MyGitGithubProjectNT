package mehmethoca.day12_loops;

import java.util.Scanner;

public class C04_rakamlarToplamiLoop {
    public static void main(String[] args) {
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int sum = 0;
        for (int i = number; i >0 ; i=i/10) {
            sum = sum+i%10;
        }
        System.out.println(sum);

    }
}
