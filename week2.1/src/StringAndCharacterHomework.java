import java.util.Scanner;

public class StringAndCharacterHomework {
    // 3.1
    public static String exchangeCipher(String inStr) {
        StringBuilder exchangeCipherStr = new StringBuilder();
        String inStrUpperCase = inStr.toUpperCase();
        char cipherChar;
        for (int idx = 0; idx < inStrUpperCase.length(); idx++) {
            cipherChar = (char) ('A' + 'Z' - inStrUpperCase.charAt(idx));
            exchangeCipherStr.append(cipherChar);
        }
        return exchangeCipherStr.toString();
    }

    public static void testExchangeCipher(Scanner input) {
        System.out.print("Enter a plaintext string: ");
        String inStr = input.nextLine();
        System.out.println("The ciphertext string is: " + exchangeCipher(inStr));
    }

    // 3.2
    public static boolean isPalindromicWord(String inStr) {
        boolean isPalindromicWord = true;
        for (int fidx = 0, lidx = inStr.length() - 1; fidx < inStr.length() / 2; fidx++, lidx--) {
            if (inStr.charAt(fidx) != inStr.charAt(lidx)) {
                isPalindromicWord = false;
            }
        }
        return isPalindromicWord;
    }

    public static void testPalindromicWord(Scanner input) {
        System.out.print("Enter the word: ");
        String inStr = input.nextLine();
        if (isPalindromicWord(inStr)) {
            System.out.println("\"" + inStr + "\" is a palindromic word");
        } else {
            System.out.println("\"" + inStr + "\" is not a palindromic word");
        }
    }

    public static boolean isPalindromicPhrase(String inStr) {
        boolean isPalindromicPhrase = true;
        StringBuilder inStrWith = new StringBuilder();
        String inStrLowerCase = inStr.toLowerCase();
        for (int idx = 0; idx < inStrLowerCase.length(); idx++) {
            if (inStrLowerCase.charAt(idx) >= 'a' && inStrLowerCase.charAt(idx) <= 'z') {
                inStrWith.append(inStrLowerCase.charAt(idx));
            }
        }
        String temp = inStrWith.toString();

        return isPalindromicWord(inStrWith.toString());
    }

    public static void testPalindromicPhrase(Scanner input) {
        System.out.print("Enter the phrase: ");
        String inStr = input.nextLine();
        if (isPalindromicPhrase(inStr)) {
            System.out.println("\"" + inStr + "\" is a palindromic phrase");
        } else {
            System.out.println("\"" + inStr + "\" is not a palindromic phrase");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        testExchangeCipher(input);
//        testPalindromicWord(input);
        testPalindromicPhrase(input);
    }

}
