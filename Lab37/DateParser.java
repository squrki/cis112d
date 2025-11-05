import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;

      // Java switch/case statement
      switch (monthString) {
         case "January":
            monthInt = 1;
            break;
         case "February":
            monthInt = 2;
            break;
         case "March":
            monthInt = 3;
            break;
         case "April":
            monthInt = 4;
            break;
         case "May":
            monthInt = 5;
            break;
         case "June":
            monthInt = 6;
            break;
         case "July":
            monthInt = 7;
            break;
         case "August":
            monthInt = 8;
            break;
         case "September":
            monthInt = 9;
            break;
         case "October":
            monthInt = 10;
            break;
         case "November":
            monthInt = 11;
            break;
         case "December":
            monthInt = 12;
            break;
         default:
            monthInt = 0;
      }

      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the ones
      // in the correct format, and output in m-d-yyyy format
      String dateStr = scnr.nextLine();
      // System.out.println(dateStr);
      while (!dateStr.equals("-1")) {
         String[] dateArray = dateStr.split(" ");
         if (dateArray.length != 3) {
            dateStr = scnr.nextLine();
            continue;
         }
         String outputStr = String.valueOf(getMonthAsInt(dateArray[0]));
         if (outputStr == "0") {
            dateStr = scnr.nextLine();
            continue;
         }
         if (!dateArray[1].contains(",")) {
            dateStr = scnr.nextLine();
            continue;
         }
         dateArray[1] = dateArray[1].replace(",", "");
         outputStr += "-" + dateArray[1];
         if (dateArray[2].length() != 4) {
            dateStr = scnr.nextLine();
            continue;
         }
         outputStr += "-" + dateArray[2];
         System.out.println(outputStr);
         dateStr = scnr.nextLine();
         if (dateStr == "-1") {
            // System.out.println(dateStr);
            break;
         }
      }
      scnr.close();
   }
}
