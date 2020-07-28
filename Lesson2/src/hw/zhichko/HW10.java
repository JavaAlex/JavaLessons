package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW10 {
    public static void main(String[] args) throws IOException {
//        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
        System.out.println("Введите число от 10 до 15");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        long f=1;
        if (num >= 10 && num <= 15) {
            for (int i = 1; i <=num; i++) {
                f *= i;
            }
            System.out.println("Факториал числа " + num + " = " + f);
        }
        else
            System.out.println("Вы ввели не верное число");
    }
}
