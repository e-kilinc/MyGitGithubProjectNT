package mehmethoca.day05_incrementDecrement_Cncatination;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {
        //a nin degerini 1 arttirin ve yeni degerini b variablea atayin
        int a = 20;
        a++;
        int b = a;

        System.out.println("a : " + a + ", b : " + b); // a : 21, b : 21

        // // a'nin degerini b'ye atayin, sonra a'nin degerini 1 artirin

        a=20;
        b=a;
        a++;

        System.out.println("a : " + a + ", b : " + b); //a : 21, b : 20
    }
}
