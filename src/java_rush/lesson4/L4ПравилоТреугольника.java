package java_rush.lesson4;
/*Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
        Определить возможность существования треугольника по сторонам.
        Результат вывести на экран в следующем виде:
        "Треугольник существует." - если треугольник с такими сторонами существует.
        "Треугольник не существует." - если треугольник с такими сторонами не существует.

        Подсказка:
        Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
        Требуется сравнить каждую сторону с суммой двух других.
        Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
        то треугольника с такими сторонами не существует.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4ПравилоТреугольника {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}
