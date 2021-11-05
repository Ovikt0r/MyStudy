package com.company.oviktor.booktasks.reusingclasses;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }

}

public class Ex06_Chess extends BoardGame {
    Ex06_Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Ex06_Chess chess = new Ex06_Chess();
    }
}
