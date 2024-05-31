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