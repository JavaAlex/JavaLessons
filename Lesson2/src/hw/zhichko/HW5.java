package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5 {
    public static void main(String[] args) throws IOException {
//        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?
        System.out.println("Введите четырехзначное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int []xn = new int[4];
        int count = 0;
        if (num > 999 && num < 10000) {
            for (int i = 0; i < 4; i++) {
                xn[i] = num % 10;
                num /= 10;
            }
            for (int i = 0; i < xn.length; i++) {
                for (int j = i + 1; j < xn.length; j++) {
                    if (xn[i] == xn[j])
                        count++;
                }
            }
            if (count > 0)
                 System.out.println("Некоторые или все цифры чила совпадают") ;
            else
                System.out.println("Цифры числа различны");
        }
        else
            System.out.println("Вы ввели не четырехзначное число!");
    }
}
