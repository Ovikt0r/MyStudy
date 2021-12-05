package com.company.oviktor.booktasks.innerclasses;

import lombok.extern.slf4j.Slf4j;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {
    }

    public void destroy() {
    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {
    }

    public void destroy() {
    }

    public void kill() {
    }

    public void drinkBlood() {
    }
}

@Slf4j
public class HorrorShow {

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla() {
            public void menace() {
                log.info("This is working of DangerousMonster.menace method");
            }

            public void destroy() {
                log.info("This is working of DangerousMonster.destroy method");
            }
        };
        barney.menace();
        barney.destroy();
        Vampire vlad = new VeryBadVampire() {
            public void menace() {
                log.info("This is working of Vampire.menace method");
            }

            public void destroy() {
                log.info("This is working of Vampire.destroy method");
            }

            public void kill() {
                log.info("This is working of Vampire.kill method");
            }

            public void drinkBlood() {
                log.info("This is working of Vampire.drinkBlood method");
            }
        };
        vlad.menace();
        vlad.destroy();
        vlad.kill();
        vlad.drinkBlood();
    }
}