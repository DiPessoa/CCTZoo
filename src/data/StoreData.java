/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import animal.classification.Subtype;
import utilities.RandomDate;

/**
 *
 * @author Diogo Pessoa
 */
public class StoreData {

    public static String[] animalNames = new String[]{"squirrel", "eagle", "elephant", "lion",
        "wild cat", "parrot", "crow", "goose", "fox", "red fox", "dragon", "pelican",
        "sea lion", "turkey", "owl", "baboon", "badger", "bear", "buffalo", "butterfly",
        "hyaena", "castor", "python", "parrot", "tiger", "cheetah", "lizard",
        "crab", "iguana", "mule", "wild dog", "camel", "beaver", "penguin", "falcon",
        "flamingo", "frog", "gazelle", "giraffe", "goat", "gorilla", "guerza", "hyrax",
        "capra", "jaguar", "panthera", "kangaroo", "koala", "leopard", "cacatua", "moose", "crocodile",
        "armadillo", "orca", "puma", "rabbit", "raccoon", "sheep", "monkey", "wolf",
        "suricatta", "zebra", "catfish", "caterpillar", "chicken", "cow", "black bear", "beetle",
        "antelope", "alligator", "dolphin", "bat", "bongo", "coyote", "ant", "deer", "dragonfly",
        "galapagos", "hamster", "horse", "lemur", "llama", "lynx", "pig", "polar bear", "sloth",
        "tarantula", "tortoise", "rhino"};

    public static String[] animalDob = RandomDate.populateArray(2000, 2010);

    public static char[] animalGender = new char[]{'M', 'F'};

    public static String[] animalDateArrival = new String[]{"23/01/2016", "04/10/2015", "", "", ""};

    public static Subtype[] animalSubtype = new Subtype[]{Subtype.AQUATIC,
        Subtype.AVIAN, Subtype.INSECT, Subtype.MAMMAL, Subtype.REPTILE};

    public static String[] animalMedication = new String[]{""};

    public static boolean[] animalVaccine = new boolean[]{true, false};

    public static String[] zookeeperName = new String[]{"Luana", "Diogo", "Luzilene",
        "Jorge", "Joao", "Gabriel", "Boris", "Jonh", "Eoife", "Eoin", "Dermot",
        "Gerard", "Michael", "Mark", "Jenny", "Tristan", "Lovelie",
        "Cloe", "Steve", "Cristoff", "Katleen", "Edward", "Rosalinda",
        "Mellies", "Theresa", "Alisson", "Jamile", "Ace", "Gian", "Jackie",
        "Justine", "Judith", "Joseph", "Joe", "Patrick", "Mathew", "Angela",
        "Jessica", "Barbara", "Agnes", "Paolo", "Eva", "Leornad", "Fernando",
        "Laura", "Rafael", "Eliska", "Mio", "Afonso", "Pamela"};

    public static String[] zookeeperDob = RandomDate.populateArray(1970, 1995);

    public static String[] zookeeperAddress = {"123 Parnell St", "34 Dermont St", "78 Inns Quay", "32 Rock Road"};

    public static String[] zookeeperPps = {"123456CA", "356244BV", "234567RE", "098567FR", "643542GG", "643552HG"};

}
