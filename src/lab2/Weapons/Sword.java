package lab2.Weapons;
public class Sword extends Weapon{
    private boolean isLight = false;
    public Sword(){
        isLight = false;
        damage = 4;
        price = 10;
    }
    public Sword(int i_damage, int i_price, boolean i_isLight){
        damage = i_damage;
        price = i_price;
        isLight=i_isLight;
    }
    public boolean tryUsing(String race){
        if(!isLight&&(race.equals("halfling"))){
            System.out.println("You can't use!");
            return false;
        }
        System.out.println("You can use!");
        return true;
    }
}