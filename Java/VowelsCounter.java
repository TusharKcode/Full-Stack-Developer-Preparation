import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsCounter{
    public static void main(String[] args) {
    System.out.print("# Enter the string: ");    
    Scanner sc = new Scanner(System.in);
    if(sc.hasNextLine()){
        Counter c = new Counter(sc.nextLine().toLowerCase().trim());
        c.vowelCounter();
    }
    sc.close();
    }
}
class Counter{
    String string;

    Counter(String s){
        this.string = s;
    }

    void vowelCounter(){
        char[] v = {'a','e','i','o','u'};
        char[] stringArray = string.toCharArray();
        int counter = 0; 
        HashMap<Character, Integer> map = new HashMap<>();       
        for (char elem : stringArray) {
            for(char x:v){                
                if(elem==x){
                    counter++;
                    if(map.containsKey(elem)){
                        map.put(elem, map.get(elem)+1);
                    }else{
                        map.put(elem, 1);
                    }
                    break;
                }
            }
            
        }
        System.out.println("# Vowels appeared : " + counter);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.println(m.getKey()+" appeared "+m.getValue()+ " time");            
        }
    }
}