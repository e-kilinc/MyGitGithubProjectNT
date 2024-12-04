package interviewQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");

        String str = input.next();
        String reverse = new StringBuilder(str).reverse().toString();

        if(str.equals(reverse)){
            System.out.println("This word is a palindrome");
        }else{
            System.out.println("This word is not a palindrome");
        }
    }
}
