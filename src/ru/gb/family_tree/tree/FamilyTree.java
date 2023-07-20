package ru.gb.family_tree.tree;

import ru.gb.family_tree.family.FamilyMember;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
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

}
