package ru.gb.family_tree;


import ru.gb.family_tree.family.FamilyMember;
import ru.gb.family_tree.family.Gender;
import ru.gb.family_tree.save.FileHandlerForTree;
import ru.gb.family_tree.tree.FamilyItem;
import ru.gb.family_tree.tree.FamilyTree;

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

        FamilyTree <FamilyMember> familyTree = new FamilyTree<>();

        familyTree.add(new FamilyMember("Evgeniya", Gender.woman, LocalDate.of(1891,5,2),
                LocalDate.of(2010,5,2),
                familyTree.getByName(null),familyTree.getByName(null)));

        familyTree.add(new FamilyMember("Vasilii", Gender.man, LocalDate.of(1966,8,26),
                familyTree.getByName(null), familyTree.getByName(null)));

        familyTree.add(new FamilyMember("Tamara", Gender.woman, LocalDate.of(1972, 5, 24),
                familyTree.getByName("Evgeniya"), familyTree.getByName(null)));

        familyTree.add(new FamilyMember("Nikolay", Gender.man, LocalDate.of(1991,7,21),
                familyTree.getByName("Vasilii"), familyTree.getByName("Tamara")));

        familyTree.add(new FamilyMember("Angelina", Gender.woman, LocalDate.of(1995, 4, 22),
                familyTree.getByName("Vasilii"), familyTree.getByName("Tamara")));


        FileHandlerForTree fileHandlerForTree = new FileHandlerForTree();
        fileHandlerForTree.save(familyTree, "C:/Users/Nikolay/IdeaProjects/DZ_OOP_Java/src/ru/gb/family_tree/test.out");

        System.out.println(familyTree.getFamilyMemberInfo());
//        familyTree.sortByName();
//        System.out.println(familyTree.getFamilyMemberinfo());
        familyTree.sortByBirthDate();
        System.out.println(familyTree.getFamilyMemberInfo());



//        FileHandlerForTree fileHandlerForTree = new FileHandlerForTree();
//        FamilyTree familyTree = (FamilyTree) fileHandlerForTree.read
//                ("C:/Users/Nikolay/IdeaProjects/DZ_OOP_Java/src/ru/gb/family_tree/test.out");
//        System.out.println(familyTree.getFamilyMemberinfo());

    }
}