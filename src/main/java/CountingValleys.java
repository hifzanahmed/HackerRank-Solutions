
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        System.out.println("size =" + n);
        System.out.println("String =" + s);
        int u = 0;
        int d = 0;
        if (s.charAt(0) == 'U') {
            u++;
            System.out.println(s.charAt(0) + "=" + u);
        } else {
            d++;
            System.out.println(s.charAt(0) + "=" + u);
        }
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                u++;
                System.out.println(s.charAt(i) + "=" + u);
            } else {
                d++;
                System.out.println(s.charAt(i) + "=" + d);
            }
            if ((u == d)&&(s.charAt(i)!='D')) {
                u = 0;
                d = 0;
                count++;
                System.out.println("------");
            }
        }
        System.out.println(count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        int result = countingValleys(n, s);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        scanner.close();
    }
}

