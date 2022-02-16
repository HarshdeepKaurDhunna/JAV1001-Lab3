package labClassesObjects;

/**
 * @author Name: Harshdeep Kaur Dhunna
 */

public class Die {

    protected String diceType;
    protected int sidesNumber;
    protected int currentUpSide;

    public Die() {
        diceType = "D6";
        sidesNumber = 6;
        rollDice();
    }

    public Die(int sidesNumber) {
        this.sidesNumber = sidesNumber;
        diceType = "D20";
        rollDice();
    }

    public Die(String diceType, int sidesNumber) {
        this.sidesNumber = sidesNumber;
        this.diceType = diceType;
        rollDice();
    }

    public void rollDice() {
        currentUpSide = (int) ((Math.random() * sidesNumber) + 1);
    }

    public String getDiceType() {
        return this.diceType;
    }

    public int getSidesNumber() {
        return this.sidesNumber;
    }
    
    public int getCurrentUpSide() {
        return this.currentUpSide;
    }

    public void setDiceType(String diceType) {
        this.diceType = diceType;
    }

    public void setSidesNumber(int sidesNumber) {
        this.sidesNumber = sidesNumber;
    }

    public void setCurrentUpSide(int currentUpSide) {
        this.currentUpSide = currentUpSide;
    }

}