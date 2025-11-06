import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      // Scanner scnr = new Scanner(System.in);

      /* TODO: Declare any necessary variables here. */
      // String filename = scnr.next();
      // FileInputStream fis = new FileInputStream(filename);
      FileInputStream fis = new FileInputStream("/home/kirnk/code/pcc/cis112d/Lab39/StudentInfo.tsv");
      FileOutputStream fos = new FileOutputStream("/home/kirnk/code/pcc/cis112d/Lab39/report.txt");
      PrintWriter pw = new PrintWriter(fos);
      Scanner line = new Scanner(fis);
      String first;
      String last;
      int s1;
      int s2;
      int s3;
      double avg;
      double mt1 = 0;
      double mt2 = 0;
      double fin = 0;
      int sNum = 0;

      /* TODO: Read a file name from the user and read the tsv file here. */
      while (line.hasNext()) {
         first = line.next();
         last = line.next();
         s1 = line.nextInt();
         s2 = line.nextInt();
         s3 = line.nextInt();
         avg = ((double) (s1 + s2 + s3)) / 3;
         String grade;
         if (avg >= 90.0) {
            grade = "A";
         } else if (avg >= 80.0) {
            grade = "B";
         } else if (avg >= 70.0) {
            grade = "C";
         } else if (avg >= 60.0) {
            grade = "D";
         } else {
            grade = "F";
         }
         pw.printf("%s\t%s\t%d\t%d\t%d\t%s\n", first, last, s1, s2, s3, grade);
         mt1 += s1;
         mt2 += s2;
         fin += s3;
         sNum++;
      }

      /*
       * TODO: Compute student grades and exam averages, then output results to a text
       * file here.
       */
      pw.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", mt1 / (double) sNum, mt2 / (double) sNum,
            fin / (double) sNum);
      pw.close();

   }
}