import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCandle {

    // Complete the birthdayCakeCandles function below.
    static void birthdayCakeCandles(int[] ar) {
        int temp=ar.length-1;
        int count=0;
        Arrays.sort(ar);
        int max= ar[temp];
        for(int i=0; i<temp+1;i++){
            if(ar[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Enter the size of array : ");
        int arCount = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] ar = new int[arCount];
        System.out.println("Enter the value one by one :");
        //String[] arItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < arCount; i++) {
            //int arItem = Integer.parseInt(arItems[i]);
            //ar[i] = arItem;
            ar[i] = scanner.nextInt();
            scanner.nextLine();
        }
        //int result = birthdayCakeCandles(ar);
        birthdayCakeCandles(ar);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        */
        scanner.close();
    }
}

