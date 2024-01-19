package com.example.inscryption;

import java.io.Serializable;

public class Enemy implements Serializable {
    private int health;
    private int physickAtack;
    private int physickArmor;
    private int magickAtack;
    private int magickArmor;

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
}
