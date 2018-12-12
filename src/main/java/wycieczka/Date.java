package wycieczka;

import java.util.Objects;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int rok, int month, int day) {
        this.year = rok;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "day: "+this.getDay()+" "
                +" month: "+ this.getMonth()+
                " "+ "year: "+this.getYear();
    }

    public static Date of(String s, String separator) {
        String[] array = s.split(separator);
        if (array.length != 3) {
            return null;
        }
        int year = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int day = Integer.parseInt(array[2]);
        return new Date(year, month, day);
    }




    public int getYear() {
        return year;
    }

    public void setYear(int rok) {
        this.year = rok;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year &&
                month == date.month &&
                day == date.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}

