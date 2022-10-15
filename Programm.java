package Architecture.Game;

public class Programm {
    public static void main(String[] args) {
        
        Archer archer = new Archer(1, 10, 10);
        ArmorArcherFactory armFacAr = new ArmorArcherFactory();
        archer.setArmor(armFacAr.createArmor(archer));
        WeaponArcherFactory weapFacAr = new WeaponArcherFactory();
        archer.setWeapon(weapFacAr.createWeapon(archer));

        Knight knight = new Knight(2, 10, 10);
        ArmorKnightFactory armFacKn = new ArmorKnightFactory();
        knight.setArmor(armFacKn.createArmor(knight));
        WeaponKnightFactory weapFacKn = new WeaponKnightFactory();
        knight.setWeapon(weapFacKn.createWeapon(knight));

    }
}
