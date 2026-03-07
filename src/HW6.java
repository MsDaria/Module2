import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HW6 {
    public static void section1(){
        Set<String> users = new HashSet<>() ;
        users.add("Дмитрий Хуторенко");
        users.add("Дарья");
        users.add("Константин");
        users.add("Мария");
        System.out.println(users);

        System.out.println("Есть ли Алиса? - " + users.contains("Alice"));
        System.out.println("Есть ли Мария? - " + users.contains("Мария"));

    }

    public static void section2(){
        Set<String> words = new TreeSet<>();

        String text = "Корабли лавировали лавировали да не вылавировали";
        words.add("Корабли");
        words.add("лавировали");
        words.add("лавировали");
        words.add("да");
        words.add("не");
        words.add("вылавировали");

        System.out.println(words);
    }

    public static void section3(){
        Set<String> guests = new LinkedHashSet<>();
        guests.add("Дмитрий Хуторенко");
        guests.add("Дарья");
        guests.add("Константин");
        guests.add("Мария");
        guests.add("Константин");

        System.out.println(guests);
    }
}
