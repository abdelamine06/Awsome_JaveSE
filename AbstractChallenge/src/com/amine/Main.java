package com.amine;

public class Main {

    public static void main(String[] args) {
        // instanciation
	MyLinkedList list = new MyLinkedList();
	    // call function with object MyLinkedList
	list.traverse(list.getRoot());
	String stringData = "1 2 3 4 5 6 7 8 9 11";

    String[] data = stringData.split(" ");
        for(String s: data)
        {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("6"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2" ));

        list.removeItem(list.getRoot());

    }
}
