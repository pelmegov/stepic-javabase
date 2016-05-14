package module_2.lesson_2_4.step_8;

//    Реализуйте метод, вычисляющий факториал заданного натурального числа.
//
//    Факториал N
//    вычисляется как 1⋅2⋅...⋅N
//
//    .
//
//    Поскольку это очень быстро растущая функция, то даже для небольших N
//
//    вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
//
//    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//
//    Sample Input 1:
//
//    1
//
//    Sample Output 1:
//
//    1
//
//
//    Sample Input 2:
//
//    3
//
//    Sample Output 2:
//
//    6

import java.math.BigInteger;

/**
 * @author modkomi
 * @since 14.05.2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(6));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    private static BigInteger factorial(int value) {

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
