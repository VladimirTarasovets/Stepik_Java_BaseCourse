package basicJavaSyntax;
/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
Массивы могут быть любой длины, в том числе нулевой.
Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам
и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи
Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Пример
Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 */

import java.util.Arrays;

public class Step24_9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] result = new int [a1.length + a2.length];
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++)
        {
            if (i2 >= a2.length || i1 < a1.length && a1[i1] < a2[i2]) {
                result[i] = a1[i1];
                i1++;
            } else {
                result[i] = a2[i2];
                i2++;
            }
        }

        return result;
    }

}
