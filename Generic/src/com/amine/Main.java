package com.amine;

public class Main {

    public static void main(String[] args) {
	Player amine = new FootballPlayer("amine");
	Player mimo = new BaseBallPlayer("minim");
	Player amineee = new SoccerPlayer("amineeee");

	Team  abdelamine = new Team("abdelamine");
	abdelamine.addPlayer(amine);
	abdelamine.addPlayer(mimo);
	abdelamine.addPlayer(amineee);

        System.out.printf("" + abdelamine.nbrPlayers());

    }
}
