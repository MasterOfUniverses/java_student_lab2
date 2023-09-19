package lab2.Magic;
public class Spell{
    private int range = 0;
    private String name = "lab2.Magic arrow";
    public Spell(){
        range = 0;
        name = "lab2.Magic arrow";
    }
    public Spell (String i_name, int i_range){
        name=i_name;
        range=i_range;
    }
    public void cast(int x,int y){
        System.out.println("Spell " + this.name + " was casted in ("+x+","+y+") with range "+this.range);
        return;
    }
}