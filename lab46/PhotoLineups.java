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
   // public static void printAllPermutations(ArrayList<String> permList,
   // ArrayList<String> nameList) {

   public static void printAllPermutations(ArrayList<String> currentList, ArrayList<String> remainingList) {
      // String name;
      // String line = "";
      // int i;

      // if (nameList.size() == 0 || nameList.size() == 1) {
      // System.out.println(nameList.toString());
      // } else {
      // for (i = 0; i < nameList.size(); i++) {
      // for (int j = 0; j < nameList.size(); j++) {
      // line.concat(nameList.get(i));
      // if (j < nameList.size() -1) {
      // line.concat(", ");
      // }
      // }

      // name = nameList.get(i);
      // tempList.addAll(nameList);
      // tempList.remove(i);

      // printAllPermutations(permList, nameList);

      // nameList.add(i, name);

      // }
      // }
      // // for (String n : nameList)
      // // for (int i = 0; i < nameList.size() - 1; i++)
      // // permList.add(n);
      // // }else

      // // {
      // for (String perm : permList) {
      // System.out.println(perm);
      // }
      // Base Case: If there are no names left to choose from,
      // the current list is a complete permutation. Print it.
      if (remainingList.isEmpty()) {
         // Output the permutation separated by a comma and space.
         System.out.println(String.join(", ", currentList));
         return;
      }

      // Recursive Step: Iterate through all available names in the remainingList.
      for (int i = 0; i < remainingList.size(); i++) {

         // 1. CHOOSE: Select a name from the remaining list.
         String chosenName = remainingList.get(i);

         // 2. EXPLORE: Update the lists for the recursive call.

         // Add the chosen name to the current line-up being built.
         currentList.add(chosenName);

         // Remove the name from the remaining pool using its index.
         remainingList.remove(i);

         // Recurse to fill the next spot in the line-up.
         printAllPermutations(currentList, remainingList);

         // 3. BACKTRACK: Undo the changes to the lists to try the next choice.

         // Put the name back into the remaining list at the same index it was removed
         // from.
         remainingList.add(i, chosenName);

         // Remove the name from the current line-up (it's always the last element).
         currentList.remove(currentList.size() - 1);
      }
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
