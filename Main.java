import java.util.Scanner;
import java.util.Arrays;

/**
        * @brief Главный класс для выполнения сортировки чисел и отображения результата.
        * @class Main
 */
public class Main {
    /**
            * @brief Основной метод, который запускает программу.
            * @details Этот метод запрашивает ввод у пользователя, считывает числа, сортирует их в порядке возрастания и убывания, и выводит результаты вместе с именем разработчика.
     * @param args Аргументы командной строки.
            * @return void
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] num = new int[n];
        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        DSort.sort(num);
        ASort.sort(num);
        System.out.println("ФИО разработчика: Корнилова Анна Вячеславовна");
    }
}

/**
        * @brief Вспомогательный класс для вывода чисел.
        * @class NumPrint
 */
class NumPrint {
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

/**
        * @brief Класс для сортировки чисел в порядке убывания.
        * @class DSort
 */
class DSort {
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

/**
        * @brief Класс для сортировки чисел в порядке возрастания.
        * @class ASort
 */
class ASort {
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