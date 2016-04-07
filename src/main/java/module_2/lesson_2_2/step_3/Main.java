package module_2.lesson_2_2.step_3;

//        Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a:
//
//        В качестве примера написано заведомо неправильное выражение. Исправьте его.
//
//        Sample Input 1:
//
//        15
//
//        Sample Output 1:
//
//        k
//
//
//        Sample Input 2:
//
//        8
//
//        Sample Output 2:
//
//        d


/**
 * @author modkomi
 * @since 01.04.2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(charExpression(15));
    }

    public static char charExpression(int a) {
        return (char) ('\\' +  a);
    }

}
