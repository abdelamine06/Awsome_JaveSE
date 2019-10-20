package com.amine;

public class Main {

    public static void main(String[] args) {
	    League<Team<FootballPlayer>> footBallLeague = new League<>("FIFA");

	    Team<FootballPlayer> foot1Team = new Team<>("foot1Team");
	    Team<FootballPlayer> foot2Team = new Team<>("foot2Team");
	    Team<FootballPlayer> foot3Team = new Team<>("foot3Team");

	    footBallLeague.add(foot1Team);
	    footBallLeague.add(foot2Team);
	    footBallLeague.add(foot3Team);

        System.out.println("*****Ranking******");
        foot1Team.matchResult(foot3Team, 1,3);
        foot1Team.matchResult(foot2Team, 4 ,3);
        foot2Team.matchResult(foot3Team, 3 ,3);

	    footBallLeague.showLeagueTalbe();
    }
}
