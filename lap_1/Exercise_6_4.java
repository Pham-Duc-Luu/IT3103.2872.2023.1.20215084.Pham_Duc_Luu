package lap_1;

import java.util.Scanner;

public class Exercise_6_4 {
    private static boolean isValidMonthYear(int month, int year) {
        return month >= 1 && month <= 12 && year >= 0;
    }

    private static int getMonthNumber(String input) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        String[] abbreviations = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.",
                "Nov.", "Dec." };

        for (int i = 0; i < months.length; i++) {
            if (input.equalsIgnoreCase(months[i]) || input.equalsIgnoreCase(abbreviations[i])
                    || input.equalsIgnoreCase(months[i].substring(0, 3)) || input.equals(String.valueOf(i + 1))) {
                return i + 1;
            }
        }
        return -1;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year, month;
        boolean validInput = false;

        do {
            System.out.print("Enter the year: ");
            year = scanner.nextInt();

            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            String input = scanner.next();

            month = getMonthNumber(input);

            validInput = isValidMonthYear(month, year);

            if (!validInput) {
                System.out.println("Invalid input. Please enter a valid month and year.");
            }
        } while (!validInput);

        int daysInMonth = getDaysInMonth(month, year);

        System.out.println(daysInMonth);
        scanner.close();

    }
}
