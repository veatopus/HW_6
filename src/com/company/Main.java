package com.company;

public class Main {
    static Boss boss = new Boss();

    public static void main(String[] args) {
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeapon("Steel arms", "Machetes");
        printInfo();
    }

    public static void printInfo() {
        System.out.println(
                "Boss heals: " + boss.getHealth() + "\n" +
                        "Boss Damage: " + boss.getDamage() + "\n" +
                        "Boss weapon: " + boss.getWeapon());
    }
}