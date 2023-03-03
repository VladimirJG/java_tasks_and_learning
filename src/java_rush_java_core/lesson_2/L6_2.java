package java_rush_java_core.lesson_2;

//Унаследуй классы Cat и Dog от Pet.
//Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
//
//Требования:
//•	Класс Pet должен быть абстрактным.
//•	Класс Dog не должен быть абстрактным.
//•	Класс Cat не должен быть абстрактным.
//•	Класс Dog должен наследоваться от класса Pet и реализовывать его абстрактные методы.
//•	Класс Cat должен наследоваться от класса Pet и реализовывать его абстрактные методы.
public class L6_2 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Name";
        }

        public Pet getChild() {
            return new Cat();
        }

    }

    public static class Dog extends Pet {
        public String getName() {
            return "Name";
        }
        public Pet getChild(){
            return new Dog();
        }
    }
}
