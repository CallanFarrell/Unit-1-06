import java.util.Random;
import java.util.Scanner;
/**
* Created by: Callan Farrell.
* Created on: Feb 2020
* Created for: ICS4U
*/

public class DiceRun {
  /**
  *
  */
   
  public static void main(String[] arg) {

    int maxValue;
    int randNum;

    maxValue = 0;
    randNum = 0;

    Scanner userInput = new Scanner(System.in);

    while (maxValue <= 0) {

      System.out.print("Enter a positive integer for the max value: ");
      maxValue = userInput.nextInt();
    }
    
    randNum = rolldie(maxValue);
    System.out.print("Your number is " + randNum + ".");

  }
  
  /**
  * Comment
  */ 
  
  public static int rolldie(int maxValue) {
    
    Random randGen = new Random();

    int randNum;

    randNum = randGen.nextInt(maxValue) + 1;
    return randNum;
  }
}