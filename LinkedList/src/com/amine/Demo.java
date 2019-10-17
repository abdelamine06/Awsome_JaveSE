package com.amine;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args){
        LinkedList<String> placeToVisit = new LinkedList<>();

       /* placeToVisit.add("Béjaia");
        placeToVisit.add("Alger");
        placeToVisit.add("adrar");
        placeToVisit.add("sidi belabes");
        placeToVisit.add("oran");
        placeToVisit.add("anabaa");
        placeToVisit.add("tizi ");

        printList(placeToVisit);
        placeToVisit.add(1, "Tamokra");
        printList(placeToVisit);
         placeToVisit.remove(3);
        */
        addInOrder(placeToVisit, "adrar");
        addInOrder(placeToVisit, "bejaia");
        addInOrder(placeToVisit, "alger");
        addInOrder(placeToVisit, "annaba");
        addInOrder(placeToVisit, "oran");
        addInOrder(placeToVisit, "telemcen");
        printList(placeToVisit);
        addInOrder(placeToVisit, "annaba");
        addInOrder(placeToVisit, "tamokra");
        printList(placeToVisit);

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparaison = stringListIterator.next().compareTo(newCity);
            if(comparaison == 0){
                System.out.println(newCity + " is always exist !");
                return false;
            }else if(comparaison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparaison < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }


    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println("Now visiting " + iterator.next());
        }
        System.out.println("===========================");
    }
}
