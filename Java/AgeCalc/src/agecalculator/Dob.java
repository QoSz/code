package agecalculator;

import java.time.LocalDate;
import java.time.Period;

public class Dob {
    int year;
    int month;
    int day;

    public Dob(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    void calculateAge() {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(year, month, day);
        int age = Period.between(dob, today).getYears();
        System.out.println(age);
    }

    public static void main(String[] args) {
        Dob d1 = new Dob(2001, 12, 1);
        d1.calculateAge();
        System.out.println(d1.getYear());

        Dob d2 = new Dob(1998, 7, 22);
        d2.calculateAge();
        System.out.println(d2.getMonth());
    }
}
