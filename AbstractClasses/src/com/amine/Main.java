package com.amine;

public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("MIMOUCH");
	dog.breathe();
	dog.eat();
		/**
		 * une classe abstraite ne peut etre instancier
		 */
	Parout parout = new Parout("amine");
	parout.eat();
	parout.breathe();
	parout.fly();

	Penguin penguin = new Penguin("Impra");
	penguin.fly();

    }
}
