package Architecture.Game;

public abstract class Hero {
    
    private Integer level;
    private Integer hp;
    private Integer dps;
    // Weapon 
    // Armor

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
    
}
