package com.packageTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Béjaia", 8, 10);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02"))
        {
            System.out.println("Please pay A02");
        }else{
            System.out.println("Seat is already reserved!");
        }
        Theatre.Seat minSet = Collections.min(seatCopy);
        Theatre.Seat maxSet = Collections.max(seatCopy);
        System.out.println("Min set number is " + minSet.getSeatNumber());
        System.out.println("Mxs set number is " + maxSet.getSeatNumber());
    }

    public static void printList(List<Theatre.Seat> list)
    {
        for(Theatre.Seat seat: list)
        {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.printf("=======================================");
    }
    public static void sortedList(List< ? extends Theatre.Seat> list)
    {
        for( int i=0; i<list.size()-1; i++)
        {
            for(int j = i+1; j<list.size(); j++)
            {
                if(list.get(i).compareTo(list.get(j)) >0 )
                {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
