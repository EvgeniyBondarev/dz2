package Aston.dz2;

public abstract class Hero implements Mortal{
    private String name;
    private int health = 10;



    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    /*public void attackEnemy(){
        System.out.println("Герой атакует врага!");
    }

    public void attackEnemy(Enemy enemy){
        enemy.tackDamage(0);
    }*/

    public abstract void attackEnemy(Enemy enemy);
    public void tackDamage(int damage){
        health -= damage;
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
