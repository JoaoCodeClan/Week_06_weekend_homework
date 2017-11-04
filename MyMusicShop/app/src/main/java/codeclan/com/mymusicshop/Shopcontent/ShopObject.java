package codeclan.com.mymusicshop.Shopcontent;

import codeclan.com.mymusicshop.Interfaces.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class ShopObject implements Sellable {
    private Double buyPrice;
    private Double sellPrice;


    public ShopObject( Double buyPrice, Double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;


    }


    public double calculateMarkup(){
        double markup = this.sellPrice - this.buyPrice;

        return markup;

    }


    public double getBuyPrice(){
        return this.buyPrice;

    }

    public double getSellPrice(){
        return this.sellPrice;

    }

    public void setBuyPrice(Double price){
        this.buyPrice = price;

    }

    public void setSellPrice(Double price){
        this.sellPrice = price;

    }
}


