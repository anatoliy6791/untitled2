package ru.skypro;
public class Main {
    public static void main(String[] args) {
        int android = 1;
        int ios = 2;
        int years = 2014;
        boolean a = android == 1 && years < 2015;
        boolean i = ios == 2 && years < 2015;
        if (i || a) {
            System.out.println("Установите облегченную версию приложения для ios по ссылке                      " +
                    "Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  приложения для Android по ссылке        " + "Установите  приложения для ios по ссылке     ");
        }
        {
            int year = 2000;
            if(year % 4 == 0 &&  year % 1000 != 0)
            { System.out.println(year + " високосный");}
            else
            { System.out.println(year + " не високосный");}
        }
        {
            int distance = 61;
            int days = 1;
            if (distance <= 20){
                System.out.println("Доставка займет " + days + " сутки");}
            else if(distance > 20 && distance <=60){
                System.out.println("Доставка займет " + (days + 1) + " суток");}
            else if(distance > 60 && distance <= 100){
                System.out.println("Доставка займет " + (days + 2) + " суток");}
            else {
                System.out.println("Доставка займет " + (days + 3) + " суток");}
        }
        {

            int month = 5;
            switch (month){
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
            }
        }

    }
}

