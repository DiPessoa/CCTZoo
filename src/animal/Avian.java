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

    public Avian(String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(name, gender, dob, dateArrival, subType);

    }

    public Avian(String name, char gender, String dob, String dateArrival) {
        super(name, gender, dob, dateArrival);
    }

    public boolean isHatching() {
        return hatchEgg;
    }

    public void setPregnancy(boolean hatchEgg) {
        this.hatchEgg = hatchEgg;
    }

}
