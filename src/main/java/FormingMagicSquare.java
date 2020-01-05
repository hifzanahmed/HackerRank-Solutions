import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.Math.abs;

public class FormingMagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        /*int rowSum = 0;
        int columnSum = 0;
        int diagonalSum = 0;
        int minSum =0;
        int maxSum = 0;
        int missingNum = 0;
        for (int i = 0; i < s.length; i++) {
            rowSum = 0;
            for (int j = 0; j < s.length; j++) {
                rowSum = rowSum + s[i][j];
                if(i==j){
                    diagonalSum = diagonalSum + s[i][j];
                }

            }
           System.out.println("row:"+rowSum);
        }
        for (int i = 0; i < s.length; i++) {
            columnSum = 0;
            for (int j = 0; j < s.length; j++) {
                columnSum = columnSum + s[j][i];
            }
            System.out.println("column:"+columnSum);
        }
        System.out.println("diagonal:"+diagonalSum);
        maxSum = Math.max(rowSum,columnSum);
        minSum = Math.min(Math.min(rowSum,columnSum),diagonalSum);
        missingNum = maxSum -minSum;*/
        int t[][] =
                {
                        {4,9,2,3,5,7,8,1,6},
                        {4,3,8,9,5,1,2,7,6},
                        {2,9,4,7,5,3,6,1,8},
                        {2,7,6,9,5,1,4,3,8},
                        {8,1,6,3,5,7,4,9,2},
                        {8,3,4,1,5,9,6,7,2},
                        {6,7,2,1,5,9,8,3,4},
                        {6,1,8,7,5,3,2,9,4},
                };
        int cost[] = {0,0,0,0,0,0,0,0};
        for(int i=0;i<8;i++)
        {
            cost[i] = Math.abs(t[i][0]-s[0][0]) + Math.abs(t[i][1]-s[0][1]) + Math.abs(t[i][2]-s[0][2]);
            cost[i] = cost[i] + Math.abs(t[i][3]-s[1][0]) + Math.abs(t[i][4]-s[1][1]) + Math.abs(t[i][5]-s[1][2]);
            cost[i] = cost[i] + Math.abs(t[i][6]-s[2][0]) + Math.abs(t[i][7]-s[2][1]) + Math.abs(t[i][8]-s[2][2]);
        }

        Arrays.sort(cost);
        return cost[0];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        System.out.println("result:"+ result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        scanner.close();
    }
}

