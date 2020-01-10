import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ClimbingTheLeaderboard {
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Arrays.sort(alice);
        Arrays.sort(scores);
        int[] result = new int[alice.length];
        ArrayList<Integer> list = new ArrayList<>();
        int lastValue = 0;
        for (int i = 0; i < scores.length; i++) {
            if (lastValue != scores[i]) {
                list.add(scores[i]);
            }
            lastValue = scores[i];
        }
        Collections.reverse(list);
        System.out.println("list = " + list);
        int count = 0;
        for (int i = 0; i < alice.length; i++) {
            count = 0;
            for (Integer itr : list) {
                count++;
                if (alice[i] > itr) {
                    result[i] = count;
                    System.out.println(alice[i] + " = " + count);
                    count = 0;
                    break;
                } else if (alice[i] == itr) {
                    result[i] = count;
                    System.out.println(alice[i] + " = " + count);
                    count = 0;
                    break;
                }
            }
            System.out.println(count);
            if (result[i] == 0) {
                result[i] = count + 1;
            }

        }
        System.out.println(Arrays.toString(result));
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] scores = new int[scoresCount];
        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }
        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] alice = new int[aliceCount];
        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }
        int[] result = climbingLeaderboard(scores, alice);
/*
            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));
                if (i != result.length - 1) {
                    bufferedWriter.write("\n");
                }
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
 */
        scanner.close();
    }
}

