package Basics.curs3;

public class Fighter {
    //create a class named Fighter that has the following state and behaviour:
    //state: name, health, damagePerAttack
    //attack(Fighter opponent)

    public String name;
    public int health;
    private float damagePerAttack;

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

}
