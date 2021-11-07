package com.company.oviktor.booktasks.interfaces;

public interface TossUp {
    boolean toss();
}

interface TossUpFactory {
    TossUp getTossUp();
}
