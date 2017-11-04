package codeclan.com.mymusicshop;
import org.junit.Before;
import org.junit.Test;

import codeclan.com.mymusicshop.Shopcontent.Keys;


import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class KeysTest {
    Keys piano;


    @Before



    public void before(){


        piano = new Keys("Piano", "Penguin", 60, "Zebra", "Wood", 1000.0, 3000.0);

    }


    @Test

    public void canGetType() {
        assertEquals("Piano", piano.getType());

    }

    @Test

    public void canSetType() {
        piano.setType("Organ");
        assertEquals("Organ", piano.getType());

    }
    @Test

    public void canGetName() {
        assertEquals("Penguin", piano.getName());

    }

    @Test

    public void canSetName() {
        piano.setName("Chopin");
        assertEquals("Chopin", piano.getName());

    }

    @Test

    public void canGetNumberOfKeys() {
        assertEquals(60, piano.getNumberOfKeys());

    }

    @Test

    public void canSetNumberOfKeys() {
        piano.setNumberOfkeys(50);
        assertEquals(50, piano.getNumberOfKeys());

    }

    @Test

    public void play(){

        assertEquals(" I'm having fun playing a Piano", piano.play());
    }

    @Test

    public void canGetBuyPrice() {
        assertEquals(1000.0, piano.getBuyPrice());

    }

    @Test

    public void canSetBuyPrice() {
        piano.setBuyPrice(5000.0);
        assertEquals(5000.0, piano.getBuyPrice());

    }
    @Test

    public void canGetSellPrice() {
        assertEquals(3000.0, piano.getSellPrice());

    }

    @Test

    public void canSetSellPrice() {
        piano.setSellPrice(6000.0);
        assertEquals(6000.0, piano.getSellPrice());

    }

    @Test
    public void canCalculateMarkUp(){

        assertEquals(2000.0, piano.calculateMarkup());
    }
}
