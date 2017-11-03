package codeclan.com.mymusicshop.Shopcontent;

/**
 * Created by user on 03/11/2017.
 */

public class Consumables extends ShopObject {

     private String type;



    public Consumables(String type, Double buyPrice, Double sellPrice){
        super(buyPrice, sellPrice);
        this.type = type;


    }


    public String getType(){

        return this.type;
    }

}
