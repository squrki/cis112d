import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();

      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();

      // TODO: Create generic pet (using petName, petAge) and then call printInfo
      Pet pet = new Pet();
      pet.setName(petName);
      pet.setAge(petAge);
      pet.printInfo();

      // TODO: Create cat pet (using catName, catAge, catBreed) and then call
      // printInfo
      Cat cat = new Cat();
      cat.setName(catName);
      cat.setAge(catAge);
      cat.setBreed(catBreed);
      cat.printInfo();
      // TODO: Use getBreed(), to output the breed of the cat
      System.out.printf("   Breed: %s\n", cat.getBreed());
   }
}