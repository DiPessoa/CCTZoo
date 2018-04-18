package animal;

import animal.classification.Type;
import interfaces.IMessage;

/**
 *
 * @author Diogo Pessoa
 */
public class Aquatic extends Animal {

    final private boolean marine;

    public Aquatic(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, Type subType, boolean marine) {
        super(animalID, name, gender, dob, dateArrival, parents, subType);

        this.marine = marine;

    }

    public Aquatic(int animalID, String name, char gender, String dob, String dateArrival, int[] parents, boolean marine) {
        super(animalID, name, gender, dob, dateArrival, parents);

        this.marine = marine;

    }

    public boolean isMarine() {
        return marine;
    }

}
