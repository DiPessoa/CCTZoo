package animal;

import animal.classification.Subtype;


/**
 *
 * @author Diogo Pessoa
 */
public class Mammal extends Animal {

    private boolean pregnancy;

    public Mammal(int animalID, String name, char gender, String dob, String dateArrival, Subtype subType) {
        super(animalID, name, gender, dob, dateArrival, subType);

    }

    public Mammal(int animalID, String name, char gender, String dob, String dateArrival) {
        super(animalID, name, gender, dob, dateArrival);

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
    public String getType(){
        String type = getClass().getName().substring(getClass().getName().indexOf(".") + 1, getClass().getName().length());
        return type.toUpperCase();
    }
}
