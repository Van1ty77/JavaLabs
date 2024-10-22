import java.util.Random;
import java.util.Scanner;

public class Uniq {

    // Метод для суммы последних двух цифр числа
    public int sumLastNums(int x) {
        int lastDigit = x % 10; // Получаем последнюю цифру
        int secondLastDigit = (x / 10) % 10; // Получаем предпоследнюю цифру
        return lastDigit + secondLastDigit; // Возвращаем сумму
    }

    // Метод для проверки, положительное ли число
    public boolean isPositive(int x) {
        return x > 0; // Возвращаем true, если число положительное
    }

    // Метод для проверки, является ли символ заглавной буквой
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z'; // Проверяем диапазон заглавных букв
    }

    // Метод для проверки, делится ли одно число на другое
    public boolean isDivisor(int a, int b) {
        return b != 0 && (a % b == 0 || b % a == 0); // Проверяем делимость
    }

    // Метод для сложения единичных разрядов двух чисел
    public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10); // Возвращаем сумму последних цифр
    }

    // Метод для строки сравнения
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    // Метод для проверки суммы трех чисел
    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x); // Проверяем сумму
    }

    // Метод для формирования строки с возрастом
    public String age(int x) {
        String ageString = x + " ";
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            ageString += "год";
        } else if ((lastDigit >= 2 && lastDigit <= 4) && (lastTwoDigits < 12 || lastTwoDigits > 14)) {
            ageString += "года";
        } else {
            ageString += "лет";
        }

        return ageString; // Возвращаем строку с возрастом
    }

    // Метод для вывода дней недели
    public void printDays(String x) {
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
    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i).append(" "); // Добавляем числа в строку
        }
        return result.toString().trim(); // Возвращаем строку
    }

    // Метод для возведения числа в степень
    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x; // Умножаем x на себя y раз
        }
        return result; // Возвращаем результат
    }

    // Метод для проверки, все ли цифры числа одинаковы
    public boolean equalNum(int x) {
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
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Выводим звёздочки
            }
            System.out.println(); // Переход на новую строку
        }
    }

    // Метод для игры "Угадайка"
    public void guessGame() {
        Random random = new Random();
        int numberToGuess = random.nextInt(10); // Генерируем случайное число от 0 до 9
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int userGuess;

        do {
            System.out.print("Введите число от 0 до 9: ");
            userGuess = scanner.nextInt(); // Считываем число
            attempts++; // Увеличиваем счетчик попыток

            if (userGuess == numberToGuess) {
                System.out.println("Вы угадали!"); // Угадали
            } else {
                System.out.println("Вы не угадали, попробуйте снова."); // Не угадали
            }
        } while (userGuess != numberToGuess);

        System.out.println("Вы отгадали число за " + attempts + " попытки(ок)."); // Выводим количество попыток
    }

    // Метод для поиска последнего вхождения числа в массив
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i; // Возвращаем индекс последнего вхождения
            }
        }
        return -1; // Если не найдено, возвращаем -1
    }

    // Метод для добавления элемента в массив по заданной позиции
    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1]; // Создаем новый массив на 1 элемент больше
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos) {
                newArr[i] = arr[i]; // Копируем элементы до позиции
            } else if (i == pos) {
                newArr[i] = x; // Вставляем новый элемент
            } else {
                newArr[i] = arr[i - 1]; // Копируем остальные элементы
            }
        }
        return newArr; // Возвращаем новый массив
    }

    // Метод для реверсирования массива
    public void reverse(int[] arr) {
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
    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length]; // Создаем новый массив
        // Копируем элементы первого массива
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        // Копируем элементы второго массива
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr; // Возвращаем новый объединенный массив
    }

    // Метод для удаления отрицательных чисел из массива
    public int[] deleteNegative(int[] arr) {
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
            System.out.println("6. Сравнение чисел");
            System.out.println("7. Проверка суммы трех чисел");
            System.out.println("8. Возраст");
            System.out.println("9. Вывод дней недели");
            System.out.println("10. Числа наоборот");
            System.out.println("11. Степень числа");
            System.out.println("12. Одинаковость цифр");
            System.out.println("13. Левый треугольник");
            System.out.println("14. Угадайка");
            System.out.println("15. Поиск последнего значения в массиве");
            System.out.println("16. Добавление в массив");
            System.out.println("17. Реверс массива");
            System.out.println("18. Объединение массивов");
            System.out.println("19. Удалить негатив");
            System.out.println("0. Выход");
            System.out.print("Введите номер задачи: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> { // Сумма последних двух цифр
                    System.out.print("Введите число: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Сумма последних двух цифр: " + solver.sumLastNums(num1));
                }
                case 2 -> { // Положительное число
                    System.out.print("Введите число: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Положительное: " + solver.isPositive(num2));
                }
                case 3 -> { // Большая буква
                    System.out.print("Введите символ: ");
                    char charInput = scanner.next().charAt(0);
                    System.out.println("Большая буква: " + solver.isUpperCase(charInput));
                }
                case 4 -> { // Делитель
                    System.out.print("Введите два числа (a b): ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Делитель: " + solver.isDivisor(a, b));
                }
                case 5 -> { // Сумма разрядов
                    System.out.print("Введите два числа (a b): ");
                    int a1 = scanner.nextInt();
                    int b1 = scanner.nextInt();
                    System.out.println("Сумма разрядов: " + solver.lastNumSum(a1, b1));
                }
                case 6 -> { // Сравнение чисел
                    System.out.print("Введите два числа (x y): ");
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    System.out.println("Сравнение: " + solver.makeDecision(x1, y1));
                }
                case 7 -> { // Проверка суммы трех чисел
                    System.out.print("Введите три числа (x y z): ");
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    int z2 = scanner.nextInt();
                    System.out.println("Сумма трех чисел: " + solver.sum3(x2, y2, z2));
                }
                case 8 -> { // Возраст
                    System.out.print("Введите возраст: ");
                    int ageInput = scanner.nextInt();
                    System.out.println("Возраст: " + solver.age(ageInput));
                }
                case 9 -> { // Вывод дней недели
                    System.out.print("Введите день недели: ");
                    String day = scanner.next();
                    solver.printDays(day);
                }
                case 10 -> { // Числа наоборот
                    System.out.print("Введите число: ");
                    int numReverse = scanner.nextInt();
                    System.out.println("Числа наоборот: " + solver.reverseListNums(numReverse));
                }
                case 11 -> { // Степень числа
                    System.out.print("Введите число (x) и степень (y): ");
                    int x3 = scanner.nextInt();
                    int y3 = scanner.nextInt();
                    System.out.println("Результат: " + solver.pow(x3, y3));
                }
                case 12 -> { // Одинаковость цифр
                    System.out.print("Введите число: ");
                    int numEqual = scanner.nextInt();
                    System.out.println("Одинаковость: " + solver.equalNum(numEqual));
                }
                case 13 -> { // Левый треугольник
                    System.out.print("Введите высоту треугольника: ");
                    int h = scanner.nextInt();
                    System.out.println("Левый треугольник: ");
                    solver.leftTriangle(h);
                }
                case 14 -> { // Угадайка
                    System.out.println("Игра 'Угадайка': ");
                    solver.guessGame();
                }
                case 15 -> { // Поиск последнего значения в массиве
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    int[] arrFind = new int[size];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < size; i++) {
                        arrFind[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска: ");
                    int searchNum = scanner.nextInt();
                    System.out.println("Последнее вхождение: " + solver.findLast(arrFind, searchNum));
                }
                case 16 -> { // Добавление в массив
                    System.out.print("Введите размер массива: ");
                    int arrSize = scanner.nextInt();
                    int[] arrAdd = new int[arrSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < arrSize; i++) {
                        arrAdd[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для добавления: ");
                    int addNum = scanner.nextInt();
                    System.out.print("Введите позицию для добавления: ");
                    int pos = scanner.nextInt();
                    int[] newArr = solver.add(arrAdd, addNum, pos);
                    System.out.print("Массив после добавления: ");
                    for (int num : newArr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 17 -> { // Реверс массива
                    System.out.print("Введите размер массива: ");
                    int revSize = scanner.nextInt();
                    int[] arrRev = new int[revSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < revSize; i++) {
                        arrRev[i] = scanner.nextInt();
                    }
                    solver.reverse(arrRev);
                    System.out.print("Реверсированный массив: ");
                    for (int num : arrRev) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 18 -> { // Объединение массивов
                    System.out.print("Введите размер первого массива: ");
                    int size1 = scanner.nextInt();
                    int[] arr1 = new int[size1];
                    System.out.print("Введите элементы первого массива: ");
                    for (int i = 0; i < size1; i++) {
                        arr1[i] = scanner.nextInt();
                    }
                    System.out.print("Введите размер второго массива: ");
                    int size2 = scanner.nextInt();
                    int[] arr2 = new int[size2];
                    System.out.print("Введите элементы второго массива: ");
                    for (int i = 0; i < size2; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    int[] concatenated = solver.concat(arr1, arr2);
                    System.out.print("Объединенный массив: ");
                    for (int num : concatenated) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                case 19 -> { // Удалить негатив
                    System.out.print("Введите размер массива: ");
                    int negSize = scanner.nextInt();
                    int[] arrNeg = new int[negSize];
                    System.out.print("Введите элементы массива: ");
                    for (int i = 0; i < negSize; i++) {
                        arrNeg[i] = scanner.nextInt();
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
