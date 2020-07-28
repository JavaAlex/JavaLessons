package hw.zhichko;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW7 {
    public static void main(String[] args) throws IOException {
//        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.
        int a, b, r;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение а");
        a = Integer.parseInt(reader.readLine());
        System.out.println("Введите значение b");
        b = Integer.parseInt(reader.readLine());
        System.out.println("Введите значение r");
        r = Integer.parseInt(reader.readLine());

        if ((a*a + b*b) < (r*2)*(r*2)) //круг закроет прямоугольное отверстие если диагональ прамоугольника будет меньше или равна диаметру круга
            System.out.println("Круг закроет прямоугольное отверстие");
        else
            System.out.println("Круг не закроет прямоугольное отверстие");

    }
}
