package Architecture.Game;

public abstract class Weapon extends Equipment{
    
    private Integer maxDPS;
    private Integer minDPS;

    public Weapon(Integer level, Integer maxDPS, Integer minDPS) {
        super(level);
        this.maxDPS = maxDPS;
        this.minDPS = minDPS;
    }

    
}
