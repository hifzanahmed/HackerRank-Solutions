

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class ThehurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

        int potionCount = 0;
        int max = Arrays.stream(height).max().getAsInt();
        if(max> k) {
            potionCount = max - k;
        }
        else
            potionCount = 0;
        return potionCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);*/

        int k = 7;

        int[] height = {2,5,4,5,2};

        //String[] heightItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int heightItem = Integer.parseInt(String.valueOf(height[i]));
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);
        System.out.println("result:"+ result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

