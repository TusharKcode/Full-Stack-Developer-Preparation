package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
        System.out.println("------ Match Method ------");
        Pattern pattern = Pattern.compile("java");
        Matcher matcher = pattern.matcher("java is java");        
        System.out.println(matcher.matches() + " -> fails because the entire string is not exactly \"java\"");
        System.out.println(matcher.lookingAt() + " -> succeeds as the string starts with \"java\"");
        while (matcher.find()){
            System.out.println("Match Found");
        }
        
        System.out.println("------ Index Method ------");
        Pattern pattern2 = Pattern.compile("(java)");
        Matcher matcher2 = pattern2.matcher("I love java");
        if(matcher2.find()){
            System.out.println(matcher2.start());
            System.out.println(matcher2.end());
            System.out.println(matcher2.start(1));
            System.out.println(matcher2.end(1));
        }

        System.out.println("------ Study Method ------");
        Pattern pattern3 = Pattern.compile("(java)(\\d)");
        Matcher matcher3 = pattern3.matcher("java5");
        if(matcher3.find()){
            System.out.println(matcher3.group());
            System.out.println(matcher3.groupCount());
            System.out.println(matcher3.hitEnd());
            System.out.println(matcher3.requireEnd());
        }

        System.out.println("------ Replacement Method ------");
        Pattern pattern4 = Pattern.compile("java");
        Matcher matcher4 = pattern4.matcher("java is java");
        System.out.println(matcher4.replaceFirst("Java"));
        System.out.println(matcher4.replaceAll("JAVA"));
        matcher4.reset();

        StringBuffer sb = new StringBuffer();
        while (matcher4.find()) {
            matcher4.appendReplacement(sb, "Java");
        }
        matcher4.appendTail(sb);
        System.out.println(sb.toString());
    }
}
