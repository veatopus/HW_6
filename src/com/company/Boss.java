package com.company;

public class Boss extends GameEntity {
    private Weapon weapon = new Weapon();

    public String getWeapon() {
        return "Type of weapon: " + weapon.getTypeOfWeapon() + "  Weapon name: " + weapon.getWeaponName();
    }

    public void setWeapon(String TypeOfWeapon, String weaponName) {
       weapon.setTypeOfWeapon(TypeOfWeapon);
       weapon.setWeaponName(weaponName);
    }

}
