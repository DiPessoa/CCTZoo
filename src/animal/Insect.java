package animal;

import animal.classification.Type;
import interfaces.IMessage;

/**
 *
 * @author Diogo Pessoa
 */
public class Insect extends Animal {

    private boolean layEgg;

    public Insect(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType) {
        super(animalID, name, gender, dob, dateArrival, parents, subType);

    }

    public Insect(int animalID, String name, char gender, String dob, String dateArrival, int[] parents) {
        super(animalID, name, gender, dob, dateArrival, parents);

    }

    public boolean isLayingEgg() {
        return layEgg;
    }

    public void setLayEgg(boolean layEgg) {
        this.layEgg = layEgg;
    }

}
