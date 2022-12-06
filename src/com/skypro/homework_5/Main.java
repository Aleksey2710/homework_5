package com.skypro.homework_5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой версии не существует");
        }


    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;


        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 0;

        if (deliveryDistance <= 20) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay=deliveryDay+2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay=deliveryDay+3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }




    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к зимнему сезону.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к весеннему сезону.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к летнему сезону.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к осеннему сезону.");
                break;
            default:
                System.out.println("Такого месяца не бывает.");
        }

    }
}
