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

}
