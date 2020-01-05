import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (((x1 < x2) && (v1 < v2)) || ((x1 > x2) && (v1 > v2))) {
            System.out.println("here1");
            return "NO";
        }
        if(((v2-v1)!=0)&&((x1-x2) % (v2-v1) == 0)){
            return "YES";
        }
        int sum1 = x1+v1;
        int sum2 = x2+v2;
        if(sum1<sum2){
            if(sum2%sum1==0){
                return "YES";
            }
        }else if(sum1>sum2){
            if(sum1%sum2==0){
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] x1V1X2V2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1V1X2V2[0]);
        int v1 = Integer.parseInt(x1V1X2V2[1]);
        int x2 = Integer.parseInt(x1V1X2V2[2]);
        int v2 = Integer.parseInt(x1V1X2V2[3]);
        String result = kangaroo(x1, v1, x2, v2);
            /*
            bufferedWriter.write(result);
            bufferedWriter.newLine();
            bufferedWriter.close();
             */
        System.out.println(result);
        scanner.close();
    }
}

