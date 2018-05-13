package data;

import animal.classification.Subtype;
import utilities.RandomDate;

/**
 * Class to store data
 *
 * @author Diogo Pessoa
 *
 */
public class StoreData {

    /**
     * Method array animalNames to store all animal's names.
     *
     *
     */
    public static String[] animalNames = new String[]{"Squirrel", "Eagle", "Elephant", "Lion",
        "Wild cat", "Parrot", "Crow", "Goose", "Fox", "Red fox", "Dragon", "Pelican",
        "Sea lion", "Turkey", "Owl", "Baboon", "Badger", "Bear", "Buffalo", "Butterfly",
        "Hyaena", "Castor", "Python", "Parrot", "Tiger", "Cheetah", "Lizard",
        "Crab", "Iguana", "Mule", "Wild dog", "Camel", "Beaver", "Penguin", "Falcon",
        "Flamingo", "Frog", "Gazelle", "Giraffe", "Goat", "Gorilla", "Guerza", "Hyrax",
        "Capra", "Jaguar", "Panthera", "Kangaroo", "Koala", "Leopard", "Cacatua", "Moose", "Crocodile",
        "Armadillo", "Orca", "Puma", "Rabbit", "Raccoon", "Sheep", "Monkey", "Wolf",
        "Suricatta", "Zebra", "Catfish", "Caterpillar", "Chicken", "Cow", "Black bear", "Beetle",
        "Antelope", "Alligator", "Dolphin", "Bat", "Bongo", "Coyote", "Ant", "Deer", "Dragonfly",
        "Galapagos", "Hamster", "Horse", "Lemur", "Ilama", "Lynx", "Pig", "Polar bear", "Sloth",
        "Tarantula", "Tortoise", "Rhino"};

    /**
     * Method array animalDob to store all animal's date of birth.
     */
    public static String[] animalDob = RandomDate.populateArray(2000, 2010);

    /**
     * Method array animalGender to store animal gender.
     */
    public static char[] animalGender = new char[]{'M', 'F'};

    /**
     * Method array animalDateArrival to store all animal's date of arrival.
     */
    public static String[] animalDateArrival = new String[]{"23/01/2016", "04/10/2015", "", "", ""};

    /**
     * Method array animalSubtype to store all animal's subtypes.
     */
    public static Subtype[] animalSubtype = new Subtype[]{Subtype.AQUATIC,
        Subtype.AVIAN, Subtype.INSECT, Subtype.MAMMAL, Subtype.REPTILE};

    /**
     * Method array animalVaccine to store all animal's vaccine.
     */
    public static boolean[] animalVaccine = new boolean[]{true, false};

    /**
     * Method array zookeeperlNames to store all zookeeper's names.
     */
    public static String[] zookeeperName = new String[]{"Luana", "Diogo", "Luzilene",
        "Jorge", "Joao", "Gabriel", "Boris", "Jonh", "Eoife", "Eoin", "Dermot",
        "Gerard", "Michael", "Mark", "Jenny", "Tristan", "Lovelie",
        "Cloe", "Steve", "Cristoff", "Katleen", "Edward", "Rosalinda",
        "Mellies", "Theresa", "Alisson", "Jamile", "Ace", "Gian", "Jackie",
        "Justine", "Judith", "Joseph", "Joe", "Patrick", "Mathew", "Angela",
        "Jessica", "Barbara", "Agnes", "Paolo", "Eva", "Leornad", "Fernando",
        "Laura", "Rafael", "Eliska", "Mio", "Afonso", "Pamela"};

    /**
     * Method array zookeeperlDob to store all zookeeper's date of birth.
     */
    public static String[] zookeeperDob = RandomDate.populateArray(1970, 1995);

    /**
     * Method array zookeeperlAddress to store all zookeeper's address.
     */
    public static String[] zookeeperAddress = {"123 Parnell St", "34 Dermont St", "78 Inns Quay", "32 Rock Road"};

    /**
     * Method array zookeeperlPps to store all zookeeper's pps.
     */
    public static String[] zookeeperPps = {"123456CA", "356244BV", "234567RE", "098567FR", "643542GG", "643552HG"};

}
