/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Diogo Pessoa codigo baseado em olhar no whatapp
 *
 */
public class RandomDate {

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

    //seleciona um numero randomico entre a diferença entre o end e o start
    //casting de double para int
    public static int randInBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static String[] populateArray(int yearMin, int yearMax) {

        String[] dates = new String[100];

        for (int i = 0; i < dates.length; i++) {
            String randomDate = RandomDate.getRandomDate(yearMin, yearMax);
            dates[i] = randomDate;
        }

        return dates;
    }

}
