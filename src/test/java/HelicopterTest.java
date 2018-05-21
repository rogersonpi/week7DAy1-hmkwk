import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {


    Helicopter helicopter;
    Godzilla godzilla;

    @Before

    public void before() {

        helicopter = new Helicopter("Apache", 500, 100);
        godzilla = new Godzilla (800, 200);
    }

    @Test

    public void canGettype(){

        assertEquals("Apache", helicopter.getType());
    }
    @Test
    public void canGethealthValue(){

        assertEquals(500, helicopter.getHealthValue());
    }

    @Test

    public void canFireOn(){


        helicopter.fire(godzilla);
        assertEquals(700, godzilla.getHealthValue());

    }
}
