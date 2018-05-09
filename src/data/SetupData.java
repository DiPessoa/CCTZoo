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

    private static ArrayList<Animal> animalList = new ArrayList();
    private static ArrayList<Zookeeper> zookeepersList = new ArrayList();

    private static Random randomNum = new Random();

    public SetupData(int aCount, int zCount) {
        createAnimalList(aCount);
        createZookeeperList(zCount);

        populateAnimal();
        populateZookeeper();

        setAnimalZookeeper();
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

    public static void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public static void addZookeeper(Zookeeper zookeeper) {
        zookeepersList.add(zookeeper);
    }

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
        }
    }

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

    private void setAnimalZookeeper() {
        Mammal mm = new Mammal();

        for (Animal animal : animalList) {
            animal.setZookeeper(getValidZookeeper(animal));

        }

    }

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

    public static ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public static ArrayList<Zookeeper> getZookeepersList() {
        return zookeepersList;
    }

}
