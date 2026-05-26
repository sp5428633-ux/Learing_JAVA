
import java.util.regex.*;

public class RegexAllSymbolsDemo {

    public static void main(String[] args) {

        // ===============================
        // 1. BASIC SYMBOLS
        // ===============================
        System.out.println("---- BASIC SYMBOLS ----");

        // . → Any single character
        // a.b → 'a' then ANY character then 'b'
        System.out.println("a.b matches acb: " + "acb".matches("a.b")); // true
        System.out.println("a.b matches a1b: " + "a1b".matches("a.b")); // true
        System.out.println("a.b matches ab: " + "ab".matches("a.b")); // false (missing middle char)

        // \d → digit (0-9)
        System.out.println("\\d matches 5: " + "5".matches("\\d")); // true

        // \D → non-digit
        System.out.println("\\D matches A: " + "A".matches("\\D")); // true

        // \w → word character (a-z, A-Z, 0-9, _)
        System.out.println("\\w matches a: " + "2".matches("\\w")); // true

        // \W → non-word character
        System.out.println("\\W matches #: " + "#".matches("\\W")); // true

        // \s → whitespace (space, tab, newline)
        System.out.println("\\s matches space: " + " ".matches("\\s")); // true

        // \S → non-whitespace
        System.out.println("\\S matches A: " + "A".matches("\\S")); // true

        // ===============================
        // 2. QUANTIFIERS
        // ===============================
        System.out.println("\n---- QUANTIFIERS ----");

        // + → one or more times
        // \d+ → one or more digits
        System.out.println("\\d+ matches 123: " + "123".matches("\\d+")); // true

        // * → zero or more times
        // a* → can be empty or many 'a'
        System.out.println("a* matches empty: " + "".matches("a*")); // true
        System.out.println("a* matches aaa: " + "aaa".matches("a*")); // true

        // ? → zero or one time (optional)
        // u is optional here
        System.out.println("colou?r matches color: " + "color".matches("colou?r")); // true
        System.out.println("colou?r matches colour: " + "colour".matches("colou?r")); // true

        // {n} → exactly n times
        System.out.println("\\d{10} matches 10 digits: " + "1234567890".matches("\\d{10}")); // true

        // {n,} → at least n times
        System.out.println("\\d{3,} matches 1234: " + "1234".matches("\\d{3,}")); // true

        // {n,m} → between n and m times
        System.out.println("\\d{2,5} matches 123: " + "123".matches("\\d{2,5}")); // true

        // ===============================
        // 3. ANCHORS
        // ===============================
        System.out.println("\n---- ANCHORS ----");

        // ^ → start of string
        // $ → end of string
        // ^\d{10}$ → full string must be exactly 10 digits
        System.out.println("^\\d{10}$ matches 10-digit: " + "9876543210".matches("^\\d{10}$")); // true
        System.out.println("^\\d{10}$ matches invalid: " + "12345".matches("^\\d{10}$")); // false

        // ===============================
        // 4. CHARACTER CLASSES
        // ===============================
        System.out.println("\n---- CHARACTER CLASSES ----");

        // [abc] → any one of a, b, c
        System.out.println("[abc] matches a: " + "a".matches("[abc]")); // true

        // [^abc] → anything except a, b, c
        System.out.println("[^abc] matches d: " + "d".matches("[^abc]")); // true

        // [a-z] → lowercase letters
        System.out.println("[a-z] matches m: " + "m".matches("[a-z]")); // true

        // [A-Z] → uppercase letters
        System.out.println("[A-Z] matches M: " + "M".matches("[A-Z]")); // true

        // [0-9] → digits
        System.out.println("[0-9] matches 5: " + "5".matches("[0-9]")); // true

        // [a-zA-Z0-9] → alphanumeric
        System.out.println("[a-zA-Z0-9] matches Z: " + "Z".matches("[a-zA-Z0-9]")); // true

        // ===============================
        // 5. OR OPERATOR
        // ===============================
        System.out.println("\n---- OR OPERATOR ----");

        // | → either left or right
        // cat|dog → matches "cat" OR "dog"
        System.out.println("cat|dog matches cat: " + "1000".matches("1000|dog")); // true
        System.out.println("cat|dog matches dog: " + "ddog".matches("cat|dog")); // true

        // ===============================
        // 6. GROUPING
        // ===============================
        System.out.println("\n---- GROUPING ----");

        // (abc)+ → group abc repeated one or more times
        System.out.println("(abc)+ matches abc: " + "abc".matches("(abc)+")); // true
        System.out.println("(abc)+ matches abcabc: " + "abcabc".matches("(abc)+")); // true

        // ===============================
        // 7. FIND (REAL USE CASE)
        // ===============================
        System.out.println("\n---- FIND EXAMPLE ----");

        // Pattern → compiled regex
        Pattern pattern = Pattern.compile("\\d+");

        // Matcher → applies regex on string
        Matcher matcher = pattern.matcher("Order 101, Amount 5000");

        // find() → finds occurrences inside string
        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group()); // group() → matched value
        }
    }
}
