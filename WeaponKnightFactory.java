package Architecture.Game;

public class WeaponKnightFactory extends WeaponFactory{
    
    @Override
    public Weapon createWeapon(Hero hero) {
        if (hero instanceof Knight){
            switch (hero.getLevel()) {
                case 1:
                    UsualSword newUsualSword = new UsualSword(1, 1, 2);
                    System.out.println("Создан cтандартный меч для рыцаря");
                    return newUsualSword;
                case 2:
                    ImprovedSword newImprovedSword = new ImprovedSword(2, 2, 3);
                    System.out.println("Создан улучшенный меч для рыцаря");
                    return newImprovedSword;
            }
        }
        return null;
    }
}
