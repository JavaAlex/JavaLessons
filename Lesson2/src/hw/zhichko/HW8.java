package hw.zhichko;

import java.util.Random;

public class HW8 {
    public static void main(String[] args) {
//        Имеется целове число (задать с помощью Random rand = new Random(); int x =
//                rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.
        Random rand = new Random();
        int money = rand.nextInt();
        int money1 = money;
        if (money > 0) {
            if (money % 10 > 1)
                System.out.println(money + " рубля");
            else
                if (money % 10 == 1)
                    System.out.println(money + " рубль");
                else
                System.out.println(money + " рублей");
        }
        else {
            money = money * -1;
            if (money % 10 > 1)
                System.out.println(money1 + " рубля");
            else
            if (money % 10 == 1)
                System.out.println(money1 + " рубль");
            else
                System.out.println(money1 + " рублей");
        }
    }
}
