package hw.zhichko;

public class HW16 {
    public static void main(String[] args) {
//        Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.
        int num[] = new int[]{7, 9, 11, 2, 6, 8, 1, 3};
        int imax = 0, max = num[0], imin = 0, min = num[0], indStart =0 , indStop = 0;
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

        if (imax > imin) {
            indStart = imin;
            indStop = imax;
        }
        else {
            indStart = imax;
            indStop = imin;
        }
            int sum = 0;

        for (int i = indStart +1 ; i < indStop; i++) {
            sum += num[i];
        }
        System.out.println("Сумма чисел между минимальным и максимальным числом = " + sum);
    }
}
