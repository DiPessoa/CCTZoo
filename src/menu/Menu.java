package menu;

import animal.Animal;
import java.util.*;

public class Menu {

    private Scanner in;
    private Scanner q;
    private int mainSelection = 0;
    private int operation = 0;
    private int animalType = 0;

    public void display_menu() {
        System.out.println("Choose what you would like to manage");
        System.out.println("1) Animals 1\n2) ZooKeepers 2");
        System.out.print("Selection: ");
    }

    public void display_menu_main_options() {
        System.out.println("Choose the operation");
        System.out.println("1)Search 1\n2) Add 2\n3) Remove 3");
        System.out.print("Selection: ");;
        operations();
    }

    public void display_menu_after_operations() {
        switch (mainSelection){
            case 1:
                //TODO animals
                display_animal_type();
                animal_type();
                break;
            case 2:
                // TODO keeper
                //TODO operation search add or update
                run_keeper_operation();
                break;
            default:
                return;
        }
    }
    
    public void run_keeper_operation(){
        switch(operation){
            case 1:
                //TODO list keepers
                System.out.println("TODO list keepers");
                break;
            case 2:
                //TODO add keepers
                System.out.println("TODO add keepers");
                break;
            case 3:
                //TODO udpate keepers
                System.out.println("TODO udpate keepers");
                break;
            default:
                return;
        }
    }
    
    public void display_animal_type(){
        System.out.println("Choose the Type");
        System.out.println("1) Aquatic 1\n2) Avian 2\n3) Insect 3\n4) Mammal 4\n5) Reptile 5");
        System.out.print("Selection: ");
    }

    public void question() {
        System.out.println("Would you like to proceed or quit?");
        System.out.println("To proceed enter 9.");
        System.out.println("If you wish to quit enter 0.");
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

    public void operations() {
        in = new Scanner(System.in);
        int choice = in.nextInt();
        operation = choice;
        display_menu_after_operations();
    }

    public void runOperation() {

        switch (operation) {
            case 1:
                //TODO: List
                list();
                break;
            case 2:
                //TODO: Add
                add();
                break;
            case 3:
                //TODO: Remove
                remove();
                break;

            default:
                System.err.println("Unrecognized option");
                break;
        }
        question();
    }

    public void animal_type() {
        in = new Scanner(System.in);
        int choice = in.nextInt();
        animalType = choice;
        runOperation();
    }

    public Menu() {
        in = new Scanner(System.in);
        display_menu();
        int choice = in.nextInt();
        mainSelection = choice;

        switch (choice) {
            case 1:
                //TODO Animals
                System.out.println("You picked Animals");
                display_menu_main_options();
                break;

            case 2:
                //TODO Keepers
                System.out.println("You picked Keepers");
                display_menu_main_options();
                break;

            default:
                System.err.println("Unrecognized option");
                break;
        }
    }

    public void list() {
        switch (mainSelection) {
            case 1:
                //TODO: List animals
                System.out.println("List animals: " + animalType);
                String type = "";
                switch(animalType){
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
                }
                Animal.list(type);
                break;
            case 2:
                //TODO: List Keepers
                System.out.println("List Keepers");
                break;

            default:
                break;
        }
    }

    public void add() {
        switch (mainSelection) {
            case 1:
                //TODO: add animals
                System.out.println("Add animals");
                break;
            case 2:
                //TODO: add Keepers
                System.out.println("Add Keepers");
                break;

            default:
                break;
        }

    }

    public void remove() {
        switch (mainSelection) {
            case 1:
                //TODO remove animals
                System.out.println("Remove Animals");
                break;
            case 2:
                //TODO: Remove Keepers
                System.out.println("Remove Keepers");
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
