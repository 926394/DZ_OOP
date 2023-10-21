package ru.gb.family_tree.presenter;

import ru.gb.family_tree.model.family.FamilyMember;
import ru.gb.family_tree.model.family.Gender;
import ru.gb.family_tree.model.service.Service;
import ru.gb.family_tree.model.tree.FamilyTree;
import ru.gb.family_tree.view.View;

import java.time.LocalDate;

public class Presenter{
    private View view;
    private Service service;
    private FamilyTree <FamilyMember> tree;



    public Service getService() {
        return service;
    }

    public void setService(Service<FamilyMember> service) {
        this.service = service;
    }

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addFamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate dateOfDeath,
                                FamilyMember father, FamilyMember mother) {
        service.addFamilyMember(name, gender, birthDate, dateOfDeath, father, mother);

//        view.printAnswer(service.treeFamilyMemberInfo()); //вывод всего дерева сразу после добавления
    }

//    public void addFamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate dateOfDeath
//                                FamilyMember father, FamilyMember mother) {
//        service.addFamilyMember(name, gender, birthDate, dateOfDeath, father, mother);
//
////        view.printAnswer(service.treeFamilyMemberInfo()); //вывод всего дерева сразу после добавления
//    }
    public void FamMemInfo() {
        view.printAnswer(service.treeFamilyMemberInfo());
    }

//    public void DeleteMember() {
//        view.printAnswer(service.DeleteMember());
//    }


    public int getTreeSize() {
        return tree.getTreeSize();
    }

    public FamilyMember getTreeItem(int number) {
        return tree.getFamilyItem(number);
    }
    public void sortBuName() {
        tree.sortByName();

    }
//
    public void sortByBirthDate() {
        tree.sortByBirthDate();

    }
}
