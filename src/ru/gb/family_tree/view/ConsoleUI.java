package ru.gb.family_tree.view;

import ru.gb.family_tree.model.comporator.FamilyMemberComparatorByName;
import ru.gb.family_tree.model.family.FamilyMember;
import ru.gb.family_tree.model.family.Gender;
import ru.gb.family_tree.model.tree.FamilyItem;
import ru.gb.family_tree.model.tree.FamilyTree;
import ru.gb.family_tree.presenter.Presenter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu menu;
    public FamilyTree <FamilyMember> familyTree;
    public ArrayList<FamilyItem> familyMemberList;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);

    }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public boolean start(FamilyTree<FamilyMember> familyTree) {
        System.out.println("Доброго времени суток!");
        while (work) {
            System.out.println(menu.menu());
            String choice = scanner.nextLine();
            // проверка
            int numChoice = Integer.parseInt(choice);
            menu.execute(numChoice);
        }
        return false;
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    public Presenter getPresenter() {
        return presenter;
    }

    public void FamMemInfo() {
        presenter.FamMemInfo();
    }

//    public void DeleteMember() {
//        presenter.DeleteMember();
//    }


    public void addMember() {
        System.out.println("Введите имя ");
        String name = scanner.nextLine();
        System.out.println("Введите пол в формате <man> или <woman>");
        Gender gender = Gender.valueOf(scanner.nextLine());
//        System.out.println("Введите дату рождения в формате гггг-мм-дд ");
//        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
//        System.out.println("Введите дату смерти в формате гггг-мм-дд");
//        LocalDate dateOfDeath = LocalDate.parse(scanner.nextLine());

//        System.out.println("Укажите имя отца ");
//        String father = scanner.nextLine();

//        System.out.println("Укажите имя матери ");
//        String mother = scanner.nextLine();
//
//        presenter.FamMemInfo();

//        System.out.println("Укажите имя отца");
//        String fatherString = scanner.nextLine();
//        String father = fatherString;
//
//        FamilyMember father = null;

//        if (checkTextForInt(fatherString)){
//            int fatherIdx = Integer.parseInt(fatherString);
//            if (fatherIdx>0 && fatherIdx<=presenter.getTreeSize()) {
//                father = presenter.getTreeItem(fatherIdx);}
//        }

//        System.out.println("Укажите имя матери");
//        String motherString = scanner.nextLine();
//        FamilyMember mother = null;
//        if (checkTextForInt(motherString)){
//            int motherIdx = Integer.parseInt(motherString);
//            if (motherIdx>0 && motherIdx<=presenter.getTreeSize()) {
//                mother = presenter.getTreeItem(motherIdx);}
//        }
//        // метод для проверки на валидность ввода от пользователя
//        presenter.addFamilyMember(name, gender, birthDate, dateOfDeath, null, null);
        presenter.addFamilyMember(name, gender, null, null, null, null);

    }


    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
//            inputError();
            return false;
        }
    }


    public void finish() {
        System.out.println("До свидания!");
        work = false;
    }


//    public void sortByBirthDate() {
//        presenter.sortByBirthDate();
//    }
//
//    public void sortByName() {
//        presenter.sortBuName();
//    }

//    public void DeleteMember(){
//        familyMemberList.sort(new FamilyMemberComparatorByName<>());
//    }

//    public void sortByName() {
//        familyTree.sortByName();
//    }

//    public void sortByName(){
//        familyMemberList.sort(new FamilyMemberComparatorByName<>());
//    }
}

