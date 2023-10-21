package ru.gb.family_tree.model.tree;

import java.io.Serializable;
import java.util.List;

public interface FamilyItem<R> extends Serializable {
    int getId();
    R getFather();
    R getMother();
    boolean addChild(R familyItem);
    boolean addParents(R familyItem);
    String getBirthDate();
    List<R> getParents();
    List<R> getChildren();
    String getName();
    String getInfo();

}


