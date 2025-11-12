import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or
   // flower) objects
   public static void printArrayList(ArrayList<Plant> a) {
      for (int i = 0; i < a.size(); i++) {
         System.out.printf("Plant %d Information: \n", i + 1);
         a.get(i).printInfo();
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<>();
      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost,
      // colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String flowerName;
      String flowerCost;
      String colorOfFlowers;
      boolean isAnnual;

      input = scnr.next();
      while (!input.equals("-1")) {
         // TODO: Check if input is a plant or flower
         switch (input) {
            case "plant":
               plantName = scnr.next();
               plantCost = scnr.next();
               Plant p = new Plant();
               p.setPlantName(plantName);
               p.setPlantCost(plantCost);
               myGarden.add(p);
               break;
            case "flower":
               Flower f = new Flower();
               flowerName = scnr.next();
               flowerCost = scnr.next();
               isAnnual = scnr.nextBoolean();
               colorOfFlowers = scnr.next();
               f.setPlantName(flowerName);
               f.setPlantCost(flowerCost);
               f.setColorOfFlowers(colorOfFlowers);
               f.setPlantType(isAnnual);
               myGarden.add(f);
               break;
         }
         // Store as a plant object or flower object

         // Add to the ArrayList myGarden

         input = scnr.next();
      }

      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
