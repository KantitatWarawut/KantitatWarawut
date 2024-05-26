import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Question 2
 */

public class ExecuteAround {

    public static void main(String[] args) {
        try {
            List<String> words = processFile();
            printFirstOccurrenceOfLongestWord(words);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<String> processFile() throws IOException {
        String textFile = "call_of_the_wild.txt";
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split(" ");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
        }
        // Lambda + Method Reference?
        words.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        
        return words;
    }

    public static void printFirstOccurrenceOfLongestWord(List<String> words) {
        if (!words.isEmpty()) {
            System.out.println("First occurrence of the longest word: " + words.get(0));
        } else {
            System.out.println("Error: No words found.");
        }
    }

}