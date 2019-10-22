package com.packageTest;


import java.awt.List;
import java.util.*;

public class Theatre {
    private final String theatreName;
    private ArrayList<Seat> seats = new ArrayList<>();
    // On utilisant HashSet les seats retourné seront pas ordonnée

        public Theatre(String theatreName, int numRows, int seatsPerRows )
        {
            this.theatreName = theatreName;
            int lastRow = 'A' + (numRows -1); // Le -1 parceque on a déja le premier rang qui est le A
                for(char row = 'A'; row<=lastRow ; row++)
                {
                    for(int seatNum =0; seatNum<=seatsPerRows; seatNum++)
                    {
                        Seat seat = new Seat(row + String.format("%02d", seatNum));
                        seats.add(seat);
                    }
                }
        }

    public String getTheatreName() {
        return theatreName;
    }


    public boolean reserveSeat(String seatNumber)
    {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >= 0)
        {
            return seats.get(foundSeat).reserve();
        }else
            {
                System.out.println("There is no seat " + seatNumber);
                return false;
            }
    }

    //for testing
    public void getSeats()
    {
        for(Seat seat: seats)
        {
            System.out.println(seat.getSeatNumber()) ;
        }
    }

    //************************************************************
    // la declaration d'une inner class Seat

    private class  Seat implements Comparable<Seat>
    {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve()
        {
            if(!this.reserved)
            {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " is reserved !");
                return true;
            }else{
                System.out.println("Sory, Seat " + seatNumber + " is already reserved !");
                return false;
            }
        }

        public boolean cancel()
        {
            if(this.reserved)
            {
                this.reserved = false;
                System.out.printf("Seat " +seatNumber+ " is canceled!");
                return true;
            }else{
                return false;
            }
        }


    }

}
