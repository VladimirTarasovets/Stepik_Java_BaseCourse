package basicJavaSyntax;

import java.util.Scanner;

public class Step21_8 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
//        System.out.println(leapYearCount(year));
    }
    public static int leapYearCount(int year) {
        return year/4 - year/100 + year / 400;
    }
}
