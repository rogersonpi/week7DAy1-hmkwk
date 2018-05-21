import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MothraTest {

    Mothra mothra;

    @Before
    public void before(){

        this.mothra = new Mothra (100, 100);
    }

    @Test
    public void canGetHealthValue(){

        assertEquals(100, mothra.getHealthValue());
    }
    @Test
    public void canGetAttackValue(){

        assertEquals(100, mothra.getAttackValue());
    }

    @Test
    public void canRoar(){

        assertEquals("eeeeeeeeeeeeekkkkkk", mothra.roar());

    }
    @Test
    public void canMove(){

        assertEquals("Flapped 100 meters", mothra.move(100));
    }
}
