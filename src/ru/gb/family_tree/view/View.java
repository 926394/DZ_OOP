package ru.gb.family_tree.view;

import ru.gb.family_tree.model.family.FamilyMember;
import ru.gb.family_tree.model.tree.FamilyTree;

public interface View {
    boolean start();
    boolean start(FamilyTree<FamilyMember> familyTree);
    void printAnswer(String text);

}
