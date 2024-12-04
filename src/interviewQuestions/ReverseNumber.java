package interviewQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(89));

    }

    public static int reverseNumber(int num){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder=num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        } while (num>0);
        return reverse;
    }
}
