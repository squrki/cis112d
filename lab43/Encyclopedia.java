public class Encyclopedia extends Book {
   // TODO: Declare private fields
   private String edition;
   private int numPages;

   // TODO: Define mutator methods -
   // setEdition(), setNumPages()
   public void setEdition(String s) {
      edition = s;
   }

   public void setNumPages(int n) {
      numPages = n;
   }

   // TODO: Define accessor methods -
   // getEdition(), getNumPages()
   public String getEdition() {
      return edition;
   }

   public int getNumPages() {
      return numPages;
   }

   // TODO: Define a printInfo() method that overrides
   // the printInfo in Book class
   @Override
   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Pages: " + numPages);
   }
}