package labClassesObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Name: Harshdeep Kaur Dhunna
 *         Student number: A00246003
 *         Program description: JAV-1001 - 11329 - App Development for Android -
 *         202201 - 001
 *         Compile the whole package: javac -cp . .\labClassesObjects\*.java
 *         Run the class containing Main Method: java labClassesObjects.DiceGame
 */

public class DiceGame {

    /**
     * @method Main method
     * @param args
     * @input Collect a numeric value current unit of measurement from the user.
     * @see Display the new result after Conversion
     */
    public static void main(String[] args) {

        Die die = new Die(); // Calling 0 argument default constructor by intiating Die class
        Die die2 = new Die(20); // Calling 1 argument default constructor 
        Die die3 = new Die("Percentile", 10); // Calling 2 argument default constructor

        System.out.println("Creating a default d6...");
        System.out.println("Creating a d20...");
        System.out.println("Creating percentile die (a special d10)...");
        System.out.println("");

        //using the objects and accessors of Die class to retrieving value to print the each Die's type and current Up side 
        System.out.println("The current side up for " + die.getDiceType() + " is " + die.getCurrentUpSide());
        System.out.println("The current side up for " + die2.getDiceType() + " is " + die2.getCurrentUpSide());
        System.out.println("The current side up for " + die3.getDiceType() + " is " + die3.getCurrentUpSide());
        System.out.println("");

        //Rolling the dice again by calling rollDice() method from objects of die class
        die.rollDice(); 
        die2.rollDice(); 
        die3.rollDice(); 

        //Print the new generated random value from rollDice() method
        System.out.println("Testing the roll method");
        System.out.println("");
        System.out.println("Rolling the " + die.getDiceType() + "...");
        System.out.println("The new value is " + die.getCurrentUpSide());
        System.out.println("Rolling the " + die2.getDiceType() + "...");
        System.out.println("The current side up for " + die2.getDiceType() + " is " + die2.getCurrentUpSide());
        System.out.println("Rolling the " + die3.getDiceType() + "... ");
        System.out.println("The new value is " + die3.getCurrentUpSide());
        
        getHighestRoll(die);  //Method call to print highest value of D6 passing its object as method argument;
        getAllEqualRoll(); //Method call to print 5 of a kind of D6

    }

    /**
     * Prints Highest value od D6
     */
    public static void getHighestRoll(Die dieRoll) {
        System.out.println("");
        System.out.println("Setting the d6 to show 6...");
        dieRoll.setCurrentUpSide(6);
        System.out.println("The side up is now " + dieRoll.getCurrentUpSide() + ". Finally.");
    }

    /**
     * print 5 of a kind of D6
     */
    public static void getAllEqualRoll() {

        //Create a array list of Die object 
        List<Die> DieList = new ArrayList<Die>();
        for(int i=0; i < 5; i++) {
            Die die = new Die();
            DieList.add(die);
        }
        int rollCount = 0;

        System.out.println("");
        System.out.println("Rolling...... 5 D6 to get 5 of a kind");
        System.out.println("");

        ArrayList<Integer> currentSideList; // array list contains current side up of each die to compare them 

        //loop to check if the side are equal or not
        do {
            DieList.get(0).rollDice();
            DieList.get(1).rollDice();
            DieList.get(2).rollDice();
            DieList.get(3).rollDice();
            DieList.get(4).rollDice();
            rollCount++;
            currentSideList = new ArrayList<Integer>();
            currentSideList.add(DieList.get(0).getCurrentUpSide());
            currentSideList.add(DieList.get(1).getCurrentUpSide());
            currentSideList.add(DieList.get(2).getCurrentUpSide());
            currentSideList.add(DieList.get(3).getCurrentUpSide());
            currentSideList.add(DieList.get(4).getCurrentUpSide());
           
            //Java 8 streams check if all element of list are equal or not
        } while (currentSideList.stream().distinct().count() != 1);
        System.out.println("Equal Sides of 5 D6 " + currentSideList.toString().replaceAll("^.|.$", ""));
        System.out.println("");
        System.out.println("YAHTZEE!!!!!!!! It took " + rollCount + " rolls"); 
    } 
}
