package codeclan.com.mymusicshop.Shopcontent;

import codeclan.com.mymusicshop.Interfaces.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class ShopObject implements Sellable {
     Double buyPrice;
     Double sellPrice;


    public ShopObject( Double buyPrice, Double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        

    }
}
