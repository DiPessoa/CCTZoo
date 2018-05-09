package menu;

import animal.Animal;
import animal.classification.Subtype;
import data.SetupData;
import data.StoreData;
import employee.Zookeeper;
import java.util.*;

public class Menu {

    private Scanner in;
    private Scanner q;
    private int mainSelection = 0;
    private int operation = 0;
    private int animalType = 0;

    public void display_menu() {
        System.out.println("----------------Welcome to ZooCCT-------------");
        System.out.println("Choose what you would like to manage:");
        System.out.println("1) Animals 1\n2) ZooKeepers 2");
        System.out.println("Selection: ");
    }

    public void display_operations() {
        System.out.println("Choose the operation:");
        System.out.println("1) Search 1\n2) Add 2\n3) Update 3");
        System.out.print("Selection: ");
    }
    
    public void display_animal_type() {

        System.out.println("Choose the Type");
        System.out.println("1) Aquatic 1\n2) Avian 2\n3) Insect 3\n4) Mammal 4\n5) Reptile 5\n6) All Animals 6");
        System.out.print("Selection: ");
    }

    public void operation() {
        switch (mainSelection) {
            case 1:
                display_animal_type();
                animalType = in.nextInt();
                run();
                break;
            case 2:
                run();
                break;
            default:
                return;
        }
    }
    
    public void question() {
        System.out.println("Would you like to proceed or quit?");
        System.out.println("To proceed enter 9.");
        System.out.println("If you wish to QUIT enter 0.");
        q = new Scanner(System.in);

        switch (q.nextInt()) {
            case 0:
                System.out.println("Thank you and godbye.");
                break;
            case 9:
                System.out.println("Please proceed.");
                new Menu();
                break;
            default:
                System.err.println("Unrecognized option");
                break;
        }
    }
    
    public void run() {

        switch (operation) {
            case 1:
                list();
                break;
            case 2:
                add();
                break;
            case 3:
                //TODO: update
                update();
                break;

            default:
                System.err.println("Unrecognized option");
                break;
        }
       
        question();
    }


    public Menu() {
        in = new Scanner(System.in);
        
        display_menu();
        
        mainSelection = in.nextInt();
        
        display_operations();
        
        operation = in.nextInt();
        
        operation();
        
    }

    public void list() {
        switch (mainSelection) {
            case 1:
                System.out.println("List animals: " + animalType);
                String type = "";
                switch (animalType) {
                    case 1:
                        type = "AQUATIC";
                        break;
                    case 2:
                        type = "AVIAN";
                        break;
                    case 3:
                        type = "INSECT";
                        break;
                    case 4:
                        type = "MAMMAL";
                        break;
                    case 5:
                        type = "REPTILE";
                        break;
                    case 6:
                        System.out.println(SetupData.getAnimalList());
                           
                }
                Animal.list(type);
                System.out.println("Inform the Animal ID for more info or 9 to go the main menu ");
                int choice = in.nextInt();
                System.out.println(SetupData.getAnimalList().get(choice-1));
                break;
            case 2:
                for (Zookeeper object : SetupData.getZookeepersList()) {
                    System.out.println(object);
                    System.out.println("----------------------------");
                }
                
                System.out.println("Inform the Zookeeper ID  for more info or 9 to go the main menu ");
                
                int zoochoice = in.nextInt();
                System.out.println(SetupData.getZookeepersList().get(zoochoice - 1));

                break;

            default:
                break;
        }
    }

    public void add() {
        switch (mainSelection) {
            case 1:

                System.out.println("Inform the animal's name: ");
                String name = in.next();

                System.out.println("Inform the animal's gender: \n(M - Masculine or F - Feminine)");
                char gender = (char) in.next().charAt(0);

                System.out.println("Inform the animal's date of birth: ");
                String dob = in.next();

                System.out.println("Inform the animal's date of arrival: \n(Type in Null if the animal born in the zoo)");
                String dateArrival = in.next();

                System.out.println("Inform if the animal has Offspring: \n(Type in True or False)");
                Boolean offSpring = in.nextBoolean();

                System.out.println("Inform the subtype: \n(Subtypes - 1 - Aquatic, 2 - Avian, 3 - Insect, 4 - Mammal, 5 - Reptile)");
                int subtype = in.nextInt();

                System.out.println("Inform if the animal was vaccinated: \n(Type in True or False)");
                Boolean vaccine = in.nextBoolean();

                Animal na = SetupData.createAnimal(animalType);

                na.setName(name);
                na.setGender(gender);
                na.setDob(dob);
                na.setDateArrival(dateArrival);
                na.setOffSpring(offSpring);
                na.setVaccine(vaccine);

                Subtype st = Subtype.NULL;

                switch (subtype) {
                    case 1:
                        st = Subtype.AQUATIC;
                        break;
                    case 2:
                        st = Subtype.AVIAN;
                        break;
                    case 3:
                        st = Subtype.INSECT;
                        break;
                    case 4:
                        st = Subtype.MAMMAL;
                        break;
                    case 5:
                        st = Subtype.REPTILE;
                        break;
                }

                na.setSubtype(st);
                SetupData.addAnimal(na);
                break;

            case 2:

                System.out.println("Inform the Zookeeper's name: ");
                String zname = in.next();

                System.out.println("Inform the Zookeeper's date of birth: ");
                String zdob = in.next();

                System.out.println("Inform the Zookeeper's address: ");
                String zaddress = in.next();

                System.out.println("Inform the Zookeeper's pps: ");
                String zpps = in.next();

                Zookeeper zk = new Zookeeper(zname, zdob, zaddress, zpps);

                Random randomNum = new Random();

                for (int i = 0; i < StoreData.animalSubtype.length; i++) {
                    zk.setAnimalType(StoreData.animalSubtype[randomNum.nextInt(StoreData.animalSubtype.length)]);
                }

                SetupData.addZookeeper(zk);
                
                break;

            default:
                break;
        }

    }

    public void update() {
        switch (mainSelection) {
            case 1:
                System.out.println(SetupData.getAnimalList());
                System.out.println("Inform the Animal ID  for more info or 9 to go the main menu ");
                int choice = in.nextInt();
                System.out.println(SetupData.getAnimalList().get(choice-1));
                
                
                break;
                
               
            case 2:
                
                     
                System.out.println("Update Keepers");
                break;

            default:
                break;
        }
    }
}
