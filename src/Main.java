import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email");
        String str=sc.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-z]+\\d+|[a-zA-z]+||[a-zA-z]+.[a-zA-Z]+)@gmail.com");
        Matcher matcher = pattern.matcher(str);
        boolean b=matcher.matches();
        if (b){
            System.out.println("Valid");
        }
        else{
            System.out.println("InValid");
        }

    }
}