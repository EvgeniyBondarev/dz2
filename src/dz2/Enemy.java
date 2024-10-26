package Aston.dz2;

public class Enemy implements Mortal{
    private int health;
    private int damage = 3;

    public Enemy(int health) {
        this.health = health;
    }

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void tackDamage(int damage){
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero(Hero hero){
        System.out.println("Враг атакует героя");
        hero.tackDamage(damage);
    }

}
