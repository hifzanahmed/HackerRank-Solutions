import java.io.*;
import java.math.*;
import java.sql.Time;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String s1 = s.substring(0, 8);
        int hr = Integer.parseInt(s1.substring(0, 2));
        String output;
        if (s.substring(8).equals("AM")) {
            if (hr >= 12) {
                output = "00" + s1.substring(2);
            } else {
                output = s.substring(0, 8);
            }
            return output;
        } else if (s.substring(8).equals("PM")) {
            if (hr != 12) {
                hr += 12;
            }
            if (hr >= 24) {
                output = "00" + s1.substring(2);
            } else {
                String hrs = Integer.toString(hr);
                System.out.println(hr);
                output = hrs + s1.substring(2);
                System.out.println(output);
            }
            return output;
        }

        return null;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the time : ");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
            /*bw.write(result);
            bw.newLine();
            bw.close();
             */
    }
}

