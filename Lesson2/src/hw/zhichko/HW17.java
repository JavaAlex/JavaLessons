package hw.zhichko;

public class HW17 {
    public static void main(String[] args) {
//        Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//        таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1
        int b[][] = new int[7][7]; // для квадратных массивов только работает.
        int n, n1;
        if (b.length%2==0)
            n1=b.length/2-1;
        else
            n1 = b.length/2;
        for (int j = 0; j < b.length; j++) {
            if (j <= n1) {  // 2
                n = j;
            }
            else {
                n = b[j].length -1 - j;
            }
            for (int i = n; i < b[j].length - n; i++) {
                b[j][i] = 1;
            }
        }
        for (int j = 0; j < b.length; j++) {
            for (int i = 0; i < b[j].length; i++) {
                System.out.print(b[j][i] + " ");
            }
            System.out.println();
        }
    }
}
