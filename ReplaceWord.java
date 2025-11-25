import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String word1 = sc.nextLine();
        System.out.print("Enter replacement word: ");
        String word2 = sc.nextLine();
        String[] words = sentence.split(" ");
        String result = "";
        for (String w : words) {
            if (w.equals(word1)) result += word2 + " ";
            else result += w + " ";
        }
        System.out.println("Modified Sentence: " + result.trim());
    }
}