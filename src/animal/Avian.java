package animal;

import animal.classification.Type;
import interfaces.IMessage;

/**
 *
 * @author Diogo Pessoa
 */
public class Avian extends Animal {

    private boolean hatchEgg;

    public Avian(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType) {
        super(animalID, name, gender, dob, dateArrival, parents, subType);

    }

    public Avian(int animalID, String name, char gender, String dob, String dateArrival, int[] parents) {
        super(animalID, name, gender, dob, dateArrival, parents);

    }

    public boolean isHatching() {
        return hatchEgg;
    }

    public void setPregnancy(boolean hatchEgg) {
        this.hatchEgg = hatchEgg;
    }

}
