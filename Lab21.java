import java.util.Scanner;
import java.util.HashMap;

public class Lab21 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] words = new String[20];
      HashMap<String, Integer> map = new HashMap<>();

      int numElements = scnr.nextInt();

      for (int i = 0; i < numElements; i++) {
         words[i] = scnr.next();
         if (map.containsKey(words[i])) {
            map.put(words[i], map.get(words[i]) + 1);
         } else {
            map.put(words[i], 1);
         }
      }

      for (int i = 0; i < numElements; i++) {
         System.out.printf("%s - %d\n", words[i], map.get(words[i]));
      }

      scnr.close();

   }
}
