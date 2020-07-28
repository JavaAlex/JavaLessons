package hw.zhichko;

import java.util.Random;

public class HW13 {
    public static void main(String[] args) {
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них
        Random rand = new Random();
        int num[] = new int[rand.nextInt(30)];
        for (int i = 0; i < num.length; i++)
            num[i]  = rand.nextInt(100);
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
        System.out.println("Максимальное число в масиве = " + max);
        System.out.print("Массив = ");
        for (int i =0; i < num.length; i++)
            System.out.print(num[i] + " ");
    }
}
