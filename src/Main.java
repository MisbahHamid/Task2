

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        if(Pattern.compile("\\(\\)|\\{\\}|\\[\\]|\\(\\{\\[\\]}\\)").matcher(str).matches())
            System.out.println("valid");
        else
            System.out.println("invalid");

    }
}

