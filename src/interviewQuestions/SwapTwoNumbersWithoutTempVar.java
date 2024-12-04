package interviewQuestions;

public class SwapTwoNumbersWithoutTempVar {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        System.out.println("a first = " + a);
        System.out.println("b first= " + b);

        a = a+b;
        b= a-b;
        a= a-b;

        System.out.println("new a ="+ a);
        System.out.println("new b ="+ b);

    }
}
