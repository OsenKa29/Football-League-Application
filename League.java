package com.Classing;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;


    private ArrayList<T> league = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }



    public boolean addTeamToLeague(T team) {
        this.league.add(team);
        return true;
    }

    public boolean deleteTeamFromLeague() {
        return true;
    }

    public void displayLeagueTable() {
        Collections.sort(league);
        System.out.printf("%-20s%-20s%-20s%-20s%-20s", "Team:", "Win", "Loss", "Tie", "Point");
        for(T i: league) {
            System.out.printf("%-20s%-20d%-20d%-20d%-20d", i.getName(), i.getWon(), i.getLoss(), i.getTie(), i.getRanking());
            System.out.println();
        }
    }


    public boolean playMatch(T team1, T team2) {
        if(team1 == null || team2 == null)
            return false;
        else if(!league.contains(team1) || !league.contains(team2)) {
            System.out.println("Teams from different leagues can't play match in this league.");
            return false;
        }
        else if(team1.getNumberOfPlayersInSquad() < 7) {
            System.out.println("Team " + team1.getName() + " hasn't got enough players in the squad to play.");
            return false;
        }
        else if(team2.getNumberOfPlayersInSquad() < 7) {
            System.out.println("Team " + team2.getName() + " hasn't got enough players in the squad to play.");
            return false;
        }

        //Teams can score from 0 to 9 (for now)
        int score1 = (int)(Math.random() * 10);
        int score2 = (int)(Math.random() * 10);

        System.out.println(team1.getName() + " vs " + team2.getName());
        System.out.println("Result: " + score1 + "-" + score2);
        if(score1 > score2) {
            System.out.println(team1.getName() + " has won the match.");
            team1.matchWin();
            team2.matchLoose();
        }else if(score2 > score1) {
            System.out.println(team2.getName() + " has won has won the match.");
            team2.matchWin();
            team1.matchLoose();
        }else {
            System.out.println("Game ended in a draw.");
            team1.matchTie();
            team2.matchTie();
        }

        return true;
    }

}









