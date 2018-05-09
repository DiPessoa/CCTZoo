package animal;

import animal.classification.Subtype;

/**
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Aquatic extends Animal {

    private boolean marine;

    public Aquatic() {

    }

    public Aquatic(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType, boolean marine) {
        super(name, gender, dob, dateArrival, offSpring, subType);
        this.marine = marine;

    }

    public Aquatic(String name, char gender, String dob, String dateArrival, boolean offSpring, boolean marine) {
        super(name, gender, dob, dateArrival, offSpring);
        this.marine = marine;
    }

    public boolean isMarine() {
        return marine;
    }

    @Override
    public String getString() {
        return "  Marine: " + Boolean.toString(marine) + "\n";
    }

}
