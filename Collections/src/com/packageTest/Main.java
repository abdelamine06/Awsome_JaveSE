package com.packageTest;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Béjaia", 8, 10);
        theatre.getSeats();

        theatre.reserveSeat("B09");
        theatre.reserveSeat("B09");
    }
}
