//Take a date input from string and add 30 days on that date and print new date in dd-mmyyyy this formate?

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date");
        String str=sc.nextLine();
        LocalDate date = LocalDate.parse(str);
        date = date.plusDays(30);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

    }
}