package basicJavaSyntax;
/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал N вычисляется как 1*2*...*N.

Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит.
Поэтому будем использовать BigInteger.
 */
import java.math.BigInteger;

public class Step24_8 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
