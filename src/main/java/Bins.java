
public class Bins {
    private Integer lowestRoll;
    private Integer highestRoll;
    private Dice dice;

    public Bins(Integer lowestRoll, Integer highestRoll){
        this.lowestRoll = lowestRoll;
        this.highestRoll = highestRoll;
    }

    public Bins(){
        Dice dice = new Dice(2);
        this.lowestRoll = dice.getNumberOfDice();
        this.highestRoll = dice.getNumberOfDice() * 6;
    }
    public Integer getLowestRoll(){
        return lowestRoll;
    }

    public Integer getHighestRoll() {
        return highestRoll;
    }

    public void storeRoll(){}
}
