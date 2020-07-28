package hw.zhichko;

public class HW9 {
    public static void main(String[] args) {
//        Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//        произведение, т.е. факториал числа
        double sum = 1;
        int x = (int)(Math.random() * 20);
        System.out.println(x);
        while (x != 0) {
            sum *= x;
            x--;
        }
        System.out.println("factorial:" + sum);
        }

    }

