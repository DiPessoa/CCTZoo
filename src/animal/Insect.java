package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Insect extends Animal {

    private boolean layEgg;
    
    public Insect(){
    
    }

    public Insect(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType) {
        super(name, gender, dob, dateArrival, offSpring, subType);

    }

    public Insect(String name, char gender, String dob, String dateArrival, boolean offSpring) {
        super(name, gender, dob, dateArrival, offSpring);

    }

    public boolean isLayingEgg() {
        return layEgg;
    }

    public void setLayEgg(boolean layEgg) {
        this.layEgg = layEgg;
    }
    @Override
    public String getString (){
        return "  Lay Egg: " + Boolean.toString(layEgg) + "\n";
    }

}
