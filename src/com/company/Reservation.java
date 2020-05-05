package com.company;

public class Reservation {

    String guestName;
    int roomNumber;

    public Reservation(String guestName, int roomNumber){
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
}
