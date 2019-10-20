package com.amine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();
        item.add(1);
        item.add(2);
        item.add(11);
        item.add(4);
        item.add(8);

        printDoubled(item);
    }
    private static void printDoubled(ArrayList<Integer> n)
    {
        for(int i: n)
        {
            System.out.println( i*2);
        }
    }
}
