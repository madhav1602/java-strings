import java.util.Scanner;

public class CalendarGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for month and year input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        // Display the generated calendar for the given month and year
        displayCalendar(month, year);
    }

    // Method to display the calendar for a given month and year
    static void displayCalendar(int month, int year) {
        // Array storing month names
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        // Array storing the number of days in each month (default for non-leap years)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Adjust February's days for leap years
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        // Display month and year header
        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        // Get the starting day of the given month
        int startDay = getStartDay(month, year);
        
        // Print leading spaces for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }
        
        // Print the days of the month
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%2d ", day);
            // Move to the next line after Saturday (7th column)
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to determine if a given year is a leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the start day of the month using the Gregorian calendar formula
    static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12; // Adjust year if month is January or February
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Compute year-related offset
        int m0 = month + 12 * ((14 - month) / 12) - 2; // Adjust month index
        return (1 + x + (31 * m0) / 12) % 7; // Compute starting day (0 = Sunday, 6 = Saturday)
    }
}
