/**
 * Exercise (Chapter 1: Introduction to Java) — Strings and StringBuilder.
 *
 * Complete {@link #firstLetters(String)} below.
 *
 *
 * Relevant reading: 1.4. Strings and 1.4.4. StringBuilder.
 */
public class FirstLetters {

    public static void main(String[] args) {
        String phrase = "Idol Long Oolong Vertical Europe University Toyota";
        // Should print ILOVEUT once firstLetters is implemented.
        System.out.println("First letters of \"" + phrase + "\": " + firstLetters(phrase));
    }

    /**
     * Given a string of words separated by single spaces, returns a new string
     * made of the first character of each word, in order. You may assume the
     * input contains at least one word.
     *
     * Example: {@code firstLetters("Good Morning")} returns {@code "GM"}.
     *
     * @param words a non-empty string of words separated by single spaces
     * @return the first character of each word, concatenated
     */
    public static String firstLetters(String words) {
        // TODO: complete

//        String d = "wow oh no";
//        String[] m = d.split(" ");
//        for (int i = 0; i < m.length; i +=1) {
//            System.out.println(m[i]);
//        }

        String[] splitted = words.split(" ");
        System.out.println(splitted);
        // Initialize the builder
        StringBuilder finale = new StringBuilder("");

        for (int i = 0; i < splitted.length; i +=1) {
            // System.out.println(splitted[i]);
            // System.out.println(splitted[i].substring(0,1));
            finale.append(splitted[i].charAt(0));
        }
//        for (String s : splitted) {
//            finale.append(s[0]);
//        }

        return finale.toString();
    }
}
