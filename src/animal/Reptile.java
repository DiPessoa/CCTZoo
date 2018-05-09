package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Reptile extends Animal{

    private boolean shedSkin;
    
    public Reptile(){
        
    }

    public Reptile (String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType) {
        super(name, gender, dob, dateArrival, offSpring, subType);
    }

    public Reptile (String name, char gender, String dob, String dateArrival, boolean offSpring) {
        super(name, gender, dob, dateArrival, offSpring);
    }
    
    public boolean isSheddingSkin() {
        return shedSkin;
    }

    public void setShedSkin(boolean shedSkin) {
        this.shedSkin = shedSkin;
    }
    @Override
    public String getString (){
        return "  Shed Skin: " + Boolean.toString(shedSkin) + "\n";
    }
}