import java.util.Scanner;

public class Lab22 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] words = new String[20];

      int numElements = scnr.nextInt();

      for (int i = 0; i < numElements; i++) {
         words[i] = scnr.next();
      }

      String ch = scnr.next();

      for (int i = 0; i < numElements; i++) {
         if (words[i].contains(ch)) {
            System.out.printf("%s,", words[i]);
         }


      }
      System.out.println();

      scnr.close();

   }
}
/*
 * 
 * for (int i = 0; i < numElements; i++) {
 * if (words[i].contains(ch)) {
 * System.out.printf("%s,", words[i]);
 * }
 * 
 * }
 * 
 */