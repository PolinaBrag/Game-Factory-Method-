package Architecture.Game;

public class Archer extends Hero{

    private Integer valueAttack = 50;
    
    public Archer(Integer level, Integer hp, Integer dps) {
        super(level, hp, dps);
    }

    @Override
    public Integer getDPS(Integer valueDPS) {
        setHp(getHp() - valueDPS - 10);
        return getHp();
    }

    @Override
    public Integer attack(Hero hero) {
        hero.setHp(hero.getHp() - valueAttack - 10);
        return hero.getHp();
    }
    
}
