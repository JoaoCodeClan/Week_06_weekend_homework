package codeclan.com.mymusicshop;

import java.util.ArrayList;

import codeclan.com.mymusicshop.Interfaces.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public class Shop {


    private String shopName;
     ArrayList<Sellable> stock;


    public Shop(String shopName){

        this.shopName = shopName;
        this.stock = new ArrayList<Sellable>();

    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String newShopName) {
        this.shopName = newShopName;
    }

    public void addItem(Sellable item) {
        this.stock.add(item);

    }

    public void removeItem(Sellable item) {
        this.stock.remove(item);
    }

    public double calculateEstimateProfit() {
        double profit = 0;


        for (Sellable item : this.stock) {
            profit += item.calculateMarkup();

        }
        return profit;
    }



}
