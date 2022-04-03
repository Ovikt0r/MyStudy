package com.company.oviktor.booktasks.collections;

import com.company.oviktor.booktasks.collections.typeinfo.pets.*;
import java.util.*;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class Ex30_NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        Ex30_NonCollectionSequence nc = new Ex30_NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}