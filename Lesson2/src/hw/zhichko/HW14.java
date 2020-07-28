package hw.zhichko;

import java.util.Random;

public class HW14 {
    public static void main(String[] args) {
//        Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера
        Random rand = new Random();
        int num[] = new int[rand.nextInt(30)];
        for (int i = 0; i < num.length; i++)
            num[i]  = rand.nextInt(100);
        int imax = 0, max = num[0], imin = 0, min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                imax = i;
            }
            if (num[i] < min) {
                min = num[i];
                imin = i;
            }
        }
        System.out.println("Минимальное значение = " + min + ". Индекс в массиве данного числа = " + imin);
        System.out.println("Максимальное значение = " + max + ". Индекс в массиве данного числа = " + imax);
        System.out.print("Массив = ");
        for (int i =0; i < num.length; i++)
            System.out.print(num[i] + " ");


    }
}
