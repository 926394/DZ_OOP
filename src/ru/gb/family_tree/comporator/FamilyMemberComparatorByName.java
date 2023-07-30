package ru.gb.family_tree.comporator;

import ru.gb.family_tree.family.FamilyMember;

import java.util.Comparator;

public class FamilyMemberComparatorByName implements Comparator<FamilyMember>{

    public int compare(FamilyMember o1, FamilyMember o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

