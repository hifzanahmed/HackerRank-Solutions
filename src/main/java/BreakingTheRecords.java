import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingTheRecords {
        // Complete the breakingRecords function below.
        static int[] breakingRecords(int[] scores) {
            int baseScore = scores[0];
            int baseMinScore = baseScore;
            int totalRecordsBreak=0;
            int totalWrostRecord=0;
            int[] output = new int[2];
            for(int i=0; i<scores.length;i++){
                if(scores[i]>baseScore){
                    baseScore=scores[i];
                    totalRecordsBreak++;
                }
                if(scores[i]<baseMinScore){
                    baseMinScore=scores[i];
                    totalWrostRecord++;
                }
            }
            System.out.println(totalRecordsBreak);
            System.out.println(totalWrostRecord);
            output[0] = totalRecordsBreak;
            output[1] = totalWrostRecord;
            return output;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            /*
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] scores = new int[n];

            String[] scoresItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int scoresItem = Integer.parseInt(scoresItems[i]);
                scores[i] = scoresItem;
            }
             */
            //int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
            int[] scores ={3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
            int[] result = breakingRecords(scores);
            /*
            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));
                                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }            bufferedWriter.newLine();
            bufferedWriter.close();
            scanner.close();
             */
        }
    }

