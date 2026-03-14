import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HW7 {
    public static void section1(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 3)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }

    public static void section2(){
        List<String> names = Arrays.asList("123","12345","1234568","6854","15987");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }

    public static void section3(){
        List<String> names = Arrays.asList("Анна","Борис","Валентина","Галя","Дима");

        List<String> filteredNames = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
