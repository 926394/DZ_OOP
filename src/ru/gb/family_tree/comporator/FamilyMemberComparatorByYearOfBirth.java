package ru.gb.family_tree.comporator;

import ru.gb.family_tree.family.FamilyMember;
import ru.gb.family_tree.tree.FamilyItem;

import java.util.Comparator;

public class FamilyMemberComparatorByYearOfBirth<E extends FamilyItem> implements Comparator <E>{
    @Override
    public int compare(E o1, E o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
