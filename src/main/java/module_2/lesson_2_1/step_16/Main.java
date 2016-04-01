package module_2.lesson_2_1.step_16;

//        Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
//
//        Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
//
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//
//        Sample Input:
//
//        0 1
//
//        Sample Output:
//
//        1

/**
 * @author modkomi
 * @since 31.03.2016
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(binar(flipBit(0, 1)));
    }

    public static int flipBit(int value, int bitIndex) {
        return ((1 << bitIndex - 1) ^ value); // put your implementation here
    }

    public static String binar(int a) {
        return Integer.toString(a, 2);
    }
}
