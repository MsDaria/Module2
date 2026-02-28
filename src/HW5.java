import java.util.*;

public class HW5 {
    public static void section1(){
        Map<String, String> library = new HashMap<>();

        //Заполнение библиотеки
        library.put("Набоков", "Лолита");
        library.put("Булгаков", "Мастер и Маргарита");
        library.put("Лев Толстой", "Война и мир");
        library.put("Народная", "1000 и одна ночь");
        library.put("Железников", "Чучело");

        //Наличие книг
        Collection<String> values = library.values();
        System.out.println("Все книги в библиотеке: " + values);

        //Выдача книги
        String value = library.get("Набоков");
        System.out.println("Вы получили книгу: " + value);

        //Удаление книги
        library.remove("Набоков");
        System.out.println("после удаления Набокова: " + library);
    }

    public static void section2(){
        Map<String, Integer> contacts = new LinkedHashMap<>();

        contacts.put("Bob",33333333);
        contacts.put("Lusy",77777777);
        contacts.put("Mom", 222222222);
        contacts.put("Dad", 444444444);
        contacts.put("Nansy", 1111111111);

        System.out.println(contacts);
    }
    public static void section3(){
        Map<String, Integer> Students = new TreeMap<>();

        Students.put("Bob",2);
        Students.put("Stacy",4);
        Students.put("Lusy",5);
        Students.put("Nansy",4);
        Students.put("Dan",3);

        System.out.println("Отсортированный список студентов: " + Students);
    }
}
