package java_rush.lesson6;

import java.util.ArrayList;

//1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
//2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
// Создать 10 объектов Cat.
//3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
public class CatArrayList {


    public CatArrayList() {

        // cats.add(this); можно так добавлять если объекты в ручную
    }


    public static ArrayList<CatArrayList> cats = new ArrayList<>();

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            cats.add(new CatArrayList());
        }

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}

