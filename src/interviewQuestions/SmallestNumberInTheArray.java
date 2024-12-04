package interviewQuestions;

import java.util.Arrays;

public class SmallestNumberInTheArray {
    public static void main(String[] args) {
        int [] arr = {5,6,76,32,44,1};
        int smallest = arr[0];
        for (int num: arr  ) {
            if(num<smallest){
                smallest=num;
            }
        }
        System.out.println("The smallest number is: " +smallest);

        int smallestNumber= Arrays.stream(arr).min().getAsInt();
        System.out.println("Smallest number = "+smallestNumber);
    }
}
