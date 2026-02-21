import java.util.Scanner;

public class dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split("WUB");
        String sentence = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                if (!sentence.isEmpty()) {
                    sentence += " ";
                }
                sentence += word;
            }
        }
        System.out.println(sentence);

        scanner.close();
    }
}
