package java_rush.lesson5;

//Создай классы Dog, Cat, Mouse.
//Добавь по три поля в каждый класс, на твой выбор.
//Создай объекты для героев мультика Том и Джерри.
//Так много, как только вспомнишь.
//
//Пример:
//Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
//где 12 - высота в см,
//5 - длина хвоста в см.
public class L12СозданиеКлассовЕще {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat cat =new Cat("Tom", 52,9);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
