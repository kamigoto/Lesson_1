package ru.kamiliashaikhieva;

import java.util.Locale;
import java.util.Scanner;

/* описание программы: программа продуктового автомата
@autor Камиля Шайхиева

*/

public class Automat {
    public static void main(String[] args) {
        byte max = 3;
        byte min = 1;

        String[] products = {"Sok", "Voda", "Kola"};
        int[] prices = {50, 25, 100};
        int[] countOfProductType = {20, 10, 5};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Spisok produktov:");
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + "-" + products[i] + "/" + prices[i] + "rub");
            }
            System.out.println("Vvedite nomer tovara:");

            byte number = scanner.nextByte();
            if (countOfProductType[number - 1] > 0) {
                if (number >= min && number <= max) {
                    if (countOfProductType[number - 1] >= 1) {
                        System.out.println("Vami vybran tovar:" + products[number - 1] + " - " + prices[number - 1] + " rub");
                        System.out.println("Dostupnoye kolichestvo vybrannogo tovara:" + countOfProductType[number - 1]);
                        System.out.println("Vyberite kolichestvo dlya pokupki");


                        int count = scanner.nextInt();

                        if (countOfProductType[number - 1] > 0) {
                            if (count <= countOfProductType[number - 1]) {
                                System.out.println("Vnesite dengi, summa:" + (prices[number - 1] * count) + " rub");
                                int money = scanner.nextInt();
                                if (money >= (prices[number - 1] * count)) {
                                    System.out.println("Spasibo za pokupku!");
                                    System.out.println("Vasha sdacha:" + (money - (prices[number - 1]) * count));


                                    countOfProductType[number - 1] = countOfProductType[number - 1] - count;

                                } else System.out.println("Nedostatochno sredstv. Vozvrat sredstv : " + money + " rub");
                            } else {
                                System.out.println("Vyberite kolichestvo tovara ne bolee " + countOfProductType[number - 1]);
                            }
                        }
                    } else {
                        System.out.println("Vybrannogo tovara net v nalichii");
                        System.out.println("Vvedite chislo ot " + min + " do " + max);
                    }

                    System.out.println("Prodolgit pokupky?");
                    String answer = scanner.next();
                    if (!answer.toLowerCase().equals("da")) {
                        break;
                    }
                }
            } else System.out.println("Vybrannogo tovara (" + products[number - 1] + ") net v nalichii");

        }

    }
}





