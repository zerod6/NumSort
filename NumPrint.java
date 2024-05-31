/**
 * @brief Вспомогательный класс для вывода чисел.
 * @class NumPrint
 */
public class NumPrint {
    /**
     * @brief Печатает числа с заданным сообщением.
     * @param num Массив чисел для печати.
     * @param message Сообщение, отображаемое перед числами.
     * @return void
     */
    public static void printNum(int[] num, String message) {
        System.out.print(message);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
