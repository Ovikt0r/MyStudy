package com.company.oviktor.booktasks.interfaces;


class ActionCharacter {
    public void fight() {

    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    public void swim() {
    }

    public void fly() {
    }

    public void climb() {
    }
}


public class Adventure {

    public static void t (CanClimb x) {x.climb();}
    public static void u (CanSwim x) {x.swim();}
    public static void v (CanFly x ) {x.fly();}
    public static void w (CanFight x ) {x.fight();}
    public static void j (ActionCharacter x) {x.fight();}

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
        j(hero);
    }
}
