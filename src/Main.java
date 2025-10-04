import javax.xml.validation.Validator;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x, y, mass, count;
        String value ;
        Scanner scanner = new Scanner(System.in);
        Metods metods = new Metods();
        while (true) {
            System.out.println();
            System.out.println("Выберете задачу: ");
            System.out.println("Задача 1.2");
            System.out.println("Задача 1.4");
            System.out.println("Задача 1.6");
            System.out.println("Задача 1.8");
            System.out.println("Задача 1.10");
            System.out.println("Задача 2.2");
            System.out.println("Задача 2.4");
            System.out.println("Задача 2.6");
            System.out.println("Задача 2.8");
            System.out.println("Задача 2.10");
            System.out.println("Задача 3.2");
            System.out.println("Задача 3.4");
            System.out.println("Задача 3.6");
            System.out.println("Задача 3.8");
            System.out.println("Задача 3.10");
            System.out.println("Задача 4.2");
            System.out.println("Задача 4.4");
            System.out.println("Задача 4.6");
            System.out.println("Задача 4.8");
            System.out.println("Задача 4.10");
            System.out.println("0 - выход");
            System.out.print("Ваш выбор: ");
            value = scanner.next();
            switch (value) {
                case "1.2": {
                    System.out.println("Задача 1.2: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    x = Math.abs(x);
                    int first = metods.sumLastNums(x);
                    System.out.println("Сумма двух последних знаков числа x:  " + first);
                    break;
                }
                case "1.4": {
                    System.out.println("Задача 1.4: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    boolean second = metods.isPositive(x);
                    System.out.println("Ответ задачи №4: " + second);
                    break;
                }
                case "1.6": {
                    System.out.println("Задача 1.6");
                    char X;
                    System.out.print("Введите символ X: ");
                    X = scanner.next().charAt(0);
                    boolean three = metods.isUpperCase(X);
                    System.out.println("Ответ задачи №6 - " + three);
                    break;
                }
                case "1.8": {
                    System.out.println("Задача 1.8: ");
                    int a, b;
                    System.out.print("Введите число а: ");
                    a = getInput(scanner);
                    System.out.print("Введите число b: ");
                    b = getInput(scanner);
                    boolean four = metods.isDivisor(a, b);
                    System.out.println("Ответ на задачу №8 " + four);
                    break;
                }
                case "1.10": {
                    System.out.println("Задача 1.10: ");
                    int summa = 0, number;
                    System.out.println("Введите 5 чисел: ");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Введите число: ");
                        number = getInput(scanner);
                        summa = metods.lastNumSum(summa, number);
                    }
                    System.out.println("Сумма цифр 5-ти чисел из разряда единиц равна: " + summa);
                    break;
                }
                case "2.2": {
                    System.out.println("Задача 2.2: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    System.out.print("Введите число y: ");
                    y = getInput(scanner);
                    double second2 = metods.safeDiv(x, y);
                    System.out.println("Частное деления x на y равно: " + second2);
                    break;
                }
                case "2.4": {
                    System.out.println("Задача 2.4: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    System.out.print("Введите число y: ");
                    y = getInput(scanner);
                    String four2 = metods.makeDecision(x, y);
                    System.out.println("Строка со знаком операции: " + four2);
                    break;
                }
                case "2.6": {
                    System.out.println("Задача 2.6: ");
                    int z;
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    System.out.print("Введите число y: ");
                    y = getInput(scanner);
                    System.out.print("Введите число z: ");
                    z = getInput(scanner);
                    boolean six = metods.sum3(x, y, z);
                    System.out.println("Результат: " + six);
                    break;
                }
                case "2.8": {
                    System.out.println("Задача 2.8: ");
                    System.out.print("Введите число x: ");
                    x = test(scanner);
                    String eight = metods.age(x);
                    System.out.println("Результат: " + eight);
                    break;
                }
                case "2.10": {
                    System.out.println("Задача 2.10: ");
                    String day;
                    System.out.print("Введите день недели: ");
                    day = scanner.next();
                    System.out.println("Результат: ");
                    metods.printDay(day);
                    break;
                }
                case "3.2": {
                    System.out.println("Задача 3.2: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    String result = metods.reverseListNums(x);
                    System.out.println("Результат: " + result);
                    break;
                }
                case "3.4": {
                    System.out.println("Задача 3.4: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    System.out.print("Введите число степени y: ");
                    y = getInput(scanner);
                    double pow = metods.pow(x, y);
                    System.out.println("Результат: " + pow);
                    break;
                }
                case "3.6": {
                    System.out.println("Задача 3.6: ");
                    System.out.print("Введите число x: ");
                    x = getInput(scanner);
                    x = Math.abs(x);
                    boolean equal = metods.equalNum(x);
                    System.out.println("Результат: " + equal);
                    break;
                }
                case "3.8": {
                    System.out.println("Задача 3.8: ");
                    System.out.print("Введите число x: ");
                    x = test(scanner);
                    System.out.println("Результат: ");
                    metods.leftTriangle(x);
                    break;
                }
                case "3.10": {
                    System.out.println("Задача 3.10: ");
                    metods.guessGame();
                    break;
                }
                case "4.2": {
                    System.out.println("Задача 4.2: ");
                    System.out.print("Сколько хотите ввести чисел: ");
                    mass = test(scanner);
                    int[] arr = new int[mass];
                    for (int i = 0; i < mass; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr[i] = getInput(scanner);
                    }
                    System.out.print("Индекс последнего вхождения какого числа хотите вывести: ");
                    x = getInput(scanner);
                    int last = metods.findLast(arr, x);
                    System.out.println("Индекс последнего вхождения числа  - " + last);
                    break;
                }
                case "4.4": {
                    int pos;
                    System.out.println("Задача 4.4: ");
                    System.out.print("Сколько хотите ввести чисел: ");
                    mass = test(scanner);
                    int[] arr = new int[mass];
                    for (int i = 0; i < mass; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr[i] = getInput(scanner);
                    }
                    System.out.print("Какое хотите вставить число в новый массив: ");
                    x = getInput(scanner);
                    System.out.print("На какую позицию вы хотите его вставить: ");
                    pos = test(scanner);
                    int[] add = metods.add(arr, x, pos);
                    System.out.print("Новый массив: ");
                    for(int i = 0; i<add.length; i++) {
                        System.out.print(add[i] + " ");
                    }
                    System.out.println();
                    break;
                }
                case "4.6": {
                    System.out.println("Задача 4.6");
                    System.out.print("Сколько хотите ввести чисел: ");
                    mass = test(scanner);
                    int[] arr = new int[mass];
                    for (int i = 0; i < mass; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr[i] = getInput(scanner);
                    }
                    System.out.print("Измененный массив: ");
                    metods.reverse(arr);
                    System.out.println();
                    break;
                }
                case "4.8": {
                    System.out.println("Задача 4.8");
                    System.out.print("Сколько хотите ввести чисел в 1 массив: ");
                    mass = test(scanner);
                    int[] arr1 = new int[mass];
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr1[i] = getInput(scanner);
                    }
                    System.out.print("Сколько хотите ввести чисел во 2 массив: ");
                    count = test(scanner);
                    int[] arr2 = new int[count];
                    for (int i = 0; i < arr2.length; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr2[i] = getInput(scanner);
                    }
                    int[] concat = metods.concat(arr1, arr2);
                    System.out.print("Новый массив: ");
                    for(int i = 0; i<concat.length; i++) {
                        System.out.print(concat[i] + " ");
                    }
                    System.out.println();
                    break;
                }
                case "4.10": {
                    System.out.println("Задача 4.10");
                    System.out.print("Сколько хотите ввести чисел: ");
                    mass = test(scanner);
                    int[] arr = new int[mass];
                    for (int i = 0; i < mass; i++) {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr[i] = getInput(scanner);
                    }
                    int[] arr2 = metods.deleteNegative(arr);
                    System.out.print("Новый массив: ");
                    for(int i = 0; i<arr2.length; i++) {
                        System.out.print(arr2[i] + " ");
                    }
                    System.out.println();
                    break;
                }
                case "0": {
                    System.out.println("Вы вышли из программы!");
                    return;
                }
                default: {
                    System.out.println("Ошибка ввода, попробуйте снова!");
                    break;
                }
            }
        }
    }
    private static int test(Scanner scanner) {
        int number;
        while(true) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if(number > 0) {
                    return number;
                } else {
                    System.out.println("Ошибка, нужно ввести положительное число!");
                }
            } else {
                System.out.println("Ошибка, нужно ввести целое число!");
                scanner.next();
            }
        }
    }
    private static int getInput(Scanner scanner) {
        int number;
        while(true) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                return number;
            } else {
                System.out.println("Ошибка, введите целое число!");
                scanner.next();
            }
        }
    }

}