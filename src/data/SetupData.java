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
 * Class that generates random animals and zookeepers
 *
 * @author Diogo Pessoa
 */
public class SetupData {

    private static ArrayList<Animal> animalList = new ArrayList();
    private static ArrayList<Zookeeper> zookeepersList = new ArrayList();

    private static Random randomNum = new Random();

    /**
     * Method receives the amount of animal and zookeepers that you would like
     * to generate
     *
     * @param aCount Integer
     * @param zCount Integer
     */
    public SetupData(int aCount, int zCount) {
        createAnimalList(aCount);
        createZookeeperList(zCount);

        populateAnimal();
        populateZookeeper();

        setAnimalZookeeper();
    }

    /**
     * Method adds animals to a Array List
     *
     * @param count Integer
     */
    private void createAnimalList(int count) {
        for (int i = 0; i < count; i++) {
            int random = (int) (Math.random() * 5) + 1;
            animalList.add(createAnimal(random));
        }
    }

    /**
     * Method adds zookeepers to a Array List,
     *
     * @param count Integer
     */
    private void createZookeeperList(int count) {
        for (int i = 0; i < count; i++) {
            zookeepersList.add(createZookeeper());
        }
    }

    /**
     * Method adds an animal to a Array List
     *
     * @param animal Animal
     */
    public static void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    /**
     * Method adds an zookeepers to a Array List
     *
     * @param zookeeper Zookeeper
     */
    public static void addZookeeper(Zookeeper zookeeper) {
        zookeepersList.add(zookeeper);
    }

    /**
     * Method creates an animal
     *
     * @param number Integer
     * @return Animal
     */
    public static Animal createAnimal(int number) {
        Animal an;
        switch (number) {
            case 1:
                an = new Aquatic();
                break;
            case 2:
                an = new Avian();
                break;
            case 3:
                an = new Insect();
                break;
            case 4:
                an = new Mammal();
                break;
            case 5:
                an = new Reptile();
                break;
            default:
                an = null;
        }
        return an;
    }

    /**
     * Method creates an zookeeper
     *
     * @return Animal
     */
    private Zookeeper createZookeeper() {
        return new Zookeeper();
    }

    /**
     * Method populate a Array List(animalList) with all qualification, that was
     * store in StoreData
     *
     * @param null
     */
    private void populateAnimal() {
        for (Animal animal : animalList) {
            animal.setName(StoreData.animalNames[randomNum.nextInt(StoreData.animalNames.length)]);
            animal.setDob(StoreData.animalDob[randomNum.nextInt(StoreData.animalDob.length)]);
            animal.setGender(StoreData.animalGender[randomNum.nextInt(StoreData.animalGender.length)]);
            animal.setDateArrival(StoreData.animalDateArrival[randomNum.nextInt(StoreData.animalDateArrival.length)]);
            animal.setSubtype(StoreData.animalSubtype[randomNum.nextInt(StoreData.animalSubtype.length)]);
            animal.setVaccine(randomNum.nextBoolean());
        }
    }

    /**
     * Method populate a Array List(zookeeperlList) with all qualification, that
     * was store in StoreData
     *
     * @param null
     */
    private void populateZookeeper() {
        for (Zookeeper zookeeper : zookeepersList) {
            zookeeper.setName(StoreData.zookeeperName[randomNum.nextInt(StoreData.zookeeperName.length)]);
            zookeeper.setDob(StoreData.zookeeperDob[randomNum.nextInt(StoreData.zookeeperDob.length)]);
            zookeeper.setAddress(StoreData.zookeeperAddress[randomNum.nextInt(StoreData.zookeeperAddress.length)]);
            zookeeper.setPps(StoreData.zookeeperPps[randomNum.nextInt(StoreData.zookeeperPps.length)]);
            for (int i = 0; i < StoreData.animalSubtype.length; i++) {
                zookeeper.setAnimalType(StoreData.animalSubtype[randomNum.nextInt(StoreData.animalSubtype.length)]);
            }
        }
    }

    /**
     * Method sets a zookeeper to a animal
     *
     * @param null
     */
    private void setAnimalZookeeper() {

        for (Animal animal : animalList) {
            animal.setZookeeper(getValidZookeeper(animal));
        }
    }

    /**
     * Method gets a valid zookeeper, testing if the zookeeper is compatible
     * with the animal type or subtype and if the zookeeper is available to take
     * care of them, invoking methods from class Zookeeper
     *
     * @param animal Animal
     * @return Zookeeper
     */
    public Zookeeper getValidZookeeper(Animal animal) {

        int randomKeeperIndex = randomNum.nextInt(zookeepersList.size());
        boolean isCompatible = zookeepersList.get(randomKeeperIndex).isAnimalCompatible(animal);
        boolean isAvailable = zookeepersList.get(randomKeeperIndex).isAvailable();
        Zookeeper zk = zookeepersList.get(randomKeeperIndex);

        if (isCompatible && isAvailable) {
            return zk;
        } else {
            return getValidZookeeper(animal);
        }
    }

    /**
     * Method gets an Array List of Animals
     *
     * @return ArrayList of Animals
     */
    public static ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    /**
     * Method gets an Array List of Zookeepers
     *
     * @return ArrayList of Zookeepers
     */
    public static ArrayList<Zookeeper> getZookeepersList() {
        return zookeepersList;
    }

}
