import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date");
        String str=sc.nextLine();
        LocalDate today =LocalDate.now();
        String nextdate=today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("before" + today);
        System.out.println("after" + nextdate);
    }
}