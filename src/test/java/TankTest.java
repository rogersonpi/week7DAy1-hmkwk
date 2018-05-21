import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {


    Tank tank;

    @Before

    public void before() {

        tank = new Tank("Challenger", 500, 100);
    }

    @Test

    public void canGettype(){

        assertEquals("Challenger", tank.getType());
    }
    @Test
    public void canGethealthValue(){

        assertEquals(500, tank.getHealthValue());
    }

}