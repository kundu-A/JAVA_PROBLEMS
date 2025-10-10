import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        Map<Character,Long> result=counter(str);
        System.out.println(result);
        sc.close();
    }
    public static Map<Character,Long> counter(String str){
        return str
            .toLowerCase()
            .chars()
            .mapToObj(c->(char)c)
            .filter(c->c!=' ')
            .collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }
}
