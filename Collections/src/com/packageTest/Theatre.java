package com.packageTest;


import java.awt.List;
import java.util.*;

public class Theatre {
    private final String theatreName;
    private   ArrayList<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() < seat2.getPrice())
            {
                return -1;
            }else if(seat1.getPrice() > seat2.getPrice())
                {
                    return 1;
                }else
                    {
                        return 0;
                    }

        }
    };

    /**
     * getter theatreName variable
     * @return
     */
    public String getTheatreName() {
        return theatreName;
    }

    /***
     * for testing Getter seats array
     */
    public Collection<Seat> getSeats() {
        return seats;
    }

    /**
     * Constuctor
     * @param theatreName
     * @param numRows
     * @param seatsPerRows
     */
    public Theatre(String theatreName, int numRows, int seatsPerRows )
        {
            this.theatreName = theatreName;
            int lastRow = 'A' + (numRows -1); // Le -1 parceque on a déja le premier rang qui est le A
                for(char row = 'A'; row<=lastRow ; row++)
                {
                    for(int seatNum =0; seatNum<=seatsPerRows; seatNum++)
                    {
                        double price = 12.0;
                        if((row < 'D') && (seatNum >= 4) && (seatNum <= 9))
                        {
                            price = 14.0;
                        }else if((row > 'F') || (seatNum < 4) || (seatNum > 9))
                        {
                            price = 7.00;
                        }
                        Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                         seats.add(seat);
                    }
                }
        }



    public   boolean reserveSeat(String seatNumber)
                {
                    Seat requestedSeat = new Seat(seatNumber, 0);
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


    //************************************************************

    /**
     * la declaration d'une inner class Seat
     */


    public class  Seat implements Comparable<Seat>
    {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        /**
         * Getters
         * @return
         */
        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        /**
         *Getters End
         */

        /**
         * Constructor
         * @param seatNumber
         * @param price
         */
        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
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
