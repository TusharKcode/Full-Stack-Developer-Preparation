package Practice;

public class CharacterClass {
    public static void main(String[] args) {
        System.out.println("------- Simple Character Class -------");
        String regex = "[abc]";
        System.out.println("a".matches(regex));
        System.out.println("bc".matches(regex));
        System.out.println("d".matches(regex));

        System.out.println("------- Range Character Class -------");
        String rangeRegex = "[0-9]";
        System.out.println("5".matches(rangeRegex));
        System.out.println("a".matches(rangeRegex));
        System.out.println("12".matches(rangeRegex));

        System.out.println("------- Multiple Ranges in a Character Class -------");
        String multiRangeRegex = "[a-zA-Z0-9]";
        System.out.println("A".matches(multiRangeRegex));
        System.out.println("a".matches(multiRangeRegex));
        System.out.println("@".matches(multiRangeRegex));
        System.out.println("5".matches(multiRangeRegex));

        System.out.println("------- Negated Character Class -------");
        String negatedRegex = "[^0-9]";
        System.out.println("I".matches(negatedRegex));
        System.out.println("4".matches(negatedRegex));
        System.out.println("@".matches(negatedRegex));
    }
}
