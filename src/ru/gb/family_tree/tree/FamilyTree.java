package ru.gb.family_tree.tree;

import ru.gb.family_tree.comporator.FamilyMemberComparatorByName;
import ru.gb.family_tree.comporator.FamilyMemberComparatorByYearOfBirth;
import ru.gb.family_tree.Iterator.FamilyMemberIterator;
import ru.gb.family_tree.family.FamilyMember;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamilyItem <E>> implements Serializable, Iterable<E> {
    private int idMember;
    private List<E> familyMemberList;

    public FamilyTree(List<E> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }

    public FamilyTree(){
        this(new ArrayList<>());
    }

    public boolean add(E familyMember){
        if(!familyMemberList.contains(familyMember)){
            familyMemberList.add(familyMember);

            addToParents(familyMember);
            addToChildren(familyMember);
            return true;
        }
        return false;

    }

    private void addToParents(E familyMember) {
        for (E parent: familyMember.getParents()){
            parent.addParents(familyMember);
        }

    }

    private void addToChildren(E familyMember) {
        for (E child: familyMember.getChildren()){
            child.addParents(familyMember);
        }
    }

    public E getByName(String name){
        for (E familyMember: familyMemberList){
            if(familyMember.getName().equals(name)){
                return familyMember;
            }
        }
        return null;
    }


    public String getFamilyMemberInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Состав семьи: \n");

        for (E familyMember: familyMemberList) {
            stringBuilder.append(familyMember.getInfo());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return getFamilyMemberInfo();
    }

    public Iterator<E> iterator(){
        return new FamilyMemberIterator<>(familyMemberList);
    }

    public void sortByName(){
        familyMemberList.sort(new FamilyMemberComparatorByName<>());
    }

    public void sortByBirthDate(){
        familyMemberList.sort(new FamilyMemberComparatorByYearOfBirth<>());
    }



}
