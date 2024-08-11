import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String");
//        String str = sc.nextLine();
        String [] strArr = {"dog","racecar","car"};
       if (strArr.length==0)
            System.out.println("string is empty");
        else if(strArr.length==1)
            System.out.println(strArr[0]);
        else{
            String firstStr = strArr[0];
            for (int i = 1; i < strArr.length ; i++) {
                String currstr = strArr[i];
                int j=0;
                while (j<currstr.length() && j<firstStr.length() &&//abc //abcd
                currstr.charAt(j)==firstStr.charAt(j)){
                    j++;
                }
                if (j==0) {
                    System.out.println("this is not matched");
                    break;
                }
                firstStr = currstr.substring(0,j);
            }
            System.out.println(firstStr);


        }



    }
}


