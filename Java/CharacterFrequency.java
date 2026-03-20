import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountFrequency{
    String sentence;

    CountFrequency(String sentence){
        this.sentence = sentence;
        System.out.println("Given Sentence is: " + sentence);
        counter();
    }

    void counter(){
        Map<Character, Integer> countFrq = new HashMap<>();

        for(char c : sentence.toCharArray()){
            countFrq.put(c, countFrq.getOrDefault(c,0) + 1);
        }
        System.out.println("\nCharacter frequency: ");
        for(Map.Entry<Character, Integer> entry : countFrq.entrySet()){
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner frqScn = new Scanner(System.in);
        System.out.println("\nEnter Sentence: ");
        String userIp = frqScn.nextLine();
        new CountFrequency(userIp);

        frqScn.close();
    }
}
