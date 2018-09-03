package UnitTesting;

import org.testng.Assert;

public class TestUnitTest {
    public static void main(String[] args) {

        Unit_Test test = new Unit_Test();

        int multi = test.multiple(4, 6, 8);
        Assert.assertEquals(192, multi);

        int addi = test.addtion(45, 15);
        Assert.assertEquals(60, addi);

        int divi = test.division(44, 4, 17);
        Assert.assertEquals(30,divi);
        // line no 17 has inserted wrong value, so that we can see the test result is fail.
    }
}
