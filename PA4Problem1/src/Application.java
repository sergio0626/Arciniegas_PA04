public class Application {
	//remove goes first!

   public static void main(String[] args) {
      
       DuplicateRemover duplicateRemover = new DuplicateRemover();
      
       duplicateRemover.remove("problem1.txt");
       duplicateRemover.write("unique_words.txt");
      
   }
}