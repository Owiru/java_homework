import java.util.ArrayList;
import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringOfSymbols = scan.nextLine();

        char[] bufferChars = stringOfSymbols.toCharArray();
        ArrayList<Character> testedChars = new ArrayList<>();
        char tempChar;

        for (char ch: bufferChars)
        {
            tempChar = ch;
            if (testedChars.contains(tempChar)) {
                continue;
            }
            int countChar = 0;
            for (char ch2: bufferChars) {
                if (ch2 == tempChar) {
                    countChar++;
                }
            }
            testedChars.add(tempChar);
            System.out.printf("%s%d", tempChar, countChar);
        }
        scan.close();
    }
}
