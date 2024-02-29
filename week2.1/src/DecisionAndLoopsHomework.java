import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DecisionAndLoopsHomework {
    // 1.1
    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }

    public static void generateNumber(Scanner input, int number) {
        System.out.println("Key in your guess: ");
        int guessNumber = input.nextInt();
        int countGuess = 0;
        while (guessNumber != number) {
            if (guessNumber > number) {
                System.out.println("Try lower");
                guessNumber = input.nextInt();
            } else {
                System.out.println("Try higher");
                guessNumber = input.nextInt();
            }
            countGuess++;
        }
        System.out.println("You got it in " + countGuess + " trials");
    }

    // 1.2
    // function guessWord() get a word from file words.txt
    public static String guessWord() throws FileNotFoundException {
        String url = "C:\\Users\\HT-Com\\Documents\\Senior-year\\Semester2\\OOP\\week2.1\\src\\words.txt";
        ArrayList<String> arrWords = new ArrayList<>();
        File file = new File(url);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        try {
            String line = reader.readLine();
            while (line != null) {
                arrWords.add(line);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                reader.close();
                // file.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        return arrWords.get((int) (Math.random() * arrWords.size()));
    }

    // update boolean[] correctPos when user guess trial
    public static void updateCorrectPos(boolean[] correctPos, char character, String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == character) {
                correctPos[i] = true;
            }
        }
    }

    public static String updateStrtrial(boolean[] correctPos, String inStr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            if (correctPos[i]) {
                result.append(inStr.charAt(i));
            } else {
                result.append("_");
            }
        }
        return result.toString();
    }

    public static boolean checkStrContains(String inStr,char character) {
        boolean strContainsChar = false;
        for (int idx = 0; idx < inStr.length(); idx++) {
            if (character == inStr.charAt(idx)) {
                strContainsChar = true;
            }
        }
        return strContainsChar;
    }

    public static void guessWord(Scanner input) throws FileNotFoundException {
        System.out.print("Key in one character or your guess word: ");
        int timeTrial = 1;
        String inStr = input.nextLine();
        String word = guessWord().toLowerCase();
        boolean[] correctPos = new boolean[word.length()];
        for (boolean idx: correctPos) {
            idx = false;
        }
        while (!inStr.equals(word)) {
            if (inStr.length() == 1) {
                if (checkStrContains(word, inStr.charAt(0))) {
                    updateCorrectPos(correctPos, inStr.charAt(0), word);
                }
            }
            System.out.println("Trial " + timeTrial + ": " + updateStrtrial(correctPos, word));
            System.out.print("Key in one character or your guess word: ");
            inStr = input.nextLine();
            timeTrial++;
        }

        System.out.println("Congratulation!");
        System.out.println("You got in " + timeTrial + " trials");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        generateNumber(input, generateNumber());
        guessWord(input);
    }
}
