package ru.gb.family_tree.tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyItem<R> extends Serializable {
    R getFather();

    R getMother();

    boolean addChild(R familyItem);

    boolean addParents(R familyItem);

    String getName();

    LocalDate getBirthDate();

    List<R> getParents();

    List<R> getChildren();

    String getInfo();
}


