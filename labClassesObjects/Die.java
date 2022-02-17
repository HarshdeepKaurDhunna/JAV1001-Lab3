package labClassesObjects;

/**
 * @author Name: Harshdeep Kaur Dhunna
 */

public class Die {

    /**
     * protected modifier to indicate variables are not intended to be publicly
     * accessible
     * but should be accessible publicly via getter and setters.
     */
    protected String diceType;
    protected int sidesNumber;
    protected int currentUpSide;

    // The default constructor is the no-argument constructor uninitialised fields
    // will be set to their default values.
    public Die() {
        diceType = "D6";
        sidesNumber = 6;
        rollDice(); // calling the rollDice to get value for current side up
    }

    // A parameterized constructor to initialize fields of the class with our own
    // values. Passing number of sides as a parameter
    public Die(int sidesNumber) {
        diceType = "D20";
        this.sidesNumber = sidesNumber;
        rollDice();
    }

    // Passing two parameters dice type and number of sides in parameterized
    // constructor
    public Die(String diceType, int sidesNumber) {
        this.diceType = diceType;
        this.sidesNumber = sidesNumber;
        rollDice();
    }

    /**
     * Method to generate Random values to get the roll for a dice
     * and stores it in currentUpSide variable
     */
    public void rollDice() {

        // if percentile dice the generate two random numbers else one
        if (this.diceType.equals("Percentile")) {
            int percentileDice = 100;
            currentUpSide = (int) ((Math.random() * sidesNumber));
            percentileDice = (int) ((Math.random() * percentileDice));
            currentUpSide = currentUpSide + percentileDice;
        } else {
            currentUpSide = (int) ((Math.random() * sidesNumber) + 1);
        }
    }

    /**
     * To get for DiceType
     * 
     * @return returns the dice type
     */
    public String getDiceType() {
        return this.diceType;
    }

    /**
     * Getter
     * 
     * @return number of sides of dice
     */
    public int getSidesNumber() {
        return this.sidesNumber;
    }

    /**
     * Getter
     * 
     * @return current
     */
    public int getCurrentUpSide() {
        return this.currentUpSide;
    }

    /**
     * Setter
     * 
     * @param diceType
     */
    public void setDiceType(String diceType) {
        this.diceType = diceType;
    }

    /**
     * Setter
     * 
     * @param sidesNumber
     */
    public void setSidesNumber(int sidesNumber) {
        this.sidesNumber = sidesNumber;
    }

    /**
     * Setter
     * 
     * @param currentUpSide
     */
    public void setCurrentUpSide(int currentUpSide) {
        this.currentUpSide = currentUpSide;
    }

}