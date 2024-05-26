import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
 
/**
 * Question 1
 */

public class JCF {

    public static void main(String[] args) {
        JCF wordProcessor = new JCF();
        List<String> words = wordProcessor.extractWordsFromFile();
 
        if (!words.isEmpty()) {
            wordProcessor.sortWords(words);
            wordProcessor.printFirstOccurrenceOfLongestWord(words);
        }
    }
 
    public List<String> extractWordsFromFile() {
        List<String> words = new ArrayList<>();
        try {
            File textFile = new File("call_of_the_wild.txt");
            Scanner scanner = new Scanner(textFile);
 
            while (scanner.hasNext()) {
                String word = scanner.next().trim();
                if (!word.isEmpty() && !word.contains(" ")) {
                    words.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
            e.printStackTrace();
        }
        return words;
    }
 
    public void sortWords(List<String> words) {
        words.sort(Comparator.comparingInt(String::length).reversed());
    }

    public void printFirstOccurrenceOfLongestWord(List<String> words) {
        if (!words.isEmpty()) {
            System.out.println("First occurrence of the longest word: " + words.get(0));
        } else {
            System.out.println("Error: No words found.");
        }
    }
    
}