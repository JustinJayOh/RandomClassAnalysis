/**
* Outputs a file to analyze how random the pseudorandom numbers are in the Math.Random class.
*
* @author Justin Oh
* @email jjoh1993@gmail.com
* @version 02/17/2019
*/

import java.io.PrintWriter;
import java.io.File;

public class RandomTest {

   public static void main(String[] args) throws Exception {
   
      PrintWriter writer = new PrintWriter("RandomTest.txt");
   
      int[] randomOccurences = new int[100];
      int randomNumber;
   
   // Generates 1,000 random numbers and increments at the random number index.
      for (int i = 0; i < 1000000000; i++) {
         randomNumber = (int) (Math.random() * 100);
         randomOccurences[randomNumber]++;
      }
   
   // Will output a File with 1st column: index, 2nd column: number of occurences
      for (int j = 0; j < 100; j++) {
         writer.println(j + ", " + randomOccurences[j]);
      }
   
      writer.close();
   
   }
}