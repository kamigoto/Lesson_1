package ru.kamiliashaikhieva;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {

        System.out.println("Задавай свой вопрос");

        Scanner scanner = new Scanner(System.in);

        String question = scanner.nextLine();


        String anyAnswer[] = {"Возможно...", "Непременно!", "Скорее да", "Скорее нет", "Да", "Нет", "Сложный вопрос...", "Бесспорно", "Предрешено", "Никаких сомнений", "Определённо да", "Спроси позже", "Лучше не рассказывать",
                "Сконцентрируйся и спроси опять", "Мой ответ - 'нет'", "Весьма сомнительно", "Сейчас нельзя предсказать"};


        Random random = new Random();
        int index = random.nextInt(anyAnswer.length);
        System.out.println(anyAnswer[index]);

    }
}

