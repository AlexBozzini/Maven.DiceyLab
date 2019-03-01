import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void constructorTest() {
        // given
        Integer numberOfDice = 2;
        // when
        Dice dice = new Dice(numberOfDice);
        Integer retrievedNumberOfDice = dice.getNumberOfDice();
        // then
        Assert.assertEquals(numberOfDice, retrievedNumberOfDice);
    }

    @Test
    public void getNumberOfDiceTest(){
        // given
        Dice dice = new Dice(2);
        Integer expected = 2;
        // when
        Integer actual = dice.getNumberOfDice();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nullaryConstructorTest(){
        // given
        Integer expectedNumberOfDice = 2;
        // when
        Dice testDice = new Dice();
        // then
        Assert.assertEquals(expectedNumberOfDice, testDice.getNumberOfDice());
    }

    @Test
    public void rollTest(){
        // given
        Dice testDice = new Dice(2, 2L);
        Integer expectedFirstSeed = 4;
        Integer expectedSecondSeed = 3;
        // when
        testDice.rollDice();
        // then
        Assert.assertEquals(expectedFirstSeed, testDice.getValue(0));
        Assert.assertEquals(expectedSecondSeed, testDice.getValue(1));
    }

    @Test
    public void getSumTest(){
        // given
        Dice testDice = new Dice (2, 2L);
        Integer expectedSum = 7;
        // when
        testDice.rollDice();
        Integer actualSum = testDice.getSum();
        // then
        Assert.assertEquals(expectedSum, actualSum);
    }

}
