package module_2.lesson_2_3.step_10;

//    Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
//
//    Если в вашем решении требуются циклы и условные операторы, можете вернуться к этой задаче после просмотра соответствующего урока. Но решить можно и без них.
//
//    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//
//    Sample Input:
//
//    Madam, I'm Adam!
//
//    Sample Output:
//
//    true

/**
 * @author modkomi
 * @since 14.05.2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
        System.out.println(isPalindrome("Аргентина манит негра"));
        System.out.println(isPalindrome("Я иду с мечем судия"));
        System.out.println(isPalindrome("1234554321"));
    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    private static boolean isPalindrome(String text) {
        // deleted other symbols
        text = text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");

        char[] textChars = text.toCharArray();
        StringBuilder result = new StringBuilder();
        StringBuilder resultRevert = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < textChars.length; i++) {
            if (i < textChars.length / 2) {
                result.append(textChars[i]);
            } else {
                if (textChars.length % 2 != 0 && !flag) {
                    flag = true;
                    continue;
                }
                resultRevert.append(textChars[i]);
            }
        }

        return result.toString().equals(resultRevert.reverse().toString()); // your implementation here
    }
}
