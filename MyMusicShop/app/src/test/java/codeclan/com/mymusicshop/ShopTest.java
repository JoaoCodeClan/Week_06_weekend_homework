package codeclan.com.mymusicshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ArrayList.*;

import codeclan.com.mymusicshop.Interfaces.Sellable;
import codeclan.com.mymusicshop.Shop;
import codeclan.com.mymusicshop.Shopcontent.Strings;


import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 04/11/2017.
 */

public class ShopTest {



    Sellable stuff;

    Shop myshop;


    @Before

    public void before() {

        stuff= new Strings("Guitar", "Acoustic", 6, "Black", "Wood", 300.0, 500.0);
       myshop = new Shop("Jons");


    }

    @Test

    public void canGetName(){
        assertEquals("Jons", myshop.getShopName());

    }

    @Test
    public void canSetShopName(){
        myshop.setShopName("BigJon");
        assertEquals("BigJon", myshop.getShopName());

    }


    @Test

    public  void stockStartsEmpty(){
        assertEquals(0, myshop.stock.size());

    }


    @Test

    public void canAddItemToStock(){
        myshop.addItem(stuff);
        assertEquals(1,myshop.stock.size());

    }

    @Test
    public void canRemoveItemFromStock(){
        myshop.addItem(stuff);
        assertEquals(1,myshop.stock.size());
        myshop.removeItem(stuff);
        assertEquals(0, myshop.stock.size());
    }

}
