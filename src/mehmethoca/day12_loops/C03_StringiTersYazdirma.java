package mehmethoca.day12_loops;

import java.util.Scanner;

public class C03_StringiTersYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a word");

        String word = input.next();
        int wordLength = word.length();
        String reverse = "";

        for (int i=wordLength-1; i>=0; i--){
            reverse=reverse+word.substring(i,i+1);
        }
        System.out.println(word);
        System.out.println(reverse);

    }
}
