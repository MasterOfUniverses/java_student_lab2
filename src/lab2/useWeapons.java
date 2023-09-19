package lab2;

import lab2.Weapons.*;
import lab2.Magic.*;
public class useWeapons {
    public static void main(String[] args) {
        Bow weapon_1 = new Bow(10,60,160);
        Sword weapon_2 = new Sword();
        MagicWand weapon_3 = new MagicWand(40,200,40,"Fireball",10);
        Weapon[] person_weapons = new Weapon[3];
        person_weapons[0] = weapon_1;
        person_weapons[1] = weapon_2;
        person_weapons[2] = weapon_3;
        for(int i=0;i<person_weapons.length;i++){
            System.out.println(person_weapons[i].showDamage());
        }
        System.out.println(weapon_1.isInRange(150));
        System.out.println(weapon_3.isInRange(60));
        weapon_3.cast(3,4);
        System.out.println(weapon_2.tryUsing("halfling"));
        System.out.println(weapon_2.tryUsing("human"));
        return;
    }
}