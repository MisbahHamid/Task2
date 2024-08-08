import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string");
        String str = input.nextLine();
        boolean flag = true;
        for (int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str. length()-1-i)){
                flag =false;
                break;
            }

        }
        String msg =(flag==true)?"it is palindrome":"its is not a palindrome";
        System.out.println(msg);
    }
}