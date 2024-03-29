package JavaR2;

import java.util.HashMap;
import java.util.Map;

//Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
//арбуз - ягода,
//банан - трава,
//вишня - ягода,
//груша - фрукт,
//дыня - овощ,
//ежевика - куст,
//жень-шень - корень,
//земляника - ягода,
//ирис - цветок,
//картофель - клубень.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//Пример вывода (тут показана только одна строка):
//картофель - клубень
public class TaskMap10Pair {
    public static void main(String[] args) {
        Map<String, String> plants = new HashMap<>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "ягода");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");

        for (Map.Entry<String, String> pair :
                plants.entrySet()) {
            String name = pair.getKey();
            String type = pair.getValue();
            System.out.println(name + "-" + type);
        }
    }
}
