package Architecture.Game;

public class ArmorArcherFactory extends ArmorFactory {

    @Override
    public Armor createArmor(Hero hero) {
        if (hero instanceof Archer){
            switch (hero.getLevel()) {
                case 1:
                    Armor newArmorArcherLight = new ArmorArcherLight(1, 1, 2);
                    System.out.println("Создана легкая броня для лучника");
                    return newArmorArcherLight;
                case 2:
                    Armor newArmorArcherHeavy = new ArmorArcherHeavy(2, 2, 3);
                    System.out.println("Создана тяжелая броня для лучника");
                    return newArmorArcherHeavy;
            }
        }
        return null;
}
}
