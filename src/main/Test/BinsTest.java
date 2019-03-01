import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void constructorTest(){
        // given
        Integer expectedLowestRoll = 2;
        Integer expectedHighestRoll = 12;
        // when
        Bins testBin = new Bins();
        // then
        Assert.assertEquals(expectedLowestRoll, testBin.getLowestRoll());
        Assert.assertEquals(expectedHighestRoll, testBin.getHighestRoll());
    }
}
