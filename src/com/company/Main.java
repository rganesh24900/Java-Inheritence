package com.company;



public class Main extends VehicleName {
    String typ1 = "Car";
    String typ2 = "Truck";
    String typ3 = "Scooty";
    String typ4 = "Bike" ;
    public static void main(String[] args) {

        Main t1 = new Main();

        System.out.println(t1.veh1+" is a "+t1.typ1);
        System.out.println(t1.veh2+" is a "+t1.typ2);
        System.out.println(t1.veh3+" is a "+t1.typ3);
        System.out.println(t1.veh4+" is a "+t1.typ4);
    }

}
