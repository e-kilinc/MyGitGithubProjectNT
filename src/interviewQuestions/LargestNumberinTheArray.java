package interviewQuestions;

import java.util.Arrays;

public class LargestNumberinTheArray {
    public static void main(String[] args) {
        int [] arr = {5,6,76,32,44,1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        int biggest = arr[0];
        for (int num: arr ) {
            if(num>biggest){
                biggest=num;
            }
        }
        System.out.println("The biggest number is: "+ biggest);
    }
}
