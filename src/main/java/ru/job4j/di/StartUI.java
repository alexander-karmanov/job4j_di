package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;

    private ConsoleInput consoleInput;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public String askStr(String question) {
        return consoleInput.askStr(question);
    }
}