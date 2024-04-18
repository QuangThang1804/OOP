package hus.oop.lap2;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        System.out.println(checkHex(input.nextLine()));
    }

    public static boolean checkHex(String input){
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            char hex = input.charAt(i);
            if(!(hex >= '0' && hex <= '9')&& !(hex >= 'A' && hex <= 'F'))
                return false;
        }
        return true;
    }
}
