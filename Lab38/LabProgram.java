import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String filename = scnr.next();
      FileInputStream file = new FileInputStream(filename);
      Scanner inFS = new Scanner(file);
      while (inFS.hasNext()) {
         String data = inFS.nextLine();
         String d = data.replace("photo.jpg", "info.txt");
         System.out.println(d);
      }
      scnr.close();
      inFS.close();
      file.close();
   }
}
