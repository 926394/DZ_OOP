package ru.gb.family_tree.tree;

import ru.gb.family_tree.comporator.FamilyMemberComparatorByName;
import ru.gb.family_tree.comporator.FamilyMemberComparatorByYearOfBirth;
import ru.gb.family_tree.Iterator.FamilyMemberIterator;
import ru.gb.family_tree.family.FamilyMember;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<FamilyMember> {
    private int idMember;
    private List<FamilyMember> familyMemberList;

    public FamilyTree() {
        familyMemberList = new ArrayList<>();
    }

    public boolean add(FamilyMember familyMember){
        if(!familyMemberList.contains(familyMember)){
            familyMemberList.add(familyMember);

            addToParents(familyMember);
            addToChildren(familyMember);
            return true;
        }
        return false;

    }

    private void addToParents(FamilyMember familyMember) {
        for (FamilyMember parent: familyMember.getParents()){
            parent.addParents(familyMember);
        }

    }

    private void addToChildren(FamilyMember familyMember) {
        for (FamilyMember child: familyMember.getChildren()){
            child.addParents(familyMember);
        }
    }

    public FamilyMember getByName(String name){
        for (FamilyMember familyMember: familyMemberList){
            if(familyMember.getName().equals(name)){
                return familyMember;
            }
        }
        return null;
    }


    public String getFamilyMemberinfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Состав семьи: \n");

        for (FamilyMember familyMember: familyMemberList) {
            stringBuilder.append(familyMember.getInfo());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return getFamilyMemberinfo();
    }

    public Iterator<FamilyMember> iterator(){
        return new FamilyMemberIterator(familyMemberList);
    }

    public void sortByName(){
        familyMemberList.sort(new FamilyMemberComparatorByName());
    }

    public void sortByBirthDate(){
        familyMemberList.sort(new FamilyMemberComparatorByYearOfBirth());
    }



}
