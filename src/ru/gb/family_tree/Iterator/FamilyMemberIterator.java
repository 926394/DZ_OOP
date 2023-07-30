package ru.gb.family_tree.Iterator;

import ru.gb.family_tree.family.FamilyMember;

import java.util.Iterator;
import java.util.List;

public class FamilyMemberIterator implements Iterator<FamilyMember> {
    private int index;
    private List<FamilyMember> familyMemberList;
    public FamilyMemberIterator(List<FamilyMember> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }

    public boolean hasNext(){
        return index< familyMemberList.size();
    }

    public FamilyMember next(){
        return familyMemberList.get(index++);
    }


}
