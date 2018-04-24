package animal;

import animal.classification.Subtype;
import interfaces.IAquatic;
import interfaces.IAvian;
import interfaces.IMessage;
import java.util.ArrayList;
import employee.Zookeeper;

/**
 *
 * @author Diogo Pessoa
 */
abstract class Animal implements IAvian, IAquatic, IMessage {

    final private int animalID;
    final private String name;
    final private String dob;
    final private char gender;
    final private String dateArrival;
    private Subtype subtype;
    private int exibitNumber;
    private boolean vaccine = false;
    private ArrayList<Medication> medication = new ArrayList<Medication>();
    private boolean isDead = false;
    private String dod;
    private ArrayList<Offspring> offSpring = new ArrayList<Offspring>();
    private Zookeeper zookeeper;
    
    
    public Animal(int animalID, String name, char gender, String dob, String dateArrival, Subtype subType, Zookeeper zookeeper) {
        this.animalID = animalID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.zookeeper = zookeeper;
    }

    public Animal(int animalID, String name, char gender, String dob, String dateArrival, Zookeeper zookeeper) {
        this.animalID = animalID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.zookeeper = zookeeper;
    }
    public void setOffSpring(ArrayList<Offspring> offSpring) {
        this.offSpring = offSpring;
    }

    public void setExibitNumber(int exibitNumber) {
        this.exibitNumber = exibitNumber;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public void setMedication(ArrayList<Medication> medication) {
        this.medication = medication;
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

    public int getExibitNumber() {
        return exibitNumber;
    }

  
    public Subtype getSubtype() {
        return subtype;
    }

    public void setSubtype(Subtype subType) {
        this.subtype = subType;
    }
    
    public boolean isDead(){
        return isDead;
    }
    
    public void setDeath(boolean isDead, String dod){
      this.isDead = isDead;
      this.dod = dod;
    }
    

    //ciar metodo que conte quanto animais estao no arraylist
   
    
    @Override
    public boolean isAbleToFly() {
        return getSubtype() == Subtype.AVIAN || this instanceof Avian;
    }

    @Override
    public boolean isAbleToSwin() {
        return getSubtype() == Subtype.AQUATIC || this instanceof Aquatic;
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

}
