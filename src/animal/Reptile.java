package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Reptile extends Animal{

    private boolean shedSkin;

    public Reptile (int animalID, String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(animalID, name, gender, dob, dateArrival, subType);

    }

    public Reptile (int animalID, String name, char gender, String dob, String dateArrival) {
        super(animalID, name, gender, dob, dateArrival);

    }
    
    public boolean isSheddingSkin() {
        return shedSkin;
    }

    public void setShedSkin(boolean shedSkin) {
        this.shedSkin = shedSkin;
    }
}