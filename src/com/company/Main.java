package com.company;

public class Main {
    public static int calculateDeliveryDays(int distance) {
        int days = 2;
        if (60 > distance && distance >= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (100 >= distance && distance >= 60) {
            System.out.println("Потребуется дней: " + (days += 1));
        } else {
            System.out.println("Потребуется дней: " + (days -= 1));
        }
        return days;
    }

    public static int createFone(int clientOS, int yerCreate) {
        if (clientOS == 1 && yerCreate < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1 && yerCreate >= 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && yerCreate < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0 && yerCreate >= 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return clientOS;
    }

    public static int calculateYear(int Year) {
        int a = Year % 4;
        int b = Year % 100;
        int c = Year % 400;
        if (a <= 0 && c <= b) {
            System.out.println("номер года " + Year + " — высокосный год");
        } else {
            System.out.println("номер года " + Year + " — не высокосный год");
        }
        return Year;
    }

    public static void main(String[] args) {
        //zadanie 1
        int year = calculateYear(2023);
        //zadaie 2
        int foneModel = createFone(1, 2014);
        //zadanie 3
        int deliveryDays = calculateDeliveryDays(77);
    }
}
