package gsf.unit;

public class Weapon {
    
    private String name;
    private int damage;
    private int range;
    
    public Weapon(String name, int damage, int range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getRange() {
        return range;
    }
    
    public String toString() {
        return name + " (damage: " + damage + ", range: " + range + ")";
    }
}
