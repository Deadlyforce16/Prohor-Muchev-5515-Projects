package mypack;

import java.util.*;

class Player 
{
    private String name;
    private int points;
    private String team;

    public Player(String name, String team) 
    {
        this.name = name;
        this.team = team;
        this.points = (int) (Math.random() * 100) % 50;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getPoints() 
    {
        return points;
    }

    public void setPoints(int points) 
    {
        this.points = points;
    }

    public String getTeam() 
    {
        return team;
    }

    public static Player MVP(Player[] players) 
    {
        Player mvp = players[0];
        for (Player player : players) 
        {
            if (player.getPoints() > mvp.getPoints()) 
            {
                mvp = player;
            }
        }
        return mvp;
    }
}

public class Assignment2 
{
    public static void main(String[] args) 
    {
        Player[] lakers = new Player[5];
        Player[] heat = new Player[5];

        for (int i = 0; i < 5; i++) 
        {
            lakers[i] = new Player("Player_" + i, "L.A. Lakers");
            heat[i] = new Player("Player_" + i, "Miami Heat");
        }

        int lakersPoints = 0, heatPoints = 0;

        System.out.println("L.A. Lakers");
        for (Player player : lakers) 
        {
            System.out.println(player.getName() + " " + player.getPoints() + " points");
            lakersPoints += player.getPoints();
        }

        System.out.println("Miami Heat");
        for (Player player : heat) 
        {
            System.out.println(player.getName() + " " + player.getPoints() + " points");
            heatPoints += player.getPoints();
        }

        System.out.println("Miami Heat: L.A. Lakers = " + heatPoints + " : " + lakersPoints);
        
        String winnerTeam = lakersPoints > heatPoints ? "L.A. Lakers" : "Miami Heat";
        System.out.println("The winner is " + winnerTeam);

        Player[] allPlayers = Arrays.copyOf(lakers, lakers.length + heat.length);
        System.arraycopy(heat, 0, allPlayers, lakers.length, heat.length);

        Player mvp = Player.MVP(allPlayers);
        
        System.out.println("MVP is " + mvp.getName() + " from " + mvp.getTeam() + " with " + mvp.getPoints() + " points");
    }
}