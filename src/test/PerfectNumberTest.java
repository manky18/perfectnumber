package test;

import main.PerfectNumber;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class PerfectNumberTest {

    @Test
    public void aNumberThatIsAPerfectNoTest() {
        int knownPerfectNumber = 6;
        boolean result = PerfectNumber.isPerfectNumber(knownPerfectNumber);
        Assert.assertTrue("Given Number is not a perfect number", result);
    }

    @Test
    public void aNumberThatIsNotAPerfectNoTest() {
        int knownNonPerfectNumber = 5;
        boolean result = PerfectNumber.isPerfectNumber(knownNonPerfectNumber);
        Assert.assertFalse("Given Number is a perfect number", result);
    }

    @Test
    public void aNegativeNumberIsNotAPerfectNoTest() {
        int number = -6;
        boolean result = PerfectNumber.isPerfectNumber(number);
        Assert.assertFalse("Given Number is a perfect number", result);
    }

    @Test
    public void findPerfectNumberInGivenRangeTest() {
        int startingNumber = 33550300;
        int endingNumber = 33550400;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(33550336);

        ArrayList<Integer> actual = new ArrayList<>();

        if(startingNumber % 2 != 0) {
            startingNumber = startingNumber + 1;
        }

        for (int i = startingNumber; i <= endingNumber; i+=2) {
            if (i % 10 == 6 || i % 10 == 8) {
                if (PerfectNumber.isPerfectNumber(i)) {
                    actual.add(i);
                }
            }
        }
        Assert.assertEquals(actual,expected);
    }

}
