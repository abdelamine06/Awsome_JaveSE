package com.packageTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Béjaia", 8, 10);

        if(theatre.reserveSeat("A02"))
        {
            System.out.println("Please pay A02");
        }else{
            System.out.println("Seat is already reserved!");
        }
        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("BOO", 13));
        priceSeat.add(theatre.new Seat("A00", 13));
        Collections.sort(priceSeat,theatre.PRICE_ORDER);
        printList(priceSeat);
    }

    public static void printList(List<Theatre.Seat> list)
    {
        for(Theatre.Seat seat: list)
        {
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.printf("=======================================");
    }

}
