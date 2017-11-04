package codeclan.com.mymusicshop;

import java.util.ArrayList;

import codeclan.com.mymusicshop.Interfaces.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public class Shop {


    private String shopName;
    private ArrayList<Sellable>stock;


    public Shop(String shopName, ArrayList<Sellable> stock){

        this.shopName = shopName;
        this.stock = stock;

    }

    

}
