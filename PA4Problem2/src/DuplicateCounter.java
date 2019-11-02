
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.FileNotFoundException;

public class DuplicateCounter
{
   private Map<String, Integer> wordCounter;
  
   public DuplicateCounter(){
       wordCounter = new HashMap<String,Integer>();
   }
  
   public void count(String dataFile){
	   Scanner filein;
       try {
           filein = new Scanner(new File(dataFile));
       } catch (FileNotFoundException e) {
           System.out.println("Check the input file");
           return;
       }
       finally {
    	   System.out.println("Input file read");
       }
       while(filein.hasNext()) {
           String WORD = filein.next().toLowerCase();
           Integer Count = wordCounter.get(WORD); 
           if(Count == null)
               Count = 1;
           else
               Count = 1+ Count;
           wordCounter.put(WORD, Count);
       }
       filein.close(); //close it
   }
  
   public void write(String outputFile){
       
       try {
           PrintWriter putFile = new PrintWriter(new File(outputFile));
           for(String k : wordCounter.keySet()) {
               putFile.println(k + " " + wordCounter.get(k));
           }
           putFile.close();
           
       } catch (FileNotFoundException e) {
           System.out.println("check input file");
       }
       finally {
    	   System.out.print("code works!");
       }
       
   }
   
}
