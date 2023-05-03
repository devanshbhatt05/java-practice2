import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SubDiff {
    public static String[] getLexicographicallyOrderedSubstrings(String word) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }
        Collections.sort(substrings);
        String[] result = new String[substrings.size()];
        return substrings.toArray(result);
    }
    public static void main(String[] args) {
        String word = "welcometojava";
        String[] substrings = getLexicographicallyOrderedSubstrings(word);
        System.out.println(Arrays.toString(substrings));
    }
}