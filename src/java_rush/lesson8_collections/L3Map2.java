package java_rush.lesson8_collections;

import java.util.HashMap;
import java.util.Map;

//Есть класс Cat с полем имя (name, String).
//Создать коллекцию Map<String, Cat> (реализация HashMap).
//Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//Вывести результат на экран, каждый элемент с новой строки.
public class L3Map2 {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        for (String name : cats) {
            map.put(name, new Cat(name));
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
