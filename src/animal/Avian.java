package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Avian extends Animal {

    private boolean hatchEgg;
    
    public Avian(){
        
    }

    public Avian(int animalID, String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(animalID, name, gender, dob, dateArrival, subType);

    }

    public Avian(int animalID, String name, char gender, String dob, String dateArrival) {
        super(animalID, name, gender, dob, dateArrival);

    }

    public boolean isHatching() {
        return hatchEgg;
    }

    public void setPregnancy(boolean hatchEgg) {
        this.hatchEgg = hatchEgg;
    }

}
