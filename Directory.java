package Less4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Directory {
    //создаем HashMap

    private HashMap<String, Set<String>> directory = new HashMap<>();

    // метод добавления по ключу
    public void add(String name, String phone) {
        Set<String> number = directory.getOrDefault(name, new HashSet<>());
        number.add(phone);
        directory.put(name, number);
    }

    // возвращаем значение
    public Set<String> get(String name) {
        return directory.get(name);
    }
}
