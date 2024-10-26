package Aston.dz2;

public class BattleGround {
    public static void main(String[] args) {
        System.out.println("---- Герои против монстра ----");
        Enemy enemy = new Enemy(10);
        Warrior warrior = new Warrior("Вася");
        Mage mage = new Mage("Мася");
        Archer archer = new Archer("Кися");
        while (enemy.isAlive()){
            warrior.attackEnemy(enemy);
            if (!enemy.isAlive()) break;
            mage.attackEnemy(enemy);
            if (!enemy.isAlive()) break;
            archer.attackEnemy(enemy);
        }
        System.out.println("\n---- Герой против двух монстров ----");

        Enemy enemy1 = new Enemy(5, 1);
        Enemy enemy2 = new Enemy(7, 2);
        Warrior warrior1 = new Warrior("Илья", 10);
        while (true){
            if (warrior1.isAlive()) {
                if (enemy1.isAlive())
                    warrior1.attackEnemy(enemy1);
                else if (enemy2.isAlive())
                    warrior1.attackEnemy(enemy2);
                else {
                    System.out.println("Герой победил.");
                    break;
                }
            }
            if (enemy1.isAlive() || enemy2.isAlive()){
                if (warrior1.isAlive() && enemy1.isAlive())
                    enemy1.attackHero(warrior1);
                if (warrior1.isAlive() && enemy2.isAlive())
                    enemy2.attackHero(warrior1);
                else{
                    System.out.println("Герой погиб.");
                    break;
                }
            }

        }
    }
}
