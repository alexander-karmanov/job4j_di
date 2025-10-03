package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public ConsoleInput() {
    }

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
