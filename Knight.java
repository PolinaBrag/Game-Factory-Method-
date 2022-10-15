package Architecture.Game;

public class Knight extends Hero{

    private Integer valueAttack = 100;

    public Knight(Integer level, Integer hp, Integer dps) {
        super(level, hp, dps);
    }

    @Override
    public Integer getDPS(Integer valueDPS) {
        setHp(getHp() - valueDPS);
        return getHp();
    }

    @Override
    public Integer attack(Hero hero) {
        hero.setHp(hero.getHp() - valueAttack);
        return hero.getHp();
    }
    
}
