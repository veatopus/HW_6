package com.company;

public class Boss extends GameEntity {
    private Weapon weapon = new Weapon();

    public Weapon getWeapon() {
       return weapon;
    }

    public void setWeapon(String TypeOfWeapon, String weaponName) {
        weapon = new Weapon(TypeOfWeapon, weaponName);
    }
}
