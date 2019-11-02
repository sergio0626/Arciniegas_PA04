
public class Application {
   public static void main(String[] args) {
       String inoutputFile = "problem2.txt";
       String outoutputFile = "unique_word_counts.txt";
       DuplicateCounter duplicateCounter = new DuplicateCounter();
       duplicateCounter.count(inoutputFile);
       duplicateCounter.write(outoutputFile);
   }
}