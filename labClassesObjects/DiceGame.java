package labClassesObjects;

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

        Die die = new Die();

        Die die2 = new Die(20);

        Die die3 = new Die("Percentile", 10);

        System.out.println("Creating a default d6...");
        System.out.println("Creating a d20...");
        System.out.println("Creating percentile die (a special d10)...");
        System.out.println("");
        System.out.println("The current side up for " + die.getDiceType() + " is " + die.getCurrentUpSide());
        System.out.println("The current side up for " + die2.getDiceType() + " is " + die2.getCurrentUpSide());
        System.out.println("The current side up for " + die3.getDiceType() + " is " + die3.getCurrentUpSide());
        System.out.println("");

        die = new Die();
        die2 = new Die(20);
        die3 = new Die("Percentile", 10);

        System.out.println("Testing the roll method");
        System.out.println("");
        System.out.println("Rolling the " + die.getDiceType() + "...");
        System.out.println("The new value is " + die.getCurrentUpSide());
        System.out.println("Rolling the " + die2.getDiceType() + "...");
        System.out.println("The current side up for " + die2.getDiceType() + " is " + die2.getCurrentUpSide());
        System.out.println("Rolling the " + die3.getDiceType() + "... ");
        System.out.println("The new value is " + die3.getCurrentUpSide());

    }

    public static void highestRoll() {
        Die dieRoll = new Die();
        int rollCount = 0;
        System.out.println("");
        System.out.println("Rolling...... " + dieRoll.diceType + "  to show it's highest value");

        do {
            dieRoll.rollDice();
            System.out.println("The dice come up " + dieRoll.getCurrentUpSide());
            rollCount++;
        } while (dieRoll.getCurrentUpSide() != dieRoll.getSidesNumber());
        System.out.println("\nIt took " + rollCount + " rolls to get a " + dieRoll.getSidesNumber());
    }

   
}