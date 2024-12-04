package interviewQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("checkPrime(6) = " + checkPrime(6));

    }

    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
