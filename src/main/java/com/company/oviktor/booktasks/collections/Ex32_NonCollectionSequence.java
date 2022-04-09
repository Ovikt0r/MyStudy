package com.company.oviktor.booktasks.collections;

import com.company.oviktor.booktasks.collections.typeinfo.pets.*;

import java.util.*;


class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class Ex32_NonCollectionSequence extends PetSequence {
    public Iterable<Pet> reversed() {
        return new Iterable<>() {
            public Iterator<Pet> iterator() {
                return new Iterator<>() {
                    int current = pets.length - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public Pet next() {
                        return pets[current--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffledPetList = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffledPetList, new Random(28));
                return shuffledPetList.iterator();
            }
        };
    }

    public static void main(String[] args) {
        Ex32_NonCollectionSequence nc = new Ex32_NonCollectionSequence();
        InterfaceVsIterator.display(nc.reversed().iterator());
        InterfaceVsIterator.display(nc.randomized().iterator());
    }
}