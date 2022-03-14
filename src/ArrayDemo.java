import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arraySum = {3,4,5};
        int [] arraySum2 = {4,3,2};

        int sum = 0;
        sum = (arraySum[0] + arraySum2[0]) + (arraySum[1] + arraySum2[1]) + (arraySum[2] + arraySum2[2]);
        System.out.println(sum);
        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + arraySum2[i]);
            System.out.print(",");

        }

    }
}
