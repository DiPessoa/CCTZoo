package animal;

import animal.classification.Subtype;

/**
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Avian extends Animal {

    private boolean hatchEgg;

    public Avian() {

    }

    public Avian(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType) {
        super(name, gender, dob, dateArrival, offSpring, subType);

    }

    public Avian(String name, char gender, String dob, String dateArrival, boolean offSpring) {
        super(name, gender, dob, dateArrival, offSpring);
    }

    public boolean isHatching() {
        return hatchEgg;
    }

    public void setPregnancy(boolean hatchEgg) {
        this.hatchEgg = hatchEgg;
    }

    @Override
    public String getString() {
        return "  Hatch Egg: " + Boolean.toString(hatchEgg) + "\n";
    }

}
