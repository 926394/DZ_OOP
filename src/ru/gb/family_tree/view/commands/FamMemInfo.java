package ru.gb.family_tree.view.commands;

import ru.gb.family_tree.view.ConsoleUI;

public class FamMemInfo extends Command {

    public FamMemInfo(ConsoleUI consoleUI) {
        super(consoleUI, "Содержание семейного древа");
    }

    @Override
    public void execute() {
        consoleUI.FamMemInfo();
    }
}
