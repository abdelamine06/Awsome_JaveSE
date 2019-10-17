package com.amine;

public class Main {

    public static void main(String[] args) {
	    ITelephone timsPhone; // si je veux implementer plusieurs classe avec cette interface je doit mettre un type interface
		// sinon ça va marcher avec le nom de la classe si on a juste une seule class
	    timsPhone = new DeskPhone(123456);

	    timsPhone.callPhone(123456);
	    timsPhone.powerOn();
	    timsPhone.callPhone(123456);
	    timsPhone.answer();

	    timsPhone = new MobilePhone(345678);
	  //  timsPhone.powerOn();
	    timsPhone.callPhone(345678);
	    timsPhone.answer();
    }
}
