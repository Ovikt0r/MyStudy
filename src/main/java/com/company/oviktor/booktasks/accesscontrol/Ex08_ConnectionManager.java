package com.company.oviktor.booktasks.accesscontrol;

class Connection {

    private static int count = 1;
    private Connection () {}
    static Connection makeConnection() {
        return new Connection();
    }
    public String toString(){
        return "Connection " + count++;
    }

    public void doSomething() {
        System.out.println("This is how works some method invocation from makeConnection method");
    }
}

public class Ex08_ConnectionManager {

    static int howManyLeft = 5;
    static Connection[] c = new Connection[howManyLeft];

    public static Connection getConnection(){
        if(howManyLeft > 0)
            return c[--howManyLeft];
        else {
            System.out.println("Mo more connections");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Connection.makeConnection());
        System.out.println(Connection.makeConnection());
        System.out.println(Connection.makeConnection());
        System.out.println(Connection.makeConnection());
        System.out.println(Connection.makeConnection());
        Connection.makeConnection().doSomething();

        System.out.println(howManyLeft);
        getConnection();
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(getConnection());

        }
    }

