package com.example.inscryption;

import android.text.Editable;

import java.io.Serializable;
import java.util.ArrayList;

public class Hero implements Serializable {
    private String name;
    private int numberOfHero;
    private boolean hi;
    private boolean firstTime;


    private int numberOfLevel = 0;
    private int health;
    private int maxhealth;


    private int physickAtack;
    private int physickArmor;

    private int magickAtack;
    private int magickArmor;

    private int attack = 0;
    private int armor = 0;
    private int firstCell = 0;
    private int secondCell = 0;
    private int thirdCell = 0;
    private int fourthCell = 0;
    private int fifthCell = 0;
    private int selectCell = 0;
    private boolean last = false;

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getSelectCell() {
        return selectCell;
    }

    public void setSelectCell(int selectCell) {
        this.selectCell = selectCell;
    }

    public int getFirstCell() {
        return firstCell;
    }

    public void setFirstCell(int firstCell) {
        this.firstCell = firstCell;
    }

    public int getSecondCell() {
        return secondCell;
    }

    public void setSecondCell(int secondCell) {
        this.secondCell = secondCell;
    }

    public int getThirdCell() {
        return thirdCell;
    }

    public void setThirdCell(int thirdCell) {
        this.thirdCell = thirdCell;
    }

    public int getFourthCell() {
        return fourthCell;
    }

    public void setFourthCell(int fourthCell) {
        this.fourthCell = fourthCell;
    }

    public int getFifthCell() {
        return fifthCell;
    }

    public void setFifthCell(int fifthCell) {
        this.fifthCell = fifthCell;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    public boolean isFirstTime() {
        return firstTime;
    }

    public void setFirstTime(boolean firstTime) {
        this.firstTime = firstTime;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysickAtack() {
        return physickAtack;
    }

    public void setPhysickAtack(int physickAtack) {
        this.physickAtack = physickAtack;
    }

    public int getPhysickArmor() {
        return physickArmor;
    }

    public void setPhysickArmor(int physickArmor) {
        this.physickArmor = physickArmor;
    }

    public int getMagickAtack() {
        return magickAtack;
    }

    public void setMagickAtack(int magickAtack) {
        this.magickAtack = magickAtack;
    }

    public int getMagickArmor() {
        return magickArmor;
    }

    public void setMagickArmor(int magickArmor) {
        this.magickArmor = magickArmor;
    }


    public int getNumberOfLevel() {
        return numberOfLevel;
    }

    public void setNumberOfLevel(int numberOfLevel) {
        this.numberOfLevel = numberOfLevel;
    }

    public boolean isHi() {
        return hi;
    }

    public void setHi(boolean hi) {
        this.hi = hi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHero() {
        return numberOfHero;
    }

    public void setNumberOfHero(int numberOfHero) {
        this.numberOfHero = numberOfHero;
    }
}
