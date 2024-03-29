package gsf.unit;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Unit {
    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;


    public Unit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWeapon(Weapon weapon) {
        if (weapons == null) {
            weapons = new ArrayList();
        }
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperty(String property, Object value) {
        if (properties == null) {
            properties = new java.util.HashMap();
        }
        properties.put(property, value);
    }

    public Object getProperty(String property) {
        return properties.get(property);
    }
}
