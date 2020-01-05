import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum=0;
        long maxSum=0;
        for(int i=0; i<arr.length-1; i++){
            minSum = minSum+ arr[i];
        }
        for(int i=1; i<arr.length; i++){
            maxSum = maxSum+ arr[i];
        }
        System.out.print(minSum);
        System.out.print(" " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        //String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter the array values one by one :");
        for (int i = 0; i < 5; i++) {
            //int arrItem = Integer.parseInt(arrItems[i]);
            //arr[i] = arrItem;
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

