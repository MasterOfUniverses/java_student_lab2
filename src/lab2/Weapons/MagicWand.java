package lab2.Weapons;
import lab2.Magic.Spell;
public class MagicWand extends Bow{
    private int range = 40;
    private Spell type = new Spell();
    private static int count=0;
    public MagicWand(){
        if(count<5){
            count++;
            this.range = 40;
            this.damage = 40;
            this.price = 100;
        }else{
            count++;
            System.out.println("Too many wands");
        }
    }
    public MagicWand(int i_damage, int i_price, int i_range, Spell i_type){
        super(i_damage,i_price,i_range);
        if(count<5){
            this.type=i_type;
            count++;
        }else{
            this.damage = 0;
            this.price = 0;
            this.range = 0;
            count++;
            System.out.println("Too many wands");
        }
    }

    public MagicWand(int i_damage, int i_price, int i_range, String i_spell_name, int i_spell_range){
        super(i_damage,i_price,i_range);
        if(count<5){
            this.type=new Spell(i_spell_name,i_spell_range);
            count++;
        }else{
            this.damage = 0;
            this.price = 0;
            this.range = 0;
            count++;
            System.out.println("Too many wands");

        }
    }
    @Override
    public boolean isInRange(int distance){
        boolean inRange = distance<=this.range;
        if(inRange){
            System.out.println("Enemy is in wand's range. You can attack!");
        }else{
            System.out.println("Enemy isn't in wand's range. You can't attack :(");
        }
        return inRange;
    }
    @Override
    public int showDamage(){
        System.out.println("MagicWand damage: "+this.damage);
        return  this.damage;
    }
    public Spell cast(int x, int y){
    //public void cast(int x, int y){
        if(isInRange(x*x+y*y)){
            this.type.cast(x,y);
        }
        return this.type;
    }
}