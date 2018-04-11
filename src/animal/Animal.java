package animal;

import java.util.ArrayList;

/**
 *
 * @author Diogo Pessoa
 */
abstract class Animal {

    final private int animalID;
    final private String name;
    final private String dob; //pesquisar
    final private char gender;
    final private String dateArrival;
    private String medication;
    private String vaccine;
    private int exibitNumber;

    private ArrayList offSpring = new ArrayList();
    String[] type = new String[2]; // problema com o modificador

    public Animal(int animalID, String name, char gender, String dob, String dateArrival, String[] type) {
        this.animalID = animalID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.type = type;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public void setExibitNumber(int exibitNumber) {
        this.exibitNumber = exibitNumber;
    }

    public void setOffSpring(ArrayList offSpring) {
        this.offSpring = offSpring;
    }

    public void setType(String[] type) {
        this.type = type;
    }
    
    
    public int getAnimalID() {
        return animalID;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public String getMedication() {
        return medication;
    }

    public String getVaccine() {
        return vaccine;
    }

    public int getExibitNumber() {
        return exibitNumber;
    }

    public ArrayList getOffSpring() {
        return offSpring;
    }

    public String[] getType() {
        return type;
    }        
}
