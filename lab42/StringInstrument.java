// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   // TODO: Declare private fields
   private int numStrings;
   private int numFrets;
   private boolean isBowed;

   // TODO: Define mutator methods -
   public void setNumOfStrings(int n) {
      numStrings = n;
   }

   public void setNumOfFrets(int n) {
      numFrets = n;
   }

   public void setIsBowed(boolean b) {
      isBowed = b;
   }

   // TODO: Define accessor methods -
   // getNumOfStrings(), getNumOfFrets(), getIsBowed()
   public int getNumOfStrings() {
      return numStrings;
   }

   public int getNumOfFrets() {
      return numFrets;
   }

   public boolean getIsBowed() {
      return isBowed;
   }
}
