package com.amine;

import java.util.ArrayList;

// en faisant T extends Player en empeches l'utilisation d'autres type comme le string ou le int
// ça sera juste des objets de type Player
public class Team<T extends Player> implements Comparable<Team> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player)
    {
        if(members.contains(player))
        {
            // caster le type de l'objet player à Player
            System.out.println( player.getName() + " is already in this team \n");
        }else
            {
                // members c'est un array list
                members.add(player);
                System.out.println(player.getName() + " picked for team " + this.name +"\n");
                return true;
            }
        return false;
    }

    public int nbrPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    {
        if(ourScore > theirScore){
            won++;
            System.out.printf(this.name + " We are Win ! \n");
        }else if (ourScore == theirScore)
        {
            tied++;
            System.out.printf( this.name+ " We are in equal result! \n");
        }else
            {
                lost++;
                System.out.println(this.name+" We ar lose! \n");
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

    @Override
    public int compareTo(Team team) {
        if(this.ranking()> team.ranking())
        {
            return 1;
        }else if(this.ranking() < team.ranking())
        {
            return -1;
        }else
            {
                return 0;
            }
    }
}
