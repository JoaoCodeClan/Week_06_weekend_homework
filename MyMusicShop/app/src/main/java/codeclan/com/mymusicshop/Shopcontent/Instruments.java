package codeclan.com.mymusicshop.Shopcontent;

import codeclan.com.mymusicshop.Interfaces.Playable;


/**
 * Created by user on 03/11/2017.
 */

public abstract class Instruments extends ShopObject implements Playable {


    private String colour;
    private String material;

    public Instruments(String colour, String material, Double buyPrice, Double sellPrice){
        super(buyPrice, sellPrice);
        this.colour = colour;
        this.material = material;

    }

    public String play() {
        return " I'm having fun ";
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }


    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String newMaterial) {
        this.material = newMaterial;
    }

}