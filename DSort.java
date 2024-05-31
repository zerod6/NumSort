import java.util.Arrays;

/**
 * @brief Класс для сортировки чисел в порядке убывания.
 * @class DSort
 */
public class DSort {
    /**
     * @brief Сортирует массив чисел в порядке убывания.
     * @details Сначала массив сортируется в порядке возрастания, затем его элементы переставляются в обратном порядке.
     * @param num Массив чисел для сортировки.
     * @return void
     */
    public static void sort(int[] num) {
        Arrays.sort(num);
        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }
        NumPrint.printNum(num, "Числа в порядке убывания: ");
    }
}
