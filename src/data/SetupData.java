/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import animal.Animal;
import animal.Aquatic;
import animal.Avian;
import animal.Insect;
import animal.Mammal;
import animal.Reptile;
import employee.Zookeeper;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Diogo Pessoa
 */
public class SetupData {

    public ArrayList<Animal> animalList = new ArrayList();
    public ArrayList<Zookeeper> zookeepersList = new ArrayList();
    public static Random randomNum = new Random();
    
    public SetupData(int aCount, int zCount) {
        createAnimalList(aCount);
        createZookeeperList(zCount);
        
        populateAnimal();
        populateZookeeper();
    }

    private void createAnimalList(int count) {
        for (int i = 0; i < count; i++) {
            int random = (int) (Math.random() * 5) + 1;
            animalList.add(createAnimal(random));
        }
    }

    private void createZookeeperList(int count) {
        for (int i = 0; i < count; i++) {
            zookeepersList.add(createZookeeper());
        }
    }

    private Animal createAnimal(int number) {
        Animal an;
        switch (number) {
            case 1:
                an = new Mammal();
                break;
            case 2:
                an = new Aquatic();
                break;
            case 3:
                an = new Reptile();
                break;
            case 4:
                an = new Insect();
                break;
            case 5:
                an = new Avian();
                break;
            default:
                an = null;
        }
        return an;
    }

    private Zookeeper createZookeeper() {
        return new Zookeeper();
    }

    private void populateAnimal() {
        
        for (Animal animal : animalList) {
            animal.setName(StoreData.animalNames[randomNum.nextInt(StoreData.animalNames.length)]);
            animal.setDob(StoreData.animalDob[randomNum.nextInt(StoreData.animalDob.length)]);
            animal.setGender(StoreData.animalGender[randomNum.nextInt(StoreData.animalGender.length)]);
            animal.setDateArrival(StoreData.animalDateArrival[randomNum.nextInt(StoreData.animalDateArrival.length)]);
            animal.setSubtype(StoreData.animalSubtype[randomNum.nextInt(StoreData.animalSubtype.length)]);
            animal.setVaccine(randomNum.nextBoolean());
            //TODO:
            //animal.setZookeeper(StoreData.animalGender[randomNum.nextInt(StoreData.Gender.length)]);
            /**/
            System.out.println(animal.toString());
        }
    }

    private void populateZookeeper() {
        for (Zookeeper keeper : zookeepersList) {
            
        }
    }

}