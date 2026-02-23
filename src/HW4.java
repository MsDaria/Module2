import java.util.*;

class toDoList implements Comparable<toDoList> {
    String task;
    int priority;

    public toDoList (String task, int priority){
        this.task = task;
        this.priority = priority;
    }

    @Override
    public String toString(){
        return task + "(" + priority + ")";
    }

    @Override
    public int compareTo(toDoList other){
        return this.task.compareTo(other.task); // Сортировка по задачам
    }
}

public class HW4 {
    public static void section1(){
        // Создание списка покупок
        List<String> shoppingList = new ArrayList<>();
        // Добавление
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("milk");
        shoppingList.add("meat");
        shoppingList.add("ice cream");
        shoppingList.add("cookies");
        System.out.println(shoppingList);

        // Удаление по значениею
        shoppingList.remove("apple");
        System.out.println(shoppingList);

        // Удаление по индексу
        shoppingList.remove(2);
        System.out.println(shoppingList);

        // Поиск по значению
        boolean exists = shoppingList.contains("apple");
        System.out.println("Есть ли элемент apple? - " + exists);

        exists = shoppingList.contains("ice cream");
        System.out.println("Есть ли элемент ice cream? - " + exists);
    }

    public static void section2(){
        List<toDoList> toDo = new ArrayList<>();

        toDo.add(new toDoList("Почистить зубы", 1));
        toDo.add(new toDoList("Почитать книгу", 12));
        toDo.add(new toDoList("Завтрак", 3));
        toDo.add(new toDoList("Лечь спать", 22));
        toDo.add(new toDoList("Пойти в школу", 7));
        toDo.add(new toDoList("Уроки", 17));

        System.out.println("Список дел: ");
        for (toDoList t : toDo){
            System.out.println(t);
        }

        toDo.remove(3);
        System.out.println("После удаления: ");
        for (toDoList t :toDo){
            System.out.println(t);
        }

        Collections.sort(toDo);
        System.out.println("Отсортированный список по задачам: ");
        for (toDoList t :toDo){
            System.out.println(t);
        }

        List<toDoList> toDoLinkedList = new LinkedList<>(toDo);
        toDoLinkedList.sort((s1, s2) -> Integer.compare(s1.priority, s2.priority));
        System.out.println("Отсортированный список по приоритету: ");
        for (toDoList t : toDoLinkedList){
            System.out.println(t);
        }
    }


}

