package com.company.oviktor.booktasks.interfaces;

abstract class Abs{
    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public String getSiqence() {
        return siqence;
    }

    public void setSiqence(String siqence) {
        this.siqence = siqence;
    }

    public char getB() {
        return b;
    }

    public void setB(char b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Abs{" +
                "v=" + v +
                ", siqence='" + siqence + '\'' +
                ", b=" + b +
                '}';
    }

    private int v;
    private String siqence;
    private char b;

}

public  class Ex02 {
    public static void main(String[] args) {

        Abs abs = new Abs();


    }
}
