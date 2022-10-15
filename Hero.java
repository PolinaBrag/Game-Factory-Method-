package Architecture.Game;

public abstract class Hero {
    
    private Integer level;
    private Integer hp;
    private Integer dps;
    private Weapon weapon;
    private Armor armor;

    public Hero(Integer level, Integer hp, Integer dps) {
        this.level = level;
        this.hp = hp;
        this.dps = dps;
    }

    public abstract Integer getDPS(Integer valueDPS);

    public abstract Integer attack(Hero hero);

    public void setHp(Integer hp) {
        this.hp = hp;
    }
    
    public Integer getHp() {
        return hp;
    }
    
    public Integer getLevel() {
        return level;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

}
