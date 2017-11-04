package codeclan.com.mymusicshop;

import org.junit.Before;
import org.junit.Test;


import codeclan.com.mymusicshop.Shopcontent.Intensity;
import codeclan.com.mymusicshop.Shopcontent.Percursion;


import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class PercursionTest {
    Percursion drum;


    @Before



    public void before(){


        drum = new Percursion("Drum", "taiko", Intensity.VERYLOUD, "Red", "Bamboo", 600.0, 900.0);

    }


    @Test

    public void canGetType() {
        assertEquals("Drum", drum.getType());

    }

    @Test

    public void canSetType() {
        drum.setType("Bongo");
        assertEquals("Bongo", drum.getType());

    }
    @Test

    public void canGetName() {
        assertEquals("taiko", drum.getName());

    }

    @Test

    public void canSetName() {
        drum.setName("Tambor");
        assertEquals("Tambor", drum.getName());

    }

    @Test

    public void canGetIntansity() {
        assertEquals(Intensity.VERYLOUD, drum.getIntensity());

    }

    @Test

    public void canSetNumberOfKeys() {
        drum.setintensity(Intensity.MEDIUM);
        assertEquals(Intensity.MEDIUM, drum.getIntensity());

    }

    @Test

    public void play(){

        assertEquals(" I'm having fun playing a Drum", drum.play());
    }

    @Test

    public void canGetBuyPrice() {
        assertEquals(600.0, drum.getBuyPrice());

    }

    @Test

    public void canSetBuyPrice() {
        drum.setBuyPrice(650.5);
        assertEquals(650.5, drum.getBuyPrice());

    }
    @Test

    public void canGetSellPrice() {
        assertEquals(900.0, drum.getSellPrice());

    }

    @Test

    public void canSetSellPrice() {
        drum.setSellPrice(999.9);
        assertEquals(999.9, drum.getSellPrice());

    }

    @Test
    public void canCalculateMarkUp(){

        assertEquals(300.0, drum.calculateMarkup());
    }
}



