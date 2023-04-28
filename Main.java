import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 *
 * We'll obey the following constraints:
 * <ol>
 *   <li>Equality is case-insensitive</li>
 *   <li>Non-letter characters & numbers matters</li>
 *   <li>Spaces matters</li>
 *   <li>Arguments should have the same size</li>
 * </ol>
 */
public class Main {

  /**
   * The first solution converts the 2 strings to char arrays O(2n), sorts them O(2s log s) + equals check O(n) leading to runtime of
   * O(3n + 2s log s) and by dropping the constants and the non-dominant runtimes we get O(s log s). This approach assures that
   * if we have the same sequence of characters in both inputs they will be ordered in the same manner, as long as the sorting function is the same.
   *
   * Time Complexity: O(s log s)
   * Space Complexity: O(s)
   */
  public static boolean isPermutationV1(String first, String second) {
    if (first == null || first.isBlank() || second == null || second.isBlank() || first.length() != second.length()) {
      return false;
    }

    char[] firstChars = first.toCharArray(); // O(n) to fill the array
    char[] secondChars = second.toCharArray(); // O(n) to fill the array

    Arrays.sort(firstChars); // O(n log n)
    Arrays.sort(secondChars); // O(n log n)

    // O(n)
    for (int i = 0; i < firstChars.length; i++) {
      if (Character.toLowerCase(firstChars[i]) != Character.toLowerCase(secondChars[i])) {
        return false;
      }
    }

    return true;
  }

  /**
   * An improvement of the previous version could be done if we assume that we'll only work with not extended ASCII table and
   * store the characters along with their occurrences count. Creating an int[] to hold them, we pass through all the characters
   * of <i>first</i> and enumerate them, then to establish that the <i>second</i> is permutation we go through all the characters
   * of it and decrease the occurrences for each character. At the end all the characters occurrences should be 0.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static boolean isPermutationV2(String first, String second) {
    if (first == null || first.isBlank() || second == null || second.isBlank() || first.length() != second.length()) {
      return false;
    }

    int[] occurrences = new int[128];

    for (int i = 0; i < first.length(); i++) {
      // increment how much times the char is found
      occurrences[Character.toLowerCase(first.charAt(i))]++;
      // decrement each time a char is found
      occurrences[Character.toLowerCase(second.charAt(i))]--;
    }

    for (int i = 0; i < occurrences.length; i++) {
      // if it's not zero -> not permutation
      if (occurrences[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
