package Less4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Задание 1

        // создаем list
        String[] string= {"один","два","три","четыре","пять","шесть","два","семь","три","восемь",};
        List<String> word  = Arrays.asList(string);

        HashMap<String,Integer> uniqueWord= new HashMap<>();

        // идем по массиву и считаем сколько раз встречается каждое слово
        for (String x:word){
            uniqueWord.put(x,uniqueWord.getOrDefault(x,0)+1);
        }

        // выводим результат

        System.out.println(uniqueWord);

        //Задание 2

        // заполняем справочник
        Directory workers = new Directory();
        workers.add("Иванов", "8-965-567-56-78");
        workers.add("Петров", "8-433-456-34-45");
        workers.add("Сидоров", "8-234-234-23-34");
        workers.add("Иванов", "8-123-345-67-88");

        // выводим результат
        System.out.println(workers.get("Иванов"));
    }
}