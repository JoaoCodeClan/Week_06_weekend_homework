package codeclan.com.mymusicshop.Shopcontent;

/**
 * Created by user on 03/11/2017.
 */

public class Keys extends Instruments {


    private String type;
    private String name;
    private  int numberOfkeys;

    public Keys( String type, String name, int numberOfKeys, String colour, String material, Double buyPrice, Double sellPrice){
        super(colour, material,buyPrice, sellPrice);
        this.type = type;
        this.name = name;
        this.numberOfkeys = numberOfKeys;

    }
}
