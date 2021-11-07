package com.company.oviktor.booktasks.interfaces;


class CoinTossUp implements TossUp {

    int attempts;
    public static final int SIDES = 2;

    public boolean toss() {
        System.out.println("The coin sides is : " + attempts);
        return ++attempts != SIDES;
    }
}

class CoinTossUpFactory implements TossUpFactory {
    public CoinTossUp getTossUp() {
        return new CoinTossUp();
    }
}

class CubeTossUp implements TossUp {

    int attempts;
    public static final int SIDES = 6;

    public boolean toss() {
        System.out.println("The cube side is : " + attempts);
        return ++attempts != SIDES;
    }
}

class CubeTossUpFactory implements TossUpFactory {
    public CubeTossUp getTossUp() {
        return new CubeTossUp();
    }
}

public class Ex19 {
    public static void playGame(TossUpFactory tossUpFactory) {
        TossUp tossing = tossUpFactory.getTossUp();
        tossing.toss();
        while (tossing.toss()) ;
    }

    public static void main(String[] args) {
        CoinTossUpFactory coinTossUpFactory = new CoinTossUpFactory();
        CubeTossUpFactory cubeTossUpFactory = new CubeTossUpFactory();

        playGame(coinTossUpFactory);
        playGame(cubeTossUpFactory);
    }
}
