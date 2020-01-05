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

class Result1 {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i<grades.size();i++){
            int reminder = grades.get(i)%10;
            if((reminder==5) || (reminder==0) || (grades.get(i)<=37)){
                output.add(grades.get(i));
            } else if((reminder<=2) || ((reminder>5) && (reminder<=7))) {
               output.add(grades.get(i));
            } else if(reminder<5){
                output.add(grades.get(i)+(5-reminder));
            } else {
                output.add(grades.get(i)+(10-reminder));
            }
        }
        System.out.println(output);
        return output;
    }

}

public class GradingStudent {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> result = Result.gradingStudents(grades);
        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );
        bufferedReader.close();
        bufferedWriter.close();

         */
        System.out.println("Enter the grades size : ");
        int gradesSize = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("Enter the grades one by one :");
        for(int i=0; i<gradesSize;i++){
            grades.add(scanner.nextInt());
            scanner.nextLine();
        }
        System.out.println(Result1.gradingStudents(grades));
    }
}

