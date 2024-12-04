package mehmethoca.day12_loops;

public class C02_loops2 {
    public static void main(String[] args) {
        //Example 1: Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //         "I love Java"  ==> "I love J"
        String s= "Train";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);

        }

        //Example 2: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        // "Germany" ==>yn

        for (int i = s.length()-1; i >=0 ; i--) {
            char ch = s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);

        }
    }
}
