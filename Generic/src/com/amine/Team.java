package com.amine;

import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(Player player)
    {
        if(members.contains(player))
        {
            System.out.println(player.getName() + " is already in this team");
        }else
            {
                // members c'est un array list
                members.add(player);
                System.out.println(player.getName() + " picked for team " + this.name);
                return true;
            }
        return false;
    }

    public int nbrPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore)
    {
        if(ourScore > theirScore){
            won++;
            System.out.printf("We are Win !");
        }else if (ourScore == theirScore)
        {
            tied++;
            System.out.printf("We are in equal result!");
        }else
            {
                lost++;
                System.out.println("We ar lose!");
            }
        played++;
        if(opponent != null)
        {
            opponent.matchResult(null, theirScore, ourScore);
        }

    }
    public int ranking()
    {
        return (won * 2) + tied;
    }
}
