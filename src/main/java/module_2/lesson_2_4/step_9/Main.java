package module_2.lesson_2_4.step_9;

//    Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный массив.
//
//    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//
//    Пример
//
//    На вход подаются массивы {0, 2} и {1, 3}. На выходе должен получиться массив {0, 1, 2, 3}

import java.util.Arrays;

/**
 * @author modkomi
 * @since 14.05.2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 3}, new int[]{2, 4})));
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    private static int[] mergeArrays(int[] a1, int[] a2) {

        int a1length = a1.length;
        int a2length = a2.length;

        int[] a3 = new int[a1length + a2length];

        System.arraycopy(a1, 0, a3, 0, a1length);
        System.arraycopy(a2, 0, a3, a1length, a2length);
        Arrays.sort(a3);

        return a3;
    }
}
