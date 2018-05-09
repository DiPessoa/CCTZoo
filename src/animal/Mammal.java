package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Mammal extends Animal {

    private boolean pregnancy;
    
    public Mammal(){
    
    }

    public Mammal(String name, char gender, String dob, String dateArrival, boolean offSpring, Subtype subType) {
        super(name, gender, dob, dateArrival, offSpring, subType);
        setPregnancy(gender == 'f');

    }

    public Mammal(String name, char gender, String dob, String dateArrival,boolean offSpring) {
        super(name, gender, dob, dateArrival, offSpring);
        setPregnancy(gender == 'f');

    }

    public boolean isPregnant() {
        return pregnancy;
    }

    public void setPregnancy(boolean pregnancy) {
        if (getGender() == 'F') {
            this.pregnancy = true;
        } else {
            displayMessage("A male animmal can not be pregnant!");
        }
    }
    
    @Override
    public String getString (){
        return "  Pregnancy: " + Boolean.toString(pregnancy) + "\n";
    }
    
    
    @Override
    public String getType(){
        String type = getClass().getName().substring(getClass().getName().indexOf(".") + 1, getClass().getName().length());
        return type.toUpperCase();
    }
}
