import java.util.Random;
import java.util.Scanner;

public class Uniq {

    // Метод для суммы последних двух цифр числа
    private int sumLastNums(int x) {
        int twoLastDigits = x % 100; // Получаем последние 2 цифры
        return twoLastDigits % 10 + (twoLastDigits / 10) % 10; // Возвращаем сумму
    }

    // Метод для проверки, положительное ли число
    private boolean isPositive(int x) {
        return x > 0; // Возвращаем true, если число положительное
    }

    // Метод для проверки, является ли символ заглавной буквой
    private boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z'; // Проверяем диапазон заглавных букв
    }

    // Метод для проверки, делится ли одно число на другое
    private boolean isDivisor(int a, int b) {
        return b != 0 && (a % b == 0 || b % a == 0); // Проверяем делимость
    }

    // Метод для сложения единичных разрядов двух чисел
    private int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10); // Возвращаем сумму последних цифр
    }

    // Метод безопасного деления
    private double safeDiv(int x, int y) {
        if (y == 0) {
            return 0; // Возвращаем 0, если деление на ноль
        }
        return (double) x / y; // Возвращаем результат деления
    }

    // Метод для строки сравнения
    private String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    // Метод для проверки суммы трех чисел
    private boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x); // Проверяем сумму
    }

    // Метод для формирования строки с возрастом
    private String age(int x) {
        String age = x + " ";
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            age += "год";
        } else if ((lastDigit >= 2 && lastDigit <= 4) && (lastTwoDigits < 12 || lastTwoDigits > 14)) {
            age += "года";
        } else {
            age += "лет";
        }

        return age; // Возвращаем строку с возрастом
    }

    // Метод для вывода дней недели
    private void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник" ->
                    System.out.println("понедельник\nвторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье");
            case "вторник" -> System.out.println("вторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье");
            case "среда" -> System.out.println("среда\nчетверг\nпятница\nсуббота\nвоскресенье");
            case "четверг" -> System.out.println("четверг\nпятница\nсуббота\nвоскресенье");
            case "пятница" -> System.out.println("пятница\nсуббота\nвоскресенье");
            case "суббота" -> System.out.println("суббота\nвоскресенье");
            case "воскресенье" -> System.out.println("воскресенье");
            default -> System.out.println("это не день недели");
        }
    }

    // Метод для вывода чисел от x до 0
    private String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();

        if (x >= 0) {
            // Для положительных чисел выполняем обычное обратное перечисление
            for (int i = x; i >= 0; i--) {
                result.append(i).append(" ");
            }
        } else {
            // Для отрицательных чисел начинаем с x и идем до 0
            for (int i = x; i <= 0; i++) {
                result.append(i).append(" ");
            }
        }

        return result.toString().trim(); // Возвращаем строку без лишнего пробела в конце
    }


    // Метод для возведения числа в степень
    private int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x; // Умножаем x на себя y раз
        }
        return result; // Возвращаем результат
    }

    // Метод для проверки, все ли цифры числа одинаковы
    private boolean equalNum(int x) {
        int firstDigit = x % 10; // Получаем первую цифру
        while (x > 0) {
            if (x % 10 != firstDigit) {
                return false; // Если есть отличия, возвращаем false
            }
            x /= 10; // Убираем последнюю цифру
        }
        return true; // Все цифры одинаковы
    }

    // Метод для вывода левого треугольника
    private void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Выводим звёздочки
            }
            System.out.println(); // Переход на новую строку
        }
    }

    // Метод для игры "Угадайка"
    private void guessGame() {
        Random random = new Random();
        int numberToGuess = random.nextInt(10); // Генерируем случайное число от 0 до 9
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int userGuess; // Инициализация переменной для хранения числа пользователя

        do {
            System.out.print("Введите число от 0 до 9: ");

            // Используем метод inputInt для проверки ввода
            userGuess = inputInt(scanner);
            attempts++; // Увеличиваем счетчик попыток

            if (userGuess == numberToGuess) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали, попробуйте снова.");
            }

        } while (userGuess != numberToGuess);

        System.out.println("Вы отгадали число за " + attempts + " попытки(ок).");
    }

    // Метод для поиска последнего вхождения числа в массив
    private int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i; // Возвращаем индекс последнего вхождения
            }
        }
        return -1; // Если не найдено, возвращаем -1
    }

    // Метод для добавления элемента в массив по заданной позиции
    private int[] add(int[] arr, int x, int pos) {
        // Проверка, чтобы не выйти за пределы массива
        if (pos < 0 || pos > arr.length) {
            System.out.println("Позиция вне границ массива.");
            return null; // Возвращаем null в случае ошибки
        }

        // Создаем новый массив на 1 элемент больше
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) {
                newArr[i] = arr[i]; // Копируем элементы до позиции
            } else if (i == pos) {
                newArr[i] = x; // Вставляем новый элемент на указанную позицию
            } else {
                newArr[i] = arr[i - 1]; // Копируем оставшиеся элементы
            }
        }

        return newArr; // Возвращаем новый массив
    }


    // Метод для реверсирования массива
    private void reverse(int[] arr) {
        int left = 0; // Индекс начала
        int right = arr.length - 1; // Индекс конца
        while (left < right) { // Пока индексы не пересеклись
            // Меняем местами элементы
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++; // Увеличиваем левый индекс
            right--; // Уменьшаем правый индекс
        }
    }

    // Метод для объединения двух массивов
    private int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length]; // Создаем новый массив
        // Копируем элементы первого массива
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        // Копируем элементы второго массива
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr; // Возвращаем новый объединенный массив
    }

    // Метод для удаления отрицательных чисел из массива
    private int[] deleteNegative(int[] arr) {
        // Сначала считаем количество неотрицательных чисел
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        // Создаем новый массив для хранения неотрицательных чисел
        int[] newArr = new int[count];
        int index = 0;

        // Заполняем новый массив неотрицательными числами
        for (int num : arr) {
            if (num >= 0) {
                newArr[index++] = num;
            }
        }

        return newArr; // Возвращаем новый массив без отрицательных чисел
    }

    // Метод для проверки ввода числа
    private int inputInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Пожалуйста, введите целое число.");
            scanner.next(); // Очищаем некорректный ввод
        }
        return scanner.nextInt();
    }

    // Метод для проверки ввода размера массива
    private int inputArraySize(Scanner scanner) {
        int size;
        do {
            System.out.print("Введите размер массива (положительное число): ");
            size = inputInt(scanner); // Используем метод для проверки ввода числа
            if (size <= 0) {
                System.out.println("Размер массива должен быть больше 0.");
            }
        } while (size <= 0);
        return size;
    }

    // Основной метод для запуска программы
    public static void main(String[] args) {
        Uniq solver = new Uniq();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задачу:");
            System.out.println("1. Сумма последних двух цифр");
            System.out.println("2. Положительное число");
            System.out.println("3. Большая буква");
            System.out.println("4. Делитель");
            System.out.println("5. Сумма разрядов");
            System.out.println("6. Безопасное деление");
            System.out.println("7. Сравнение чисел");
            System.out.println("8. Проверка суммы трех чисел");
            System.out.println("9. Возраст");
            System.out.println("10. Вывод дней недели");
            System.out.println("11. Числа наоборот");
            System.out.println("12. Степень числа");
            System.out.println("13. Одинаковость цифр");
            System.out.println("14. Левый треугольник");
            System.out.println("15. Угадайка");
            System.out.println("16. Поиск последнего значения в массиве");
            System.out.println("17. Добавление в массив");
            System.out.println("18. Реверс массива");
            System.out.println("19. Объединение массивов");
            System.out.println("20. Удалить негатив");
            System.out.println("0. Выход");
            System.out.print("Введите номер задачи: ");
            int choice = solver.inputInt(scanner);

            switch (choice) {
                case 1 -> {
                    int num;
                    do {
                        System.out.println("Введите число (не менее двух цифр):");
                        num = solver.inputInt(scanner);
                        if (num < 10) {
                            System.out.println("Число должно быть положительным и иметь минимум 2 цифры.");
                        }
                    } while (num < 10);
                    int result = solver.sumLastNums(num);
                    System.out.println("Сумма двух последних цифр: " + result);
                }
                case 2 -> {
                    System.out.print("Введите число: ");
                    int num2 = solver.inputInt(scanner);
                    System.out.println("Положительное: " + solver.isPositive(num2));
                }
                case 3 -> {
                    System.out.print("Введите латинскую заглавную букву: ");
                    String input = scanner.next();  // Считываем строку
                    while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {  // Проверяем, что введен 1 символ и это буква
                        System.out.println("Пожалуйста, введите один символ, который является латинской буквой.");
                        input = scanner.next();  // Повторный ввод
                    }
                    char charInput = input.charAt(0);  // Получаем символ
                    System.out.println("Большая буква: " + solver.isUpperCase(charInput));
                }
                case 4 -> {
                    System.out.print("Введите два числа (a b): ");
                    int a = solver.inputInt(scanner);
                    int b = solver.inputInt(scanner);
                    System.out.println("Делитель: " + solver.isDivisor(a, b));
                }
                case 5 -> { // Сумма разрядов
                    int result;  // Начальное значение для последовательной суммы
                    int nextNumber;

                    // Запрашиваем первое число
                    System.out.print("Введите первое число: ");
                    result = solver.inputInt(scanner);

                    // Последовательно запрашиваем следующие 4 числа и суммируем с предыдущим результатом
                    for (int i = 1; i < 5; i++) {
                        System.out.print("Введите следующее число: ");
                        nextNumber = solver.inputInt(scanner);
                        result = solver.lastNumSum(result, nextNumber);  // Считаем сумму последних цифр и обновляем результат
                        System.out.println("Промежуточный результат после сложения " + i + "-го числа: " + result);
                    }

                    System.out.println("Результат последовательного сложения: " + result);
                }
                case 6 -> {
                    System.out.println("Введите первое число (x):");
                    int x = solver.inputInt(scanner);
                    System.out.println("Введите второе число (y):");
                    int y = solver.inputInt(scanner);
                    System.out.println("Результат безопасного деления: " + solver.safeDiv(x, y));
                }
                case 7 -> {
                    System.out.print("Введите два числа (x y): ");
                    int x1 = solver.inputInt(scanner);
                    int y1 = solver.inputInt(scanner);
                    System.out.println("Сравнение: " + solver.makeDecision(x1, y1));
                }
                case 8 -> {
                    System.out.print("Введите три числа (x y z): ");
                    int x2 = solver.inputInt(scanner);
                    int y2 = solver.inputInt(scanner);
                    int z2 = solver.inputInt(scanner);
                    System.out.println("Сумма трех чисел: " + solver.sum3(x2, y2, z2));
                }
                case 9 -> {
                    System.out.print("Введите возраст: ");
                    int ageInput = solver.inputInt(scanner);
                    System.out.println("Возраст: " + solver.age(ageInput));
                }
                case 10 -> {
                    System.out.print("Введите день недели: ");
                    String day = scanner.next();
                    solver.printDays(day);
                }
                case 11 -> {
                    System.out.print("Введите число: ");
                    int numReverse = solver.inputInt(scanner);
                    System.out.println("Числа наоборот: " + solver.reverseListNums(numReverse));
                }
                case 12 -> {
                    System.out.print("Введите число (x) и степень (y): ");
                    int x3 = solver.inputInt(scanner);
                    int y3 = solver.inputInt(scanner);
                    System.out.println("Результат: " + solver.pow(x3, y3));
                }
                case 13 -> {
                    System.out.print("Введите число: ");
                    int numEqual = solver.inputInt(scanner);
                    System.out.println("Одинаковость: " + solver.equalNum(numEqual));
                }
                case 14 -> {
                    System.out.print("Введите высоту треугольника: ");
                    int h = solver.inputInt(scanner);
                    System.out.println("Левый треугольник: ");
                    solver.leftTriangle(h);
                }
                case 15 -> {
                    System.out.println("Игра 'Угадайка': ");
                    solver.guessGame();
                }
                case 16 -> {
                    int arrSize = solver.inputArraySize(scanner);
                    int[] arrFind = new int[arrSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < arrSize; i++) {
                        arrFind[i] = solver.inputInt(scanner);
                    }
                    System.out.print("Введите число для поиска: ");
                    int searchNum = solver.inputInt(scanner);
                    System.out.println("Последнее вхождение: " + solver.findLast(arrFind, searchNum));
                }
                case 17 -> {
                    int arrSize = solver.inputArraySize(scanner);
                    int[] arrAdd = new int[arrSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < arrSize; i++) {
                        arrAdd[i] = solver.inputInt(scanner);
                    }
                    System.out.print("Введите число для добавления: ");
                    int addNum = solver.inputInt(scanner);
                    System.out.print("Введите позицию для добавления: ");
                    int pos = solver.inputInt(scanner);
                    int[] newArr = solver.add(arrAdd, addNum, pos);
                    // Проверка на null перед выводом массива
                    if (newArr != null) {
                        System.out.print("Массив после добавления: ");
                        for (int num : newArr) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                }
                case 18 -> {
                    int revSize = solver.inputArraySize(scanner);
                    int[] arrRev = new int[revSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < revSize; i++) {
                        arrRev[i] = solver.inputInt(scanner);
                    }
                    solver.reverse(arrRev);
                    System.out.print("Массив наоборот: ");
                    for (int num : arrRev) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 19 -> {
                    int size1 = solver.inputArraySize(scanner);
                    int[] arr1 = new int[size1];
                    System.out.print("Введите элементы первого массива: ");
                    for (int i = 0; i < size1; i++) {
                        arr1[i] = solver.inputInt(scanner);
                    }
                    int size2 = solver.inputArraySize(scanner);
                    int[] arr2 = new int[size2];
                    System.out.print("Введите элементы второго массива: ");
                    for (int i = 0; i < size2; i++) {
                        arr2[i] = solver.inputInt(scanner);
                    }
                    int[] concatenated = solver.concat(arr1, arr2);
                    System.out.print("Объединенный массив: ");
                    for (int num : concatenated) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 20 -> {
                    int arrSize = solver.inputArraySize(scanner);
                    int[] arrNeg = new int[arrSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < arrSize; i++) {
                        arrNeg[i] = solver.inputInt(scanner);
                    }
                    int[] positiveArr = solver.deleteNegative(arrNeg);
                    System.out.print("Массив без отрицательных чисел: ");
                    for (int num : positiveArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 0 -> { // Выход
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}
