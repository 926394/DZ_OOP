package ru.gb.family_tree.model.comporator;


import ru.gb.family_tree.model.tree.FamilyItem;

import java.util.Comparator;

public class FamilyMemberComparatorByName<E extends FamilyItem> implements Comparator<E>{

    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

