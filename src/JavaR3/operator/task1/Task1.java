package JavaR3.operator.task1;
//1. Даны IP-адрес и маска подсети, необходимо вычислить адрес сети - реализуй метод getNetAddress.
//Используй операцию поразрядной конъюнкции (логическое И).
//
//Пример:
//IP-адрес: 11000000 10101000 00000001 00000010 (192.168.1.2)
//Маска подсети: 11111111 11111111 11111110 00000000 (255.255.254.0)
//Адрес сети: 11000000 10101000 00000000 00000000 (192.168.0.0)
//
//2. Реализовать метод print, который выведет в консоль данные в двоичном коде. Для IP-адреса(192.168.1.2)
//должна быть выведена строка "11000000 10101000 00000001 00000010"
//3. Метод main не участвует в тестировании
//
//Требования:
//•	Метод getNetAddress должен вычислять и возвращать адрес сети согласно переданным параметрам(IP-адрес и маска подсети).
//•	Метод getNetAddress должен быть статическим и публичным.
//•	Метод print должен быть статическим и публичным.
//•	Метод print должен преобразовывать переданный ему IP адрес в двоичный код и выводить на экран(как в условии).
public class Task1 {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] newByte = new byte[ip.length];
        for (int i = 0; i < 4; i++) {
            newByte[i] = (byte) ((ip[i] & 0xFF) & (mask[i] & 0xFF));
        }
        return newByte;
    }

    public static void print(byte[] bytes) {
        for (byte b: bytes) {
            System.out.format("%08d ", Integer.parseInt(Integer.toBinaryString(b & 255)));
        }
    }
}
