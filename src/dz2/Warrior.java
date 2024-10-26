package Aston.dz2;

public class Warrior extends Hero{

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, int health) {
        super(name, health);
    }
/*@Override
    public void attackEnemy() {
        System.out.println("Воин атакует врага!");
    }*/

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин атакует врага!");
        enemy.tackDamage(3);
    }
}
