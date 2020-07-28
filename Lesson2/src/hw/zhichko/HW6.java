package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW6 {
    public static void main(String[] args) throws IOException {
//        Создайте число. Определите, является ли число трехзначным. Определите, является
//        ли его последняя цифра семеркой. Определите, является ли число четным.
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num >= 100 && num <1000)
            System.out.println("Это трехзначное число");
        else
            System.out.println("Это число не трехзначное");
        if (num%10 == 7)
            System.out.println("Последняя цифра является семеркой");
        else
            System.out.println("Последняя цифра не семерка");
        if ((num % 10) % 2 == 0)
            System.out.println("Это число четное");
        else
            System.out.println("Это число нечетное");

    }
}
