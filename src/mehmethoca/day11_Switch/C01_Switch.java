package mehmethoca.day11_Switch;

import java.util.Scanner;

public class C01_Switch {
    /*
            Kullanicidan gun isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz
            Sunday==>1    Monday==>2 ... Saturday==>7
         */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a day name");

        String dayName= input.next();

        switch (dayName.toLowerCase()){
            case "sunday" :
                System.out.println("Sunday");
                break;
            case "monday" :
                System.out.println("Monday");
                break;
            case "tuesday" :
                System.out.println("Tuesday");
                break;
            case "wednesday" :
                System.out.println("Wednesday");
                break;
            case "thursday" :
                System.out.println("Thursday");
                break;
            case "friday" :
                System.out.println("Friday");
                break;
            case "saturday" :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a valid day");
        }
    }
}
