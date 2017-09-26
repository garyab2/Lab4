/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * This class contains the method common.
 * @author - Gary Braznichenko (garyab2)
 */
public class ReclamationProject {
    /**
     *
     * @param word1 - A word passed into the common method.
     * @param word2 - A second word passed into the common method.
     * @return commonString - The common substring that can be found in both word1 and word2.
     */
    static String common(final String word1, final String word2) {
        //swaps longWord with shortWord if shortWord is the longer of the two
        String longWord = "", shortWord = "";
        if (word1.length() > word2.length()) {
            longWord = word1;
            shortWord = word2;
        } else {
            longWord = word2;
            shortWord = word1;
        }
        String commonString = "";
        for (int j = 0; j < shortWord.length(); j++) {
            for (int k = shortWord.length(); k > j; k--) {
                if (longWord.indexOf(shortWord.substring(j, k)) != -1) {
                    commonString = shortWord.substring(j, k);
                }
            }
        }
        return commonString;
     }
}
