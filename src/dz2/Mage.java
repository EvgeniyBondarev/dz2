package Aston.dz2;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int health) {
        super(name, health);
    }
/*@Override
    public void attackEnemy() {
        System.out.println("Маг атакует врага!");
    }*/

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг атакует врага!");
        enemy.tackDamage(2);
    }
}
