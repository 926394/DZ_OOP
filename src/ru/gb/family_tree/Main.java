package ru.gb.family_tree;


import family_tree.Gender;
import ru.gb.family_tree.family.FamilyMember;
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
        FamilyTree familyTree = new FamilyTree();


        familyTree.add(new FamilyMember("Vasilii", Gender.man, LocalDate.of(1966,8,26),
                familyTree.getByName(null), familyTree.getByName(null)));

        familyTree.add(new FamilyMember("Tamara", Gender.woman, LocalDate.of(1972, 5, 24),
                familyTree.getByName(null), familyTree.getByName(null)));

        familyTree.add(new FamilyMember("Nikolay", Gender.man, LocalDate.of(1991,7,21),
                familyTree.getByName("Vasilii"), familyTree.getByName("Tamara")));
        familyTree.add(new FamilyMember("Angelina", Gender.woman, LocalDate.of(1995, 4, 22),
                familyTree.getByName("Vasilii"), familyTree.getByName("Tamara")));


        System.out.println(familyTree.getFamilyMemberinfo());


    }
}