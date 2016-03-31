package module_2.lesson_2_1.step_12;

//        Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
//        Погрешность вычислений – 0.0001 (1E-4)
//
//        В качестве примера написано заведомо неправильное выражение. Исправьте его.
//
//        Sample Input:
//
//        0.1 0.2 0.3
//
//        Sample Output:
//
//        true


/**
 * @author modkomi
 * @since 30.03.2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) < 1E-4;
    }
}
