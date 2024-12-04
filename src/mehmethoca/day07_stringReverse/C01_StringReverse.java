package mehmethoca.day07_stringReverse;

public class C01_StringReverse {
    public static void main(String[] args){
        String str = "Vacation";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse +=str.charAt(i);
        }
        System.out.println(reverse);

        //Best way
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string is: " +reversed);



    }

}
