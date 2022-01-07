package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

   Hero holy = new Hero(440,35, (int) (Math.random()*235));
   DemonLord devil = new DemonLord(32,234,"");


   System.out.print("Hero's damage [" + holy.getDamage() + "]" );
        System.out.print(", health " + " [" +  holy.getHealth() + "]");
        System.out.println(", critical damage " +  " [" + holy.getSkill() + "]");

        System.out.print("Demon's damage [" + devil.getDemonDamage(60)+ "]" );
        System.out.print(", health " + " [" +  devil.getDemonHealth(666) + "]");
        System.out.println(", defence " +  " [" + devil.setDemonDefence("Magical") + "]");





    }
}



