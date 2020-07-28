package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4 {
    public static void main(String[] args) throws IOException {
//        Определить число, полученное выписыванием в обратном порядке цифр
//        любого 4-х значного натурального числа n.
        System.out.println("Введите четырехзначное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int a, b, c, d, num1;
        int []xn = new int[4];
        if (num > 999 && num < 10000) {
//            a = num % 10 * 1000;
//            num /= 10;
//            b = num % 10 * 100;
//            num /= 10;
//            c = num % 10 *10;
//            num /= 10;
//            d = num;
//            num1 = a + b + c + d;
            for (int i = 0; i < 4; i++) {
                xn[i] = num % 10;
                num /= 10;
            }
            num1= xn[0]*1000 + xn[1]*100 + xn[2]*10 + xn[3];
            System.out.println(num1);
        }
        else
            System.out.println("Вы ввели не четырехзначное число!");

    }
}
