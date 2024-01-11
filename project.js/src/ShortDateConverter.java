import java.util.Scanner;
public class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input.substring(0, 4));
        int month = Integer.parseInt(input.substring(5, 7));
        int day = Integer.parseInt(input.substring(8, 10));
        String monthName = getMonthName(month);
        System.out.println(monthName + " " + day + ", " + year);
    }
    private static String getMonthName(int month) {
       return switch (month) {
               case 1 -> "January";
               case 2 -> "February";
               case 3 -> "March";
               case 4 -> "April";
               case 5 -> "May";
               case 6 -> "June";
               case 7 -> "July";
               case 8 -> "August";
               case 9 -> "September";
               case 10 -> "October";
               case 11 -> "November";
               case 12 -> "December";
               default -> "";
        };
    }
}

