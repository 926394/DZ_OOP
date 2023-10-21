package ru.gb.family_tree;

import ru.gb.family_tree.model.family.FamilyMember;
import ru.gb.family_tree.model.family.Gender;
import ru.gb.family_tree.model.service.Service;
import ru.gb.family_tree.model.tree.FamilyTree;
import ru.gb.family_tree.view.ConsoleUI;
import java.time.LocalDate;

/**
 * Реализовать, с учетом ооп подхода, приложение.
 * Для проведения исследований с генеалогическим древом.
 * Идея: описать некоторое количество компонент, например:
 * модель человека и дерева
 * Под “проведением исследования” можно понимать например получение всех детей выбранного человека.
 * Более детальное описание проекта и как его реализовать обсуждали в конце семинара
 * Сделать PR к проекту: https://github.com/Liberate520/homeWork
 * В качестве ответа указать ссылку на PR
 * Ссылка на то как сделать пулреквест смотри в материалах к уроку
 * Если PR все таки не дается, то можно и ссылкой на гит репозиторий
 */
public class Main {

    public static void main(String[] args) {

        FamilyTree <FamilyMember> familyTree = new FamilyTree();
        Service<FamilyMember> service = new Service<>(familyTree);
        ConsoleUI con = new ConsoleUI();
        con.getPresenter().setService(service);
        con.start(familyTree);

//        System.out.println(consoleUI.start(familyTree));

//        familyTree.add(new FamilyMember("Evgeniya", Gender.woman, LocalDate.of(1891,5,2),
//                LocalDate.of(2010,5,2), familyTree.getByName(null),familyTree.getByName(null)));
////
//        familyTree.add(new FamilyMember("Vasilii", Gender.man, LocalDate.of(1966,8,26),
//                familyTree.getByName(null), familyTree.getByName(null)));
//
//        familyTree.add(new FamilyMember("Tamara", Gender.woman, LocalDate.of(1972, 5, 24),
//                familyTree.getByName("Evgeniya"), familyTree.getByName(null)));
//
//        familyTree.add(new FamilyMember("Nikolay", Gender.man, LocalDate.of(1991,7,21),
//                familyTree.getByName("Vasilii"), familyTree.getByName("Tamara")));
//
//        familyTree.add(new FamilyMember("Angelina", Gender.woman, LocalDate.of(1995, 4, 22),
//                familyTree.getByName("Vasilii"), familyTree.getByName("Tamara")));

//        FileHandlerForTree fileHandlerForTree = new FileHandlerForTree();
//        fileHandlerForTree.save(familyTree, "C:/Users/Nikolay/IdeaProjects/DZ_OOP_Java/src/ru/gb/family_tree/test.out");
//
//        System.out.println(familyTree.getFamilyMemberInfo());
//        familyTree.sortByName();
//        System.out.println(familyTree.getFamilyMemberInfo());
//        familyTree.sortByBirthDate();
//        System.out.println(familyTree.getFamilyMemberInfo());

//        FileHandlerForTree fileHandlerForTree = new FileHandlerForTree();
//        FamilyTree familyTree = (FamilyTree) fileHandlerForTree.read
//                ("C:/Users/Nikolay/IdeaProjects/DZ_OOP_Java/src/ru/gb/family_tree/test.out");
//        System.out.println(familyTree.getFamilyMemberInfo());



    }
}