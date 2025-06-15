
import java.util.*;

public class RestService {

    private static Map<Integer, String> tasks = new HashMap<>();

    public static String getTask(int id) {
        return tasks.getOrDefault(id, "Завдання не знайдено");
    }

    public static void createTask(int id, String name) {
        tasks.put(id, name);
        System.out.println("Завдання створено: " + name);
    }

    public static void main(String[] args) {
        createTask(1, "Почати проєкт");
        System.out.println(getTask(1));
    }
}
