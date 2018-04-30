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
public abstract class Animal implements IAvian, IAquatic, IMessage {

    private static int animalID;
    private static int lastanimalID;
    private String name;
    
    private String dob;
    private char gender;
    private String dateArrival;
    private Subtype subtype;
    private int exibitNumber;
    private boolean vaccine = false;
    private ArrayList<Medication> medication = new ArrayList<>();
    //O ideal eh remover isDead de toda a estrutura
    private boolean isDead = false;
    // consequentemente dod eh removido junto ao isDead
    private String dod;
    private ArrayList<Offspring> offSpring = new ArrayList<>();
    private Zookeeper zookeeper;
    //TODO: Set zookeeper
    
    public Animal(){
        lastanimalID = 0;
        animalID = ++lastanimalID;
    }
    
    public Animal(String name, char gender, String dob, String dateArrival, Subtype subType, Zookeeper zookeeper) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.zookeeper = zookeeper;
    }
    
    public Animal(String name, char gender, String dob, String dateArrival, Subtype subType) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.subtype = subType;
        this.zookeeper = zookeeper;
    }

    public Animal(String name, char gender, String dob, String dateArrival, Zookeeper zookeeper) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.zookeeper = zookeeper;
    }
    
    public Animal(String name, char gender, String dob, String dateArrival) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.dateArrival = dateArrival;
        this.zookeeper = zookeeper;
    }
    
    public static void setAnimalID(int animalID) {
        Animal.animalID = animalID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
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
    
    public String getType(){
        String type = getClass().getName().substring(getClass().getName().indexOf(".") + 1, getClass().getName().length());
        return type.toUpperCase();
    }
    
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
    
    //TODO: to string do animal, retorna nome e dados bla bla bla
    @Override
    public String toString(){
        return name + " dob: " + dob;
    }

}
