package ru.gb.family_tree.comporator;

import ru.gb.family_tree.family.FamilyMember;

import java.util.Comparator;

public class FamilyMemberComparatorByYearOfBirth implements Comparator <FamilyMember>{
    @Override
    public int compare(FamilyMember o1, FamilyMember o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
