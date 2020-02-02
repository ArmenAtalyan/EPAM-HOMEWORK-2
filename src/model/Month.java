package model;

public enum Month {
    JANUARY(31, new String[] {"January 6 - Christmas", "January 28 - Armenian army's birthday"}),
    FEBRUARY(28, new String[] {"No holidays"}),
    MARCH(31, new String[] {"March 8 - woman's day"}),
    APRIL(30, new String[] {"April 7 - mather's and girl's day"}),
    MAY(31, new String[] {"May 8 - Shushy's liberation day"}),
    JUNE(30,  new String[] {"June 1 - children's day"}),
    JULY(31,  new String[] {"No holidays"}),
    AUGUST(31,  new String[] {"No holidays"}),
    SEPTEMBER(30,  new String[] {"September 1 - education's day, September 21 - Armenian independence day"}),
    OCTOBER(31,  new String[] {"No holidays"}),
    NOVEMBER(30,  new String[] {"No holidays"}),
    DECEMBER(31,  new String[] {"No holidays"});

    private int dayNumber;
    private String[] holidays;

    Month(int dayNumber, String[] holidays) {
        this.dayNumber = dayNumber;
        this.holidays = holidays;
    }
   public int getDay(){
        return dayNumber;
   }
   public String[] getHolidays(){
        return holidays;
   }
}
