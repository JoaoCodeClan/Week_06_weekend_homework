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
    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public void setNumberOfStrings(int newNumberOfStrings) {
        this.numberOfStrings = newNumberOfStrings;
    }

}
