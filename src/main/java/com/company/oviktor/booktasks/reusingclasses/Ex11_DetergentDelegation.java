package com.company.oviktor.booktasks.reusingclasses;

 class Cleanser{
    private String s = "Cleanser ";
    public void append (String a) {s+=a;}
    public void dilute() {append("dilute() ");}
    public void apply() {append("apply() ");}
    public void scrub() {append("scrub() ");}
    public String toString() {return s;}

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class Ex11_DetergentDelegation extends Cleanser {

     private final Cleanser cleanser = new Cleanser();
     public void append (String a) {
         cleanser.append(a);
     }
     public void dilute(){
         cleanser.append("dilute() ");
     }
     public void apply() {
         cleanser.append("apply() ");
     }
     public String toString(){ return cleanser.toString();}

     public void scrub(){
         append("DetergentDelegation.scrub() ");
         cleanser.scrub();
     }

    public static void main(String[] args) {
        Ex11_DetergentDelegation detergent = new Ex11_DetergentDelegation();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        System.out.println(detergent);
        Cleanser.main(args);
    }
}
