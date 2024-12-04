package interviewQuestions;

public class ReverseStringArray {
    public static void main(String[] args) {
        String str = "Today is Monday";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
