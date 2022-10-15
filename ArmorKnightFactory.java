package Architecture.Game;

public class ArmorKnightFactory extends ArmorFactory {

    @Override
    public Armor createArmor(Hero hero) {
        if (hero instanceof Knight){
            switch (hero.getLevel()) {
                case 1:
                    Armor newArmorKnightLight = new ArmorKnightLight(1, 1, 2);
                    System.out.println("Создана легкая броня для рыцаря");
                    return newArmorKnightLight;
                case 2:
                    Armor newArmorKnightHeavy = new ArmorKnightHeavy(2, 2, 3);
                    System.out.println("Создана тяжелая броня для рыцаря");
                    return newArmorKnightHeavy;
            }
        }
        return null;
        
    }

}
