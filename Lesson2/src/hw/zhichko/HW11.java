package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW11 {
    public static void main(String[] args) throws IOException {
//        Имеется целое число, определить является ли это число простым, т.е.
//                делится без остатка только на 1 и себя.
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count > 2)
            System.out.println("Данное число не является простым");
        else
            System.out.println("Даннаое число является простым");
    }
}
