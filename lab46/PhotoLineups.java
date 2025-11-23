import java.util.Scanner;
import java.util.ArrayList;
// Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings). 
// The program will read a list of one word names into ArrayList nameList (until -1), 
// and use a recursive method to create and output all possible orderings of those names separated by a comma, one ordering per line.

// When the input is:

// Julia Lucas Mia -1

// then the output is (must match the below ordering):

// Julia, Lucas, Mia 
// Julia, Mia, Lucas
// Lucas, Julia, Mia
// Lucas, Mia, Julia
// Mia, Julia, Lucas
// Mia, Lucas, Julia

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of
   // names.
   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      String name;
      String line;
      int i;

      if (nameList.size() == 0) {
         System.out.println(permList);
      } else {
         for (i = 0; i < nameList.size(); i++) {
            name = nameList.get(i);
            nameList.remove(i);
            permList.add(name);

            printAllPermutations(permList, nameList);

            nameList.add(i, name);

         }
      }
      // for (String n : nameList)
      // for (int i = 0; i < nameList.size() - 1; i++)
      // permList.add(n);
      // }else

      // {

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;

      // TODO: Read a list of names into nameList; stop when -1 is read. Then call
      // recursive method.
      name = scnr.next();
      while (!name.equals("-1")) {
         nameList.add(name);
         name = scnr.next();
      }

      printAllPermutations(permList, nameList);

   }
}
