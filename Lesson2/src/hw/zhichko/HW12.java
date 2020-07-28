package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW12 {
    public static void main(String[] args) throws IOException {
//        Найдите сумму первых n целых чисел, которые делятся на 3
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nn = Integer.parseInt(reader.readLine());
        int sum = 0, count = 0;

            for (int i = 1; count < nn;i++) {
                if (i % 3 == 0) {
                    sum += i;
                    count++;
                    System.out.println(i);
                }
            }

        System.out.println("Сумма первых " + nn + " чисел делящихся на 3 равна " + sum);

    }
}
