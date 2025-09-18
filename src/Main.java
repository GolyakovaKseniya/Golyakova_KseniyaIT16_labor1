import javax.xml.validation.Validator;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x, y, l, k;
        String value;
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
            System.out.println("0 - ВЫХОД");
            System.out.print("Ваш выбор: ");
            value = scanner.next();
            switch (value)
            {
                case "1.2":
                {
                    System.out.println("Задача 1.2: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    int first = metods.sumLastNums(x);
                    System.out.println("Сумма двух последних знаков числа x - " + first);
                    break;
                }
                case "1.4":
                {
                    System.out.println("Задача 1.4: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    boolean second = metods.isPositive(x);
                    System.out.println("Ответ задачи №4 - " + second);
                    break;
                }
                case "1.6":
                {
                    System.out.println("Задача 1.6");
                    char X;
                    System.out.println("Введите символ X - ");
                    X = scanner.next().charAt(0);
                    boolean three = metods.isUpperCase(X);
                    System.out.println("Ответ задачи №6 - " + three);
                    break;
                }
                case "1.8":
                {
                    System.out.println("Задача 1.8: ");
                    int a, b;
                    System.out.println("Введите число а - ");
                    a = scanner.nextInt();
                    System.out.println("Введите число b - ");
                    b = scanner.nextInt();
                    boolean four = metods.isDivisor(a, b);
                    System.out.println("Ответ на задачу №8 " + four);
                    break;
                }
                case "1.10":
                {
                    System.out.println("Задача 1.10: ");
                    int summa = 0, number;
                    for (int i = 1; i <= 5; i++)
                    {
                        System.out.println("Введите число - ");
                        number = scanner.nextInt();
                        summa = metods.lastNumSum(summa, number);
                    }
                    System.out.println("Сумма цифр 5-ти чисел из разряда единиц равна: " + summa);
                    break;
                }
                case "2.2":
                {
                    System.out.println("Задача 2.2: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    System.out.println("Введите число y - ");
                    y = scanner.nextInt();
                    double second2 = metods.safeDiv(x, y);
                    System.out.println("Частное деления x на y равно: " + second2);
                    break;
                }
                case "2.4":
                {
                    System.out.println("Задача 2.4: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    System.out.println("Введите число y - ");
                    y = scanner.nextInt();
                    String four2 = metods.makeDecision(x, y);
                    System.out.println("Строка со знаком операции: " + four2);
                    break;
                }
                case "2.6":
                {
                    System.out.println("Задача 2.6: ");
                    int z;
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    System.out.println("Введите число y - ");
                    y = scanner.nextInt();
                    System.out.println("Введите число z - ");
                    z = scanner.nextInt();
                    boolean six = metods.sum3(x, y, z);
                    System.out.println("Результат: " + six);
                    break;
                }
                case "2.8":
                {
                    System.out.println("Задача 2.8: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    if (x > 0)
                    {
                        String eight = metods.age(x);
                        System.out.println("Результат: " + eight);
                    } else
                    {
                        System.out.println("Ошибка, введите положительно число!");
                    }
                    break;
                }
                case "2.10":
                {
                    System.out.println("Задача 2.10: ");
                    String day;
                    System.out.println("Введите день недели - ");
                    day = scanner.next();
                    System.out.println("Результат: ");
                    metods.printDay(day);
                    break;
                }
                case "3.2":
                {
                    System.out.println("Задача 3.2: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    String result = metods.reverseListNums(x);
                    System.out.println("Результат: " + result);
                    break;
                }
                case "3.4":
                {
                    System.out.println("Задача 3.4: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    System.out.println("Введите число степени y - ");
                    y = scanner.nextInt();
                    double pow = metods.pow(x, y);
                    System.out.println("Результат: " + pow);
                    break;
                }
                case "3.6":
                {
                    System.out.println("Задача 3.6: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    boolean equal = metods.equalNum(x);
                    System.out.println("Результат: " + equal);
                    break;
                }
                case "3.8":
                {
                    System.out.println("Задача 3.8: ");
                    System.out.println("Введите число x - ");
                    x = scanner.nextInt();
                    System.out.println("Результат: ");
                    metods.leftTriangle(x);
                    break;
                }
                case "3.10":
                {
                    System.out.println("Задача 3.10: ");
                    metods.guessGame();
                    break;
                }
                case "4.2":
                {
                    System.out.println("Задача 4.2: ");
                    System.out.println("Сколько хотите ввести чисел?");
                    l = scanner.nextInt();
                    int[] arr = new int[l];
                    for (int i = 0; i < l; i++)
                    {
                        System.out.println("Введите число " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Индекс последнего вхождения какого числа хотите вывести?");
                    x = scanner.nextInt();
                    int last = metods.findLast(arr, x);
                    System.out.println("Индекс последнего вхождения числа  - " + last);
                    break;
                }
                case "4.4":
                {
                    int pos;
                    System.out.println("Задача 4.4: ");
                    System.out.println("Сколько хотите ввести чисел?");
                    l = scanner.nextInt();
                    int[] arr = new int[l];
                    for (int i = 0; i < l; i++)
                    {
                        System.out.print("Введите число " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.print("Какое хотите вставить число в новый массив: ");
                    x = scanner.nextInt();
                    System.out.print("На какую позицию вы хотите его вставить: ");
                    pos = scanner.nextInt();
                    int[] add = metods.add(arr, x, pos);
                    System.out.println("Новый массив: " + Arrays.toString(add));
                    break;
                }
                case "4.6":
                {
                    System.out.println("Задача 4.6");
                    System.out.println("Сколько хотите ввести чисел?");
                    l = scanner.nextInt();
                    int[] arr = new int[l];
                    for (int i = 0; i < l; i++)
                    {
                        System.out.println("Введите число " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Измененный массив: ");
                    metods.reverse(arr);
                    break;
                }
                case "4.8":
                {
                    System.out.println("Задача 4.8");
                    System.out.println("Сколько хотите ввести чисел в 1 массив?");
                    l = scanner.nextInt();
                    int[] arr1 = new int[l];
                    for (int i = 0; i < arr1.length; i++)
                    {
                        System.out.println("Введите число " + (i + 1) + ": ");
                        arr1[i] = scanner.nextInt();
                    }
                    System.out.println("Сколько хотите ввести чисел во 2 массив?");
                    k = scanner.nextInt();
                    int[] arr2 = new int[k];
                    for (int i = 0; i < arr2.length; i++)
                    {
                        System.out.println("Введите число " + (i + 1) + ": ");
                        arr2[i] = scanner.nextInt();
                    }
                    int[] concat = metods.concat(arr1, arr2);
                    System.out.println("Новый массив: " + Arrays.toString(concat));
                    break;
                }
                case "4.10":
                {
                    System.out.println("Задача 4.10");
                    System.out.println("Сколько хотите ввести чисел: ");
                    l = scanner.nextInt();
                    int[] arr = new int[l];
                    for (int i = 0; i < l; i++)
                    {
                        System.out.println("Введите число " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    int[] arr2 = metods.deleteNegative(arr);
                    System.out.println("Новый массив: " + Arrays.toString(arr2));
                    break;
                }
                case "0":
                {
                    System.out.println("Вы вышли из программы!");
                    return;
                }
                default:
                {
                    System.out.println("Ошибка ввода, попробуйте снова!");
                    break;
                }
            }
        }
    }
}