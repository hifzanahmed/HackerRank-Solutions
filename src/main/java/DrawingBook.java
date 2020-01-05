import com.sun.deploy.security.SelectableSecurityManager;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    static int pageCount(int n, int p) {
        int frontCount =0;
        int backCount = 0;
        if(n%2==0)
        {

            frontCount = frontCount + p/2;
            backCount = backCount + (n/2 -frontCount);

        }
        else if (n%2 != 0)
        {
            frontCount = frontCount + p/2;
            backCount = backCount + (n/2 -frontCount);
        }
        else if (n==p)
        {
           frontCount = 0;
        }
        if(frontCount > backCount)
            return backCount;
        else if(frontCount < backCount)
            return frontCount;
        else
            return frontCount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");*/

        int result = pageCount(83246, 78132);
        System.out.println("page count:"+ result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();*/

        //bufferedWriter.close();

        //scanner.close();
    }
}

