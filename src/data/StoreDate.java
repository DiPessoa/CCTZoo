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
public class StoreDate {


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

    //public String[] animalDob = new String[]{};
    public static String[] animalDob = RandomDate.populateArray(2000, 2010);

    public static char[] animalGender = new char[]{'M', 'F'};

    public static String[] animalDateArrival = new String[]{"23/01/2016", "04/10/2015", "", "", ""};

    public static Subtype[] animalSubtype = new Subtype[]{Subtype.AQUATIC,
        Subtype.AVIAN, Subtype.INSECT, Subtype.MAMMAL, Subtype.REPTILE};

    public static String[] animalMedication = new String[]{""};

//TODO: RESOLVER OFFSPRING
//    public Offspring[] animalOffspring = new Offspring[] {};
    //public static String[] animalDateDod = new String[]{};
    public static String[] animalDateDod = RandomDate.populateArray(2011, 2017);

    
    //problema se estiver morto a variavel tem que ser true
    public static boolean[] animalIsDead = new boolean[]{true, false};

    public static boolean[] animalVaccine = new boolean[]{true, false};

    public static String[] animalZookeeper = new String[]{"Luana", "Diogo", "Luzilene",
        "Jorge", "Joao", "Gabriel", "Boris", "Jonh", "Eoife", "Eoin", "Dermot",
        "Gerard", "Michael", "Mark", "Jenny", "Tristan", "Lovelie",
        "Cloe", "Steve", "Cristoff", "Katleen", "Edward", "Rosalinda",
        "Mellies", "Theresa", "Alisson", "Jamile", "Ace", "Gian", "Jackie",
        "Justine", "Judith", "Joseph", "Joe", "Patrick", "Mathew", "Angela",
        "Jessica", "Barbara", "Agnes", "Paolo", "Eva", "Leornad", "Fernando",
        "Laura", "Rafael", "Eliska", "Mio", "Afonso", "Pamela"};

    //Popula os vertores de data - passar esse metodo para RandomDate
//    public static String[] populateArray(int yearMin, int yearMax) {
//
//        String[] dates = new String[100];
//
//        for (int i = 0; i < dates.length; i++) {
//            String randomDate = RandomDate.getRandomDate(yearMin, yearMax);
//            dates[i] = randomDate;
//        }
//
//        return dates;
//    }

}
