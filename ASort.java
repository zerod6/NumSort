import java.util.Arrays;

/**
 * @brief Класс для сортировки чисел в порядке возрастания.
 * @class ASort
 */
public class ASort {
    /**
     * @brief Сортирует массив чисел в порядке возрастания.
     * @param num Массив чисел для сортировки.
     * @return void
     */
    public static void sort(int[] num) {
        Arrays.sort(num);
        NumPrint.printNum(num, "Числа в порядке возрастания: ");
    }
}
