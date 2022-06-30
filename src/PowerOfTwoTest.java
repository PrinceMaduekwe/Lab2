import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    public void TestingPowerOfTwo(){
        Power po2 = new Power();
        boolean isPower = po2.isPowerOfTwo(7);
        assertTrue(isPower);




    }


}