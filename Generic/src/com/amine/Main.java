package com.amine;

public class Main {

    public static void main(String[] args) {





	Team<FootballPlayer>  Foot1Team = new Team<FootballPlayer>("Foot1Team");
        FootballPlayer amine1 = new FootballPlayer("amine1");

	Team<FootballPlayer>  Foot2Team = new Team<FootballPlayer>("Foot2Team");
        FootballPlayer amine2 = new FootballPlayer("amine2");

	Team<FootballPlayer>  Foot3Team = new Team<FootballPlayer>("Foot3Team");
        FootballPlayer amine3 = new FootballPlayer("amine3");

	Foot1Team.addPlayer(amine1);
	Foot2Team.addPlayer(amine2);
	Foot3Team.addPlayer(amine3);

	Foot1Team.matchResult(Foot3Team, 1,3);
	Foot1Team.matchResult(Foot2Team, 4 ,3);
	Foot2Team.matchResult(Foot3Team, 3 ,3);

	System.out.println("*****Ranking******");
	System.out.println(Foot1Team.getName() + ": " +Foot1Team.ranking());
	System.out.println(Foot3Team.getName() + ": " +Foot3Team.ranking());
	System.out.println(Foot2Team.getName() + ": " +Foot2Team.ranking());
	System.out.println("*****Order*******");
	System.out.println(Foot1Team.getName()+ " : " + Foot1Team.compareTo(Foot2Team));
	System.out.println(Foot1Team.getName()+ " : " + Foot1Team.compareTo(Foot3Team));




    BaseBallPlayer mimo = new BaseBallPlayer("minim");
    SoccerPlayer lamine = new SoccerPlayer("amineeee");

	Team<BaseBallPlayer>  BaseTeam = new Team<BaseBallPlayer>("BaseTeam");
	BaseTeam.addPlayer(mimo);

	Team<SoccerPlayer> soccerTeam = new Team<SoccerPlayer>("SoccerTeam");
    soccerTeam.addPlayer(lamine);

        /***
         * ça va pas marcher au moment ou on definer dans Team que le T extends Player juste
         *  Team<String> brokenType = new Team<String>("Borken type");
         *     brokenType.addPlayer(brokenType);
         */


    }
}
