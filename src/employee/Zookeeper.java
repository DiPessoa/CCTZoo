/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import animal.classification.Subtype;
import animal.Animal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Diogo Pessoa
 */
public class Zookeeper extends Employee{
       
    private int maxAnimals = 10;
    public static int maxTypes = 3;
    
    private Subtype[] animalsType = new Subtype[maxTypes];
    private ArrayList<Animal> animalsList = new ArrayList<>();
    
    private Random randomNum = new Random();
    
    public Zookeeper(){
        
    }
    
    public Zookeeper(String name, String dob, String address, String pps) {
        super(name, dob, address, pps);
    }
    
    public void addAnimal(Animal animal){
        if(isAnimalCompatible(animal)){
            if(getAnimalsCount() < maxAnimals){
                animalsList.add(animal);
            }
        }
    }
    
    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }
    
    public int getAnimalsCount(){
        return animalsList.size();
    }
    
    public String getAnimalsList(){
        //TODO: corrigir metodo pra imprimir uma string decente
        String list = "";
        for (Animal currentAnimal: animalsList) {
            list += currentAnimal.getName() + "\n";
        }
        return list;
    }
    
    public void setAnimalType(Subtype type){
        // verifica se ja nao esta na lista
        if(hasAnimalType(type)){
            return;
        }
        
        for (int i = 0; i < animalsType.length; i++) {
            if (animalsType[i] == null) {
                animalsType[i] = type;
                return;
            }
        }
    }
    
    public boolean isAnimalCompatible(Animal animal){
        try {
            for (Subtype at : animalsType) {
                if (
                     at.toString().equals(animal.getType())
                        ||
                     at.toString().equals(animal.getSubtype().toString())
                   )
                {
                    return true;
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        return false;
    }
    
    public boolean isAvailable(){
        return animalsList.size() < 10;
    }
    
    private boolean hasAnimalType(Subtype type){
        for (int i = 0; i < animalsType.length; i++) {
            if (animalsType[i] == type) {
                return true;
            }
        }
        return false;
    }
    
    public Subtype[] getAnimalsType() {
        return animalsType;
    }
    
    @Override
    public String toString(){
        return this.getName() + " || " + this.getDob() + " || " + this.getPps();
    }
  }