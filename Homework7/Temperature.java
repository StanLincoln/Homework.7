package Homework7;

//        Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов,
//        а температура второй колбы меньше 100 градусов.
//        Вы должны написать метод, который проверяет это устройство.
//        Ваша программа должна иметь переменные temperature1 и temperature2.
//        В результате метод возвращает true или false.

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Температура первой колбы: ");
        int temperature1 = scanner.nextInt();
        System.out.print("Температура второй колбы: ");
        int temperature2 = scanner.nextInt();

        if (itWorks(temperature1, temperature2)) System.out.println("Устройство работает верно.");
        else System.out.println("Некоректная работа устройства.");

    }

    public static boolean itWorks(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100 ? true : false;
    }
}
