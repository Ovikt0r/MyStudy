package com.company.oviktor.booktasks.innerclasses;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class OutClass {
    Deletable getRI() {
        class RI implements Deletable {
            public void delete() {
                log.info("Delete all elements anyway");
            }
        }
        return new RI();
    }
}

public class Ex09 {
    public static void main(String[] args) {
        Deletable item = new OutClass().getRI();
        item.delete();
    }
}
