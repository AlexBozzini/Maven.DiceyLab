import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void nullaryConstructorTest(){
        // given
        Dice dice = new Dice(2);
        Bins bins = new Bins();
        Integer expectedLowestRoll = 2;
        Integer expectedHighestRoll = 12;
        // when
        Integer actualLowestRoll = bins.getLowestRoll();
        Integer actualHighestRoll = bins.getHighestRoll();
        // then
        Assert.assertEquals(expectedLowestRoll, actualLowestRoll);
        Assert.assertEquals(expectedHighestRoll, actualHighestRoll);
    }

    @Test
    public void constructorTest(){
        // given
        Dice dice = new Dice(2);
        Bins bins = new Bins(3, 18);
        Integer expectedLowestRoll = 3;
        Integer expectedHighestRoll = 18;
        // when
        Integer actualLowestRoll = bins.getLowestRoll();
        Integer actualHighestRoll = bins.getHighestRoll();
        // then
        Assert.assertEquals(expectedLowestRoll, actualLowestRoll);
        Assert.assertEquals(expectedHighestRoll, actualHighestRoll);
    }

    @Test
    public void getLowestRollTest(){
        // given
        Bins bins = new Bins(2, 12);
        Integer expected = 2;
        // when
        Integer actual = bins.getLowestRoll();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHighestRollTest(){
        // given
        Bins bins = new Bins(2, 12);
        Integer expected = 12;
        // when
        Integer actual = bins.getHighestRoll();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void storeRollTest(){}
}
