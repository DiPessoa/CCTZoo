package animal;

import animal.classification.Subtype;

/**
 *
 * @author Diogo Pessoa
 */
public class Aquatic extends Animal {

    private boolean marine;
    
    private Aquatic(){
        
    }

    public Aquatic(int animalID, String name, char gender, String dob, String dateArrival, Subtype subType, boolean marine) {
        super(animalID, name, gender, dob, dateArrival, subType);

        this.marine = marine;

    }

    public Aquatic(int animalID, String name, char gender, String dob, String dateArrival, boolean marine) {
        super(animalID, name, gender, dob, dateArrival);

        this.marine = marine;

    }

    public boolean isMarine() {
        return marine;
    }

}
