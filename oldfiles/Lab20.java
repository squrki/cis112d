import java.util.Scanner;

public class Lab20 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] userValues = new double[20]; // List of integers from input
      double max = 0.0;

      int numElements = scnr.nextInt(); // Input begins with number of integers that follow

      for (int i = 0; i < numElements; i++) {
         userValues[i] = scnr.nextDouble();
         if (max < userValues[i]) {
            max = userValues[i];
         }
      }

      for (int i = 0; i < numElements; i++) {
         System.out.printf("%.2f ", userValues[i] / max);
      }
      System.out.println();
      scnr.close();
   }
}
