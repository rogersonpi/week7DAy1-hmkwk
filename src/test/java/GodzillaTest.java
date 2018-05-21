import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before(){

        this.tank = new Tank ("Challenger", 500, 100);

        this.godzilla = new Godzilla (800, 200);
    }

    @Test
    public void canGetHealthValue(){

        assertEquals(800, godzilla.getHealthValue());
    }
    @Test
    public void canGetAttackValue(){

        assertEquals(200, godzilla.getAttackValue());
    }

    @Test
    public void canRoar(){

        assertEquals("Grrraaaaaarrrr", godzilla.roar());

    }

    @Test
    public void canFightTank (){

        godzilla.attack(tank);
        assertEquals(300, tank.getHealthValue());
    }
}
