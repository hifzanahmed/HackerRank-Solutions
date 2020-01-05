
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        System.out.println("Size ="+n);
        Arrays.sort(ar);
        int lastValue=ar[0];
        int count = 0;
        int pairs=0;
        System.out.println("Input ="+Arrays.toString(ar));
        for(int i=0;i<ar.length;i++){
            if(lastValue==ar[i]){
                count++;
            } else {
                System.out.println(lastValue+" = "+count);
                pairs=pairs+count/2;
                count=1;
                lastValue=ar[i];
            }
        }
        System.out.println(lastValue+" = "+count);
        System.out.println(pairs+count/2);
        return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = sockMerchant(n, ar);
        scanner.close();
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();        */
    }
}

