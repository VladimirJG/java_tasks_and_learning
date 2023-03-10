package java_rush.lesson8_data;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.
public class L6Время10000Вызовов {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date start = new Date();
        get10000(list);

        // напишите тут ваш код
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
