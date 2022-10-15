package Architecture.Game;

public abstract class Armor extends Equipment{

    private Integer value;
    private Integer maxValue;

    public Armor(Integer level, Integer value, Integer maxValue) {
        super(level);
        this.value = value;
        this.maxValue = maxValue;
    }

}
