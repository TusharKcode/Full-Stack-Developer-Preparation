package Java.Regex.Practice;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println("------- Greedy Quantifier -------");
        String greedyRegex = "a+";
        System.out.println("aaaa".matches(greedyRegex));

        System.out.println("------- Reluctant Quantifier -------");
        String reluctantRegex = "a+?";
        System.out.println("aaaa".matches(reluctantRegex));

        System.out.println("------- Possessive Quantifier -------");
        String possessiveRegex = "a++a";
        System.out.println("aaaa".matches(possessiveRegex));
    }
}
