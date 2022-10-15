package Architecture.Game;

public class WeaponArcherFactory extends WeaponFactory{

    @Override
    public Weapon createWeapon(Hero hero) {
        if (hero instanceof Archer){
            switch (hero.getLevel()) {
                case 1:
                    Weapon newUsualBow = new UsualBow(1, 1, 2);
                    System.out.println("Создан cтандартный лук для лучника");
                    return newUsualBow;
                case 2:
                    Weapon newImprovedBow = new ImprovedBow(2, 2, 3);
                    System.out.println("Создан улучшенный лук для лучника");
                    return newImprovedBow;
            }
        }
        return null;
        
    }
    
}
