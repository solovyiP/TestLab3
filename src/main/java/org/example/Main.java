package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earling = 0;
        int spending = 0;
        int oroshod = 0;
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить доход");
            System.out.println("2. Добавить расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена.");
                break;
            }
            int op = Integer.parseInt(input);
            switch (op) {
                case 1:
                    System.out.println("Добавьте доход");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earling += money;
                    break;
                case 2:
                    System.out.println("Введите расход");
                    String rashod = scanner.nextLine();
                    spending = Integer.parseInt(rashod);
                    oroshod = oroshod + spending;
                    break;
                case 3:
                    System.out.println("Доходы: " + earling);
                    System.out.println("Расходы: " + oroshod);
                    mainusn(earling);
                    mainusn2(earling, spending);
                    double eco = ((earling - oroshod) * 0.15) - (earling * 0.06);
                    System.out.println("Экономия: " + eco);
                    break;
            }
        }
    }

    public static double mainusn(int earling) {
        double usnd = earling * 0.06;
        System.out.println("УСН доходы: " + usnd);
        return (usnd);
    }
    public static double mainusn2(int earling, int spending) {
        double usn2 = (earling - spending) * 0.15;
        System.out.println("УСН доходы минус расходы: " + usn2);
        return (usn2);
    }

}