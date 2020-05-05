package com.company;

import java.util.ArrayList;

public class Hotel {
    private static Reservation[] rooms ;

    private static ArrayList<String> waitList;

    public Reservation requestRoom(String guestName){
        int i = -1;
        for(i = 0; i < rooms.length; i++){
            if(rooms[i]==null){
                Reservation reservation = new Reservation(guestName, i);
                return reservation;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Hotel myHotel = new Hotel();
        myHotel.rooms = new Reservation[5];
        myHotel.waitList = new ArrayList<String>();
        String newGuest = "Jack";
        myHotel.rooms[0] = new Reservation("john", 0);
        myHotel.rooms[1] = new Reservation("jim", 1);
        myHotel.rooms[2] = new Reservation("Pete", 2);
        myHotel.rooms[3] = new Reservation("Dan", 3);
        //myHotel.rooms[4] = new Reservation("Mike", 4);

        Reservation newReservation = myHotel.requestRoom(newGuest);


        if(newReservation!=null) {
            myHotel.rooms[newReservation.roomNumber] = newReservation;
            for (Reservation r : myHotel.rooms) {
                if (r != null) {
                    System.out.println(r.guestName + " - " + r.roomNumber);
                }
            }
        }else{
            myHotel.waitList.add(newGuest);
            System.out.println("Waiting list: ");
            for(String name: myHotel.waitList){
                System.out.println(name);
            }
        }

    }
}
