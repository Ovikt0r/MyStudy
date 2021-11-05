package com.company.oviktor.booktasks.initializationcleanup;

 class Tank{
     static int counter;
     int id = counter++;
     boolean full;
     public Tank(){
         System.out.println("Tank " + id + " created");
         full = true;
     }
     public void empty(){
         full = false;
     }

     @Override
     protected void finalize() throws Throwable {
         if(full)
             System.out.println("Error: tank " + id + " must be empty at cleanup");
         else
             System.out.println("Tank " + id + " cleaned up ok" );
     }
     public String toString() {
         return "Tank " + id;
     }
 }

public class Ex12 {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();

        System.gc();
        System.runFinalization();

    }
}
