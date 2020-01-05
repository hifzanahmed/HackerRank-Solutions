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

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        System.out.println(arr);
        int firstValue=arr.get(0);
        int lastValue=arr.get(arr.size()-1);
        int sum=0;
        int sum1=0;
        int count=0;
        int result=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(firstValue==arr.get(i)){
                sum++;
            } else{
                System.out.println(arr.get(i-1)  + " " + sum);
                System.out.println("count="+count+" sum="+sum);
                if(count<sum){
                    count=sum;
                    result=arr.get(i-1);
                }
                sum=1;
                firstValue=arr.get(i);
            }
            if(lastValue==arr.get(i)){
                sum1++;
            }
            if(count<sum1){
                result=arr.get(i);
            }
        }

        System.out.println("Result : "+ result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        /*        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
         */
        bufferedReader.close();

    }
}

