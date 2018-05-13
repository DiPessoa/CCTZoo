package utilities;

import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Class that generates random dates
 *
 * @author Diogo Pessoa
 *
 */
public class RandomDate {

    /**
     * Method generates dates between given years as parameters
     *
     * @param minYear Integer
     * @param maxYear Integer
     * @return String date
     */
    public static String getRandomDate(int minYear, int maxYear) {

        GregorianCalendar cal = new GregorianCalendar();

        int year = randInBetween(minYear, maxYear);
        int day = randInBetween(1, cal.getActualMaximum(cal.DAY_OF_YEAR));

        cal.set(cal.YEAR, year);
        cal.set(cal.DAY_OF_YEAR, day);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = cal.getTime();
        String randomDate = df.format(dt);

        return randomDate;
    }

    /**
     * Method selects a random number between given numbers as parameters,
     * casting double to integer
     *
     * @param start Integer
     * @param end Integer
     * @return Integer
     */
    public static int randInBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    /**
     * Method populates a Array number between given years as parameters
     *
     * @param yearMin Integer
     * @param yearMax Integer
     * @return Array
     */
    public static String[] populateArray(int yearMin, int yearMax) {

        String[] dates = new String[100];

        for (int i = 0; i < dates.length; i++) {
            String randomDate = RandomDate.getRandomDate(yearMin, yearMax);
            dates[i] = randomDate;
        }

        return dates;
    }

}
