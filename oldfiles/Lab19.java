import java.util.Scanner;

public class Lab19 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20]; // List of integers from input

      int numElements = scnr.nextInt(); // Input begins with number of integers that follow

      for (int i = 0; i < numElements; i++) {
         userValues[i] = scnr.nextInt();
      }

      int threshold = scnr.nextInt(); // Input begins with number of integers that follow

      for (int i = 0; i < numElements; i++) {
         if (userValues[i] <= threshold) {
            System.out.printf("%d,", userValues[i]);
         }
      }
      System.out.println();
      scnr.close();
   }
}
