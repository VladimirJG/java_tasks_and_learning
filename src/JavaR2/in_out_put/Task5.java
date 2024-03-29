package JavaR2.in_out_put;
//Исправить функциональность в соответствии с требованиями.
//Программа должна:
//1. Переписать все байты одного файла в другой одним куском.
//2. Закрывать потоки ввода-вывода.
//Подсказка:
//4 ошибки.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Task5 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\out");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\In");

        if (inputStream.available() >= 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
