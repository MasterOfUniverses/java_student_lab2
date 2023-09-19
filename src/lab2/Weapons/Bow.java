package lab2.Weapons;
public class Bow extends Weapon{
    private int range = 100;
    public Bow(){
        range = 100;
        damage = 4;
        price = 10;
    }
    public Bow(int i_damage, int i_price, int i_range){
        damage = i_damage;
        price = i_price;
        range = i_range;
    }
    public boolean isInRange(int distance){
        boolean inRange = distance<=range;
        if(inRange){
            System.out.println("Enemy is in bow's range. You can attack!");
        }else{
            System.out.println("Enemy isn't in bow's range. You can't attack :(");
        }

        return inRange;
    }
}