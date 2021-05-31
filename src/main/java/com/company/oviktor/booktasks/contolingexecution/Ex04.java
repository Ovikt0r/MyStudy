package com.company.oviktor.booktasks.contolingexecution;

public class Ex04 {

    public static void main(String[] args) {

        int max = 100;

        for (int i=2; i<max; i++) {
            boolean next = true;
            for(int j=2; j<i; j++) {
                if (i % j == 0) {
                    next = false;
                    break;
                }
            }
             if (next)
                 System.out.print(i + " ");
            }
        }

    }
