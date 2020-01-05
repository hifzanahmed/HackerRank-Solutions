
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.YearMonth;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int DayOfProgrammer = 256;
        int daysInMonth = 0;
        int dayCounter = 0;
        int remainDays = 0;
        int month = 0 ;
        String foundDay;
       if(year != 1918) {
           for (int i = 1; i <= 12; i++) {
               if (year >= 1700 && year <= 1917) {
                   if (year % 4 == 0)
                   {
                       // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                       if (i == 2) {
                           daysInMonth = 29;
                       }
                       else
                           {
                           YearMonth yearMonthObject = YearMonth.of(year, i);
                           daysInMonth = yearMonthObject.lengthOfMonth();
                       }
                   }
                   else
                   {
                       YearMonth yearMonthObject = YearMonth.of(year, i);
                       daysInMonth = yearMonthObject.lengthOfMonth();
                   }
               } else if (year >= 1919 && year <= 2700) {
                   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                       if (i == 2) {
                           daysInMonth = 29;
                       } else {
                           YearMonth yearMonthObject = YearMonth.of(year, i);
                           daysInMonth = yearMonthObject.lengthOfMonth();
                       }
                   } else if (year % 4 == 0 && year % 100 == 0) {
                       if (i == 2) {
                           daysInMonth = 28;
                       } else {
                           YearMonth yearMonthObject = YearMonth.of(year, i);
                           daysInMonth = yearMonthObject.lengthOfMonth();
                       }
                   }
                   else
                       {
                       YearMonth yearMonthObject = YearMonth.of(year, i);
                       daysInMonth = yearMonthObject.lengthOfMonth();
                   }
               }

               dayCounter = dayCounter + daysInMonth;
               remainDays = DayOfProgrammer - dayCounter;
               if (remainDays < 30) {
                   month = i + 1;
                   break;
               }
           }
       }

          if(year == 1918)
              {
               for (int i = 1; i <= 12; i++) {
                   if (i == 2) {
                       daysInMonth = 15;
                   } else {
                       YearMonth yearMonthObject = YearMonth.of(year, i);
                       daysInMonth = yearMonthObject.lengthOfMonth();
                   }
                   dayCounter = dayCounter + daysInMonth;
                   remainDays = DayOfProgrammer - dayCounter;
                   if (remainDays < 30) {
                       month = i + 1;
                       break;
                   }

               }
           }

  return remainDays+"."+String.format("%02d", month)+"."+year;

    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());*/

        String result = dayOfProgrammer(1917);

        /*bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        System.out.println("Day:" + result);
    }
}

