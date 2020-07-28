package hw.zhichko;

import java.util.Random;

public class HW15 {
    public static void main(String[] args) {
//        Создать массив, заполнить его случайными элементами, распечатать,
//                перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).
        Random rand = new Random();
        int num[] = new int[rand.nextInt(30)];
        for (int i = 0; i < num.length; i++)
            num[i]  = rand.nextInt(100);
        System.out.print("Исходный массив = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length - i; j++) {
                int tmp = num[j-1];
                num[j-1] = num[j];
                num[j] = tmp;
            }
        }
        System.out.print("Перевернутый массив = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
