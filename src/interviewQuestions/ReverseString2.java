package interviewQuestions;

public class ReverseString2 {
    public static void main(String[] args){
        String name = "Ali Veli";
        String reverse = "";
        for(int i = name.length()-1; i>=0; i--){
            reverse +=name.charAt(i);
        }
        System.out.println(reverse);

        //Best way
        String reversedString = new StringBuilder(name).reverse().toString();
        System.out.println(reversedString);
    }
}
