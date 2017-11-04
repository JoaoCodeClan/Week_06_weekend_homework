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


    public String play() {
        return super.play() + "playing a " + this.type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String newType) {
        this.type = newType;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public int getNumberOfKeys() {
        return this.numberOfkeys;
    }

    public void setNumberOfkeys(int newNumberOfkeys) {
        this.numberOfkeys = newNumberOfkeys;
    }

}


