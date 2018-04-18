package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Insect extends Animal {

    private boolean layEgg;

    public Insect(int animalID, String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(animalID, name, gender, dob, dateArrival, subType);

    }

    public Insect(int animalID, String name, char gender, String dob, String dateArrival) {
        super(animalID, name, gender, dob, dateArrival);

    }

    public boolean isLayingEgg() {
        return layEgg;
    }

    public void setLayEgg(boolean layEgg) {
        this.layEgg = layEgg;
    }

}
