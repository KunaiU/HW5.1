package com.company;

public class DemonLord {

    DemonLord(){}

    public DemonLord(int demonDamage, int demonHealth, String demonDefence){}

    private int demonHealth;
    private int demonDamage;
    private String demonDefence [] = {"Physical","Magical","Energy"};

    public int getDemonDamage(int demonDamage) {
        return demonDamage;
    }

    public void setDemonDamage(int demonDamage) {
        this.demonDamage = demonDamage;
    }

    public int getDemonHealth(int demonHealth) {
        return demonHealth;
    }

    public void setDemonHealth(int demonHealth) {
        this.demonHealth = demonHealth;
    }

    public String[] getDemonDefence() {
        return demonDefence;
    }

    public void setDemonDefence(String[] demonDefence) {
        this.demonDefence = demonDefence;
    }

    public String setDemonDefence(String magical) {
        return magical;
    }
}

