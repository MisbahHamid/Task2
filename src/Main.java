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
        Scanner input = new Scanner(System.in);
       System.out.println("Enter a string:");
        String str = input.nextLine();
        String newStr = "";
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            int j;
            for (j=0; j<i ;j++){
                if (arr[i]==arr[j]){
                    break;
                }
            }
            if(i==j){
              newStr += arr[i];
           }
       }
        System.out.println(newStr);
        char [] arr1 = newStr.toCharArray();
        Arrays.sort(arr1);
       newStr = String.valueOf(arr1);
        System.out.println(newStr);

    }
}


