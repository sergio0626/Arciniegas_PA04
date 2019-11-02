import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintWriter;

public class DuplicateRemover {

   private Set<String> uniqueWords;

   public void remove(String dataFile) {

       try {
           Scanner copy = new Scanner(new File(dataFile));

           while (copy.hasNext()) {

               uniqueWords.add(copy.next());
           }
           copy.close();
       } catch (FileNotFoundException e) {
           System.out.println("File has not been read, program terminated.");
       }
       finally {
    	   System.out.println("Input file has been read.");
       }

   }

   public void write(String outputFile) {
       try {
           PrintWriter filedata = new PrintWriter(new File(outputFile));

           for (String string : uniqueWords) {

               filedata.println(string);
           }
           filedata.flush();
           filedata.close();
       } catch (FileNotFoundException e) {
    	   System.exit(0); //if no input file program will terminate;
       }
       finally {
    	   System.out.println("Code works");
       }
   }
   public DuplicateRemover() {

       uniqueWords = new HashSet<>();
   }
}