package lab2.Weapons;
public abstract class Weapon{
    protected int price;
    protected int damage;
    public int showDamage(){
        return damage;
    }
    public int showPrice(){
        return price;
    }
}