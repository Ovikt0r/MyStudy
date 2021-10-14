package com.company.oviktor.booktasks.polimorphism;


class AlertStatus {
    public String getStatus() {
        return "None";
    }
}

class RedAlertStatus extends AlertStatus {
    public String getStatus() {
        return "Alert status is RED";
    }
}

class GreenAlertStatus extends AlertStatus {
    public String getStatus() {
        return "Alert status is GREEN";
    }
}

class YellowAlertStatus extends AlertStatus {
    public String getStatus() {
        return "Alert status is YELLOW";
    }
}


class StarShip {

    private AlertStatus alertStatus = new RedAlertStatus();

    public void setStatus(AlertStatus istatus) {
        alertStatus = istatus;
    }

    public String toString() {
        return alertStatus.getStatus();
    }
}

public class Ex17_Transmogrify {

    public static void main(String[] args) {
        StarShip starShip = new StarShip();
        System.out.println(starShip);
        starShip.setStatus(new GreenAlertStatus());
        System.out.println(starShip);
        starShip.setStatus(new YellowAlertStatus());
        System.out.println(starShip);
    }
}
