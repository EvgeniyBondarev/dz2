package Aston.dz2;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int health) {
        super(name, health);
    }
/*@Override
    public void attackEnemy() {
        System.out.println("Лучник атакует врага!");
    }*/

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник атакует врага!");
        enemy.tackDamage(1);
    }
}
