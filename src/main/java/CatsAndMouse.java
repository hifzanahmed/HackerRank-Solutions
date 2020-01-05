import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
int PosCatA ;
int PosCatB ;
String wins = null;
PosCatA = Math.abs(z-x);
PosCatB = Math.abs(z-y);
if(PosCatA > PosCatB)
{
    wins = "Cat B";
}
if(PosCatB > PosCatA)
{
    wins = "Cat A";
}
if ( PosCatA == PosCatB)
{
    wins=  "Mouse C";
}
    return wins;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = 2;//scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //for (int qItr = 0; qItr < q; qItr++) {
            //String[] xyz = scanner.nextLine().split(" ");

            /*int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);*/

            String result = catAndMouse(1, 3, 2);
        System.out.println("Winner is:" +  result);

            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
       // }

        //bufferedWriter.close();

        //scanner.close();
    }
}
