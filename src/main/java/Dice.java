import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    private Integer numberOfDice;
    private Random diceVal;
    private List<Integer> diceValueList = new ArrayList<Integer>();

    public Dice(Integer numberOfDice) {

        this.numberOfDice = numberOfDice;
        this.diceVal = new Random();
        for (int i = 0; i < numberOfDice; i++){
            diceValueList.add(6);
        }
    }

    public Dice() {
        this(2);
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }

    public Dice(Integer numberOfDice, Long seed){
        this(numberOfDice);
        this.diceVal = new Random(seed);
    }

    public Integer getValue(Integer diceNumber){
        return diceValueList.get(diceNumber);
    }

    public void rollDice() {
        for (int i = 0; i < diceValueList.size(); i++){
            diceValueList.set(i, diceVal.nextInt(5)+1);
        }
    }

    public Integer getSum() {
        Integer diceSum = 0;
        for (Integer thisValue : diceValueList){
            diceSum += thisValue;
        }
        return diceSum;
    }
}

