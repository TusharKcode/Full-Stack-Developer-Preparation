package Java.JavaFeatures;

import java.util.function.Predicate;

public class PredicateMethods {
    public static void main(String[] args) {
        System.out.println("====== Test() Method ======");
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test(""));           // true
        System.out.println(isEmpty.test("Hello"));      // false

        System.out.println();

        System.out.println("====== And() Method ======");
        Predicate<Integer> isLessThan30 = n -> n < 30;
        Predicate<Integer> isMoreThan20 = n -> n > 20;
        System.out.println("The Number is Greater and Lesser than 20 & 30: " + isMoreThan20.and(isLessThan30).test(22));
        System.out.println("The Number is Greater and Lesser than 20 & 30: " + isMoreThan20.and(isLessThan30).test(31));

        System.out.println();

        System.out.println("====== Or() Method ======");
        Predicate<Integer> isLesserThan30 = n -> n < 30;
        Predicate<Integer> isGreaterThan20 = n -> n > 20;
        System.out.println("The Number is Greater or Lesser than 20 & 30: " + isGreaterThan20.or(isLesserThan30).test(22));
        System.out.println("The Number is Greater or Lesser than 20 & 30: " + isGreaterThan20.and(isLesserThan30).test(31));

        System.out.println();

        System.out.println("====== Negate() Method ======");
        Predicate<Integer> isPositive = n -> n > 0;
        System.out.println("Is given number positive? " + isPositive.negate().test(-10));
        System.out.println("Is given number positive? " + isPositive.negate().test(10));

        System.out.println();

        System.out.println("====== Equal() Method ======");
        Predicate<String> check = Predicate.isEqual("Java");
        System.out.println("Are given strings equal? " + check.test("Java"));
    }
}
