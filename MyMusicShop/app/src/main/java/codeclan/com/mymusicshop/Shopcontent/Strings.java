package codeclan.com.mymusicshop.Shopcontent;

/**
 * Created by user on 03/11/2017.
 */

public class Strings extends Instruments {

     private String type;
     private String name;
     private  int numberOfStrings;

    public Strings( String type, String name, int numberOfStrings, String colour, String material, Double buyPrice, Double sellPrice){
        super(colour, material,buyPrice, sellPrice);
        this.type = type;
        this.name = name;
        this.numberOfStrings = numberOfStrings;

    }


}
