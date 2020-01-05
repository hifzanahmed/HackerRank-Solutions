
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int count = 0;
        int np = 0;
        int nn = 0;
        for (int i = 0; i < a.size(); i++) {
            np = 0;
            nn = 0;
            for (int j = 0; j < a.size(); j++) {
                if ((a.get(i) - a.get(j) >= 0) && (a.get(i) - a.get(j)) <= 1) {
                    np++;
                }
                if ((a.get(i) - a.get(j) <= 0) && (a.get(i) - a.get(j)) >= -1) {
                    nn++;
                }
            }

            if (count < nn) {
                count = nn;
            }
            if (count < np) {
                count = np;
            }
        }
        System.out.println(count);
        return count;
    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int result = Result3.pickingNumbers(a);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        bufferedReader.close();
        //bufferedWriter.close();
    }
}

