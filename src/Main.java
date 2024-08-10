//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
//string is valid.
//• An input string is valid if:
//        • Open brackets must be closed by the same type of brackets.
//• Open brackets must be closed in the correct order.
//• Every close bracket has a corresponding open bracket of the same type.
//        Example 1:
//        Input: s = "()"
//        Output: true
//        Example 2:
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//        Input: s = "(]"
//        Output: false

import java.util.Scanner;

import java.util.List;
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

