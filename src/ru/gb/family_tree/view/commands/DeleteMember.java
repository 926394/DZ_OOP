package ru.gb.family_tree.view.commands;

import ru.gb.family_tree.view.ConsoleUI;

public class DeleteMember extends Command {
    public DeleteMember(ConsoleUI consoleUI) {
        super(consoleUI, "Удалить члена семьи");
    }

    @Override
    public void execute() {
        consoleUI.sortByName();
//        consoleUI.DeleteMember();
    }
}
