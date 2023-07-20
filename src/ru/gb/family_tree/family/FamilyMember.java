package ru.gb.family_tree.family;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static ru.gb.family_tree.family.Gender.man;
import static ru.gb.family_tree.family.Gender.woman;

public class FamilyMember implements Serializable {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate DateOfDeath;
    private List<FamilyMember> parents;
    private List<FamilyMember> children;

    public FamilyMember(String name, Gender gender, LocalDate birthDate, LocalDate dateOfDeath,
                        FamilyMember father, FamilyMember mother) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.DateOfDeath = dateOfDeath;
        parents = new ArrayList<>();
        if(father != null){
            parents.add(father);
        }
        if (mother != null){
            parents.add(mother);
        }
        children = new ArrayList<>();
    }

    public FamilyMember(String name, Gender gender, LocalDate birthDate,
                        FamilyMember father, FamilyMember mother ) {
        this(name, gender, birthDate, null, father, mother);
    }

    public String getName(){
        return name;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public LocalDate getDateOfDeath() {
        return DateOfDeath;
    }

    public FamilyMember(List<FamilyMember> children) {
        this.children = children;
    }

    public boolean addChild(FamilyMember child){
        if(!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

    public boolean addParents(FamilyMember parent){
        if (!parents.contains(parent)){
            children.add(parent);
            return true;
        }
        return false;
    }

    public FamilyMember getFather() {
        for (FamilyMember parent : parents) {
            if (parent.gender == man) {
                return parent;
            }
        }
        return null;
    }

    public FamilyMember getMother() {
        for (FamilyMember parent : parents) {
            if (parent.gender == woman){
                return parent;
            }
        }
        return null;
    }

    public  List<FamilyMember> getChildren(){
        return children;
    }

    public  List<FamilyMember> getParents(){
        return parents;
    }



    public String getInfo() {
        StringBuilder fa = new StringBuilder();
        fa.append("имя: ");
        fa.append(name);
        fa.append(", ");
        fa.append(getMotherInfo());
        fa.append(", ");
        fa.append(getFatherInfo());
        fa.append(", ");
        fa.append(getChildrenInfo());
        return fa.toString();
    }

    public String getMotherInfo(){
        String answ = "мать:  ";
        FamilyMember mother = getMother();
        if(mother != null){
            answ += mother.getName();
        }
        else {
            answ += "неизвестна";
        }
        return answ;
    }

    public String getFatherInfo(){
        String answ = "отец:  ";
        FamilyMember father = getFather();
        if(father != null){
            answ += father.getName();
        }
        else {
            answ += "неизвестен";
        }
        return answ;
    }

    public String getChildrenInfo(){
        StringBuilder answ = new StringBuilder();
        answ.append("дети: ");
        if(children.size() != 0){
            answ.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++){
                answ.append(", ");
                answ.append(children.get(i).getName());
            }
        }else {
            answ.append("отсутствуют");
        }
        return answ.toString();
    }

}
