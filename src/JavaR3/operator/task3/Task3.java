package JavaR3.operator.task3;
//В классе Solution исправить пару методов equals/hashCode в соответствии с правилами
// реализации этих методов(детали уточни у своего любимого поисковика).
//Обе строки first и last должны принимать участие в сравнении с помощью метода equals и вычислении hashcode.
//Метод main не участвует в тестировании.
//
//Требования:
//•	Хешкоды одинаковых объектов должны быть равны.
//•	Метод equals должен проверять равен ли переданный объект текущему(сравнение через ==).
//•	Метод equals должен проверять является ли переданный объект объектом класса Solution.
//•	Метод equals должен возвращать true в случае, если поля first и last равны у переданного
// объекта и текущего(не забудь что они могут быть равны null).
//•	Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Task3 {
    private final String first, last;

    public Task3(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task3 task3 = (Task3) o;
        return first.equals(task3.first) && last.equals(task3.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Task3> s = new HashSet<>();
        s.add(new Task3("Donald", "Duck"));
        System.out.println(s.contains(new Task3("Donald", "Duck")));
    }
}
