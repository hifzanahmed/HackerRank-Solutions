import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

        // Complete the plusMinus function below.
        static void plusMinus(int[] arr) {
            float positive = 0f;
            float negative = 0f;
            float zero = 0f;
            for(int i=0; i<arr.length; i++){
                if (arr[i] > 0){
                    positive = positive + arr[i];
                } else if (arr[i] < 0){
                    negative = negative + arr[i];
                } else {
                    zero = zero + arr[i];
                }
            }

            System.out.println( (float)positive/arr.length);
            System.out.println( (float)negative/arr.length);
            System.out.println( (float)zero/arr.length);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Enter the size of Array : ");
            int n = scanner.nextInt();
            scanner.nextLine();
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int[] arr = new int[n];
            //String[] arrItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int i = 0; i < n; i++) {
                //int arrItem = Integer.parseInt(arrItems[i]);
                //arr[i] = arrItem;
                arr[i] = scanner.nextInt();
            }

            plusMinus(arr);

            scanner.close();
        }
    }

