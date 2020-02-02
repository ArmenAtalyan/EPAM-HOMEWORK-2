package service;

import model.Month;

import static model.Month.APRIL;
import static model.Month.MARCH;

public class MonthService {

    public static void initAndPrintMonths() {

        for (Month m : Month.values()) {
            System.out.print(m + "  ");
        }

        System.out.println();
        for (Month m : Month.values()) {
            if (m == MARCH)
                System.out.println("Number of days in " + m + " - " + m.getDay());
        }

        for (Month m : Month.values()) {
            if (m == APRIL) {
                for (String s : m.getHolidays()) {
                    System.out.println(s);
                }
            }
        }

        for (Month m : Month.values()) {
            if (m == MARCH) {
                for (String s : m.getHolidays()) {
                    int i = s.indexOf('-');
                    String word = s.substring(0, i);
                    String m8 = "March 8 ";
                    String m21 = "March 21 ";
                    if (word.equals(m8))
                        System.out.println(m8 + "is a public holiday");
                    else
                        System.out.println(m8 + "is not public holiday");
                    if (word.equals(m21))
                        System.out.println(m21 + "is a public holiday");
                    else
                        System.out.println(m21 + "is not public holiday");
                }
            }
        }
    }
}
