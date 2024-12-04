package interviewQuestions;

import java.util.function.Function;

public class RemoveExtraSpaceString {
    public static void main(String[] args) {
        String input = "Try    to     remove    extra    spaces.";

        Function<String, String> removeExtraSpace = str->str.replaceAll("\\s+"," ").trim();
        String result = removeExtraSpace.apply(input);

        System.out.println(input);
        System.out.println(result);
    }
}
