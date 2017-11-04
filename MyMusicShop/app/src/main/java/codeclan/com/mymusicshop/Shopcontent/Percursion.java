package codeclan.com.mymusicshop.Shopcontent;

/**
 * Created by user on 03/11/2017.
 */

public class Percursion extends Instruments {

    private String type;
    private String name;
    private String intensity;

    public Percursion( String type, String name, String intensity, String colour, String material, Double buyPrice, Double sellPrice){
        super(colour, material,buyPrice, sellPrice);
        this.type = type;
        this.name = name;
        this.intensity= intensity;

    }

}
