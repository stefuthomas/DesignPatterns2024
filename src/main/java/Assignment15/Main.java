package Assignment15;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of CalendarToNewDateAdapter
        NewDateInterface newDate = new CalendarToNewDateAdapter(Calendar.getInstance());
        // Get the current date
        System.out.println("Today's date: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());

        // Advance the date by 5 days
        newDate.advanceDays(5);
        System.out.println("Date after 5 days: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());

        // Set the date to the 1st of January 2025
        newDate.setDay(1);
        newDate.setMonth(1);
        newDate.setYear(2025);
        System.out.println("Date as been changed to next year: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());
    }
}
