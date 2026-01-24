// problem

// A. Way Too Long Words

// Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

// Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

// This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

// Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

// You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.
import java.util.Scanner;

public class wtlw {
    public static void main(String[] args) {

        // testing
        // System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        String[] words = new String[n];

        // read input

        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        scanner.close();

        // process each word
        for (String word : words) {
            abbreviate(word);
        }

        scanner.close();

        // if its length is strictly more than 10 characters.

        // Helper method to abbreviate a word

    }

    static void abbreviate(String word) {
        if (word.length() > 10) {
            System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
        } else {
            System.out.println(word);
        }
    }
}