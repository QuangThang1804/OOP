package hus.oop.lap2;

import java.util.Scanner;

public class DecipherCeasarCode {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner input = new Scanner(System.in);
        StringBuilder outStr= new StringBuilder();
        System.out.print("Enter a ciphertext string: ");

        inStr = input.next().toUpperCase();
        input.nextLine();
        inStrLen = inStr.length();

        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            char temp = (char) (inStr.charAt(charIdx)-3);
            if ((int) temp< (int)'A') temp= (char) ( (int) temp +(int)'Z' -(int)'A');
            outStr.append(temp);
        }
        System.out.println("The plain text String is: "+outStr);
    }
}
