package ru.gb.family_tree.Iterator;

import ru.gb.family_tree.family.FamilyMember;
import ru.gb.family_tree.tree.FamilyItem;

import java.util.Iterator;
import java.util.List;

public class FamilyMemberIterator<E extends FamilyItem> implements Iterator<E> {
    private int index;
    private List<E> familyMemberList;
    public FamilyMemberIterator(List<E> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }

    public boolean hasNext(){
        return index< familyMemberList.size();
    }

    public E next(){
        return familyMemberList.get(index++);
    }


}
