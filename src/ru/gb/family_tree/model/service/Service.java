package ru.gb.family_tree.model.service;

import ru.gb.family_tree.model.family.FamilyMember;
import ru.gb.family_tree.model.family.Gender;
import ru.gb.family_tree.model.tree.FamilyItem;
import ru.gb.family_tree.model.tree.FamilyTree;

import java.time.LocalDate;

public class Service <R extends FamilyItem<R>>{

    private FamilyTree<R> familyTree;

    public Service(FamilyTree<R> familyTree) {
        this.familyTree = familyTree;
    }

    public Service(){
        familyTree = new FamilyTree<>();
    }

    public void addFamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate dateOfDeath,
                                FamilyMember father, FamilyMember mother)
    {
        FamilyMember member = new FamilyMember(name, gender, birthDate, dateOfDeath, father, mother);
        familyTree.add((R) member);
    }

    public String treeFamilyMemberInfo() {
        return familyTree.getFamilyMemberInfo();
    }

//    public String treeFamilyDeleteMember() {
//        return familyTree.getDeleteMember();
//    }
}


