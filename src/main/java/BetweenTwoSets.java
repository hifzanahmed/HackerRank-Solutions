
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

class Result2 {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        //System.out.println(a);
        //System.out.println(b);
        int count = 0;
        int g = b.get(0);
        int l = lcm(a);
        for (int i = 1; i < b.size(); i++) {
            g = gcd(g, b.get(i));
        }
        int m = l;
        int i = 1;
        while (m <= g) {

            m = l * i;
            if (g % m == 0) {
                count++;
            }
            i++;

        }

        return count;
    }

    static int gcd(int l, int e) {
        if (e == 0) {
            return l;
        } else {
            return gcd(e, l % e);
        }
    }

    static int lcm(List<Integer> e) {
        int ans = 1;
        for (int i : e) {
            ans = (ans * i) / gcd(ans, i);
        }
        return ans;
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(9);
        arr.add(6);
        /*
        arr.add(97);
        arr.add(96);
        arr.add(95);
        arr.add(94);
        arr.add(93);
        arr.add(92);
        arr.add(91);

         */
        List<Integer> brr = new ArrayList<>();
        brr.add(36);
        brr.add(72);
        /* brr.add(12);
        brr.add(4);
        brr.add(5);
        brr.add(6);
        brr.add(7);
        brr.add(8);
        brr.add(9);
        brr.add(10);

         */
        int total = Result2.getTotalX(arr, brr);
    }
}

