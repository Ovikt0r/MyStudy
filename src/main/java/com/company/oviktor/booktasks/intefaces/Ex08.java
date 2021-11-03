package com.company.oviktor.booktasks.intefaces;



class Sandwich implements FastFood {
        @Override
        public void bread() {
            System.out.println("Cut a piece of bread");
        }

        @Override
        public void cheese() {
            System.out.println("Take a slice of cheese");
        }

        @Override
        public void lettuce() {
        System.out.println("Add some lettuce");
        }

        @Override
        public void bacon() {
            System.out.println("Cut and add two piece of the bacon");
        }

        public void ready() {
            System.out.println("Sandwich is ready");
        }

        public static void main(String[] args) {
            Sandwich sandwich = new Sandwich();
            sandwich.bread();
            sandwich.cheese();
            sandwich.lettuce();
            sandwich.bacon();
            sandwich.ready();
        }
    }
