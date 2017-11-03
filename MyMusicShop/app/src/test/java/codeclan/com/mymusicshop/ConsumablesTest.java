package codeclan.com.mymusicshop;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mymusicshop.Shopcontent.Consumables;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class ConsumablesTest {
    Consumables consumable;

    @Before

    public void before (){

        consumable = new Consumables("MusicSheet", 1.0, 3.0);
    }

    @Test
     public void canGetType(){
        assertEquals("MusicSheet", consumable.getType());

    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(1.0, consumable.getBuyPrice());

    }

    @Test
    public void canGetSellPrice(){
        assertEquals(3.0, consumable.getSellPrice());

    }

    @Test
    public void setBuyPrice(){
        consumable.setBuyPrice(1.5);

        assertEquals(1.5, consumable.getBuyPrice());

    }

    @Test
    public void setSellPrice(){
        consumable.setSellPrice(4.0);

        assertEquals(4.0, consumable.getSellPrice());

    }
}
