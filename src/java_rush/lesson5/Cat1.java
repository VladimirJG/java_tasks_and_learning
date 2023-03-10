package java_rush.lesson5;

//Создать класс Cat (кот) с пятью инициализаторами:
//- Имя,
//- Имя, вес, возраст
//- Имя, возраст (вес стандартный)
//- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
//- вес, цвет, адрес (чужой домашний кот)
//
//Задача инициализатора - сделать объект валидным.
//Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
//Кот не может ничего не весить.
//То же касается возраста и цвета.
//А вот имени может и не быть (null).
//То же касается адреса: null.
public class Cat1 {
    public String name;
    public int weight;
    public int age;
    public String color;
    public String address;

    public void initialize(String name) {
        this.name = name;
        this.weight = 3;
        this.age = 2;
        this.color = "Blue";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Blue";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "Blue";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
