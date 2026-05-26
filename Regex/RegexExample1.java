
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample1 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");// Pattern is a compiled regex.It stores the regex rule.
        Matcher matcher = pattern.matcher("1245");// Matcher check input text against the regex.It perform match operation.

        // if (matcher.matches()) {
        // System.out.println("Only digits");
        // } else {
        // System.out.println("Not only digits");
        // }
        // \D -> Any single Char
        System.out.println("12".matches("\\D"));
        System.out.println("\\w matches a: " + "2".matches("\\w"));
    }
}
