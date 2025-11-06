import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      // Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      // String filename = scnr.nextLine();
      // FileInputStream fis = new FileInputStream(filename);
      FileInputStream fis = new FileInputStream("/home/kirnk/code/pcc/cis112d/Lab40/food.txt");
      Scanner line = new Scanner(fis);
      while (line.hasNextLine()) {
         String[] item = line.nextLine().split("\t");
         if (item[3].equals("Available"))
            System.out.printf("%s (%s) -- %s\n", item[1], item[0], item[2]);
      }

      line.close();
   }
}
