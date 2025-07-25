import java.util.*;

public class StepWordsFinder {

    public static List<String> findStepWords(String baseWord, List<String> dictionary) {
        List<String> result = new ArrayList<>();

        int[] baseFreq = getFreq(baseWord);

        for (String word : dictionary) {
            if (word.length() != baseWord.length() + 1) continue;

            int[] wordFreq = getFreq(word);

            if (isStepWord(baseFreq, wordFreq)) {
                result.add(word);
            }
        }

        Collections.sort(result);
        return result;
    }

    // Check if wordFreq has exactly one more character than baseFreq
    private static boolean isStepWord(int[] baseFreq, int[] wordFreq) {
        int extraCharCount = 0;

        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < baseFreq[i]) return false;
            extraCharCount += wordFreq[i] - baseFreq[i];
        }

        return extraCharCount == 1;
    }

    // Convert word to frequency array
    private static int[] getFreq(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputWord = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());

        List<String> dictionary = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(sc.nextLine().trim());
        }

        List<String> stepWords = findStepWords(inputWord, dictionary);
        for (String word : stepWords) {
            System.out.println(word);
        }
    }
}
