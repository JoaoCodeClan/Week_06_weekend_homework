package codeclan.com.mymusicshop.Shopcontent;

/**
 * Created by user on 03/11/2017.
 */

public class Percursion extends Instruments {

    private String type;
    private String name;
    private Intensity intensity;

    public Percursion( String type, String name, Intensity intensity, String colour, String material, Double buyPrice, Double sellPrice){
        super(colour, material,buyPrice, sellPrice);
        this.type = type;
        this.name = name;
        this.intensity= intensity;

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
    public Intensity getIntensity() {
        return this.intensity;
    }

    public void setintensity(Intensity newIntensity) {
        this.intensity = newIntensity;
    }


}
