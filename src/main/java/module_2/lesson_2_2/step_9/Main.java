package module_2.lesson_2_2.step_9;

//        Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
//
//        Если для решения задачи вам требуются циклы или условные операторы, то можете вернуться к ней после просмотра соответствующих уроков. Хотя решить можно и без них.
//
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//
//        Sample Input 1:
//
//        0
//
//        Sample Output 1:
//
//        false
//
//
//        Sample Input 2:
//
//        1
//
//        Sample Output 2:
//
//        true
//
//
//        Sample Input 3:
//
//        -2
//
//        Sample Output 3:
//
//        true

/**
 * @author modkomi
 * @since 07.04.2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return value != 0  && (Math.abs(value) & (Math.abs(value) - 1)) == 0;
    }
}
