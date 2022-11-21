package Basics.curs3;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.health > 0) {
            return fighter1.name;
        } else {
            return fighter2.name;
        }
    }
}
