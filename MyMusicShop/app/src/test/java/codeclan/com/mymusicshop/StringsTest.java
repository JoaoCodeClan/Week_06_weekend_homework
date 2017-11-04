package codeclan.com.mymusicshop;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mymusicshop.Shopcontent.Strings;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class StringsTest {

    Strings guitar;

    @Before

    public void before() {


        guitar = new Strings("Guitar", "Acoustic", 6, "Black", "Wood", 300.0, 500.0);

    }


    @Test

    public void canGetType() {
        assertEquals("Guitar", guitar.getType());

    }

@Test

    public void canSetType() {
        guitar.setType("violin");
        assertEquals("violin", guitar.getType());

    }
    @Test

    public void canGetName() {
        assertEquals("Acoustic", guitar.getName());

    }

    @Test

    public void canSetName() {
        guitar.setName("Stradivarius");
        assertEquals("Stradivarius", guitar.getName());

    }

    @Test

    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());

    }

    @Test

    public void canSetNumberOfStrings() {
        guitar.setNumberOfStrings(5);
        assertEquals(5, guitar.getNumberOfStrings());

    }

    @Test

    public void play(){

        assertEquals(" I'm having fun playing a Guitar", guitar.play());
    }
    @Test

    public void canGetBuyPrice() {
        assertEquals(300.0, guitar.getBuyPrice());

    }

    @Test

    public void canSetBuyPrice() {
        guitar.setBuyPrice(5000.0);
        assertEquals(5000.0, guitar.getBuyPrice());

    }
}
