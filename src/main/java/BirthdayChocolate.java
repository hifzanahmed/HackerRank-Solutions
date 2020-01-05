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

public class BirthdayChocolate {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int array_sum = 0;
        int counter = 0;
        for (int i = 0; i < s.size(); i++) {
            int k=1;
            System.out.println("i +" + i);
            for (int j = i; j < s.size(); j++) {
                System.out.println("j +" + j);
                array_sum = array_sum + s.get(j);
                System.out.println("sum ="+array_sum);
                if ((array_sum == d)&&(k==m)) {
                    counter++;
                    array_sum = 0;
                }
                if(k==m){
                    array_sum=0;
                    break;
                }
                k++;
                //System.out.println("j =" + j);
                //System.out.println(array_sum);
            }
        }
        System.out.println("Counter : " + counter);
        return counter;

    }

    public static void main(String[] args) throws IOException {
            /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int d = Integer.parseInt(dm[0]);
            int m = Integer.parseInt(dm[1]);
             */
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d = 3;
        int m = 2;
        int result = birthday(s, d, m);
            /*bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
            bufferedReader.close();
            bufferedWriter.close();
             */
        System.out.println(result);
    }
}

