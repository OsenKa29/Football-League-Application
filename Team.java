package com.Classing;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name = null;
    private int won = 0;
    private int loss = 0;
    private int tie = 0;
    private int ranking = (won * 3) + (tie * 1);

    private int goalKeeperInTeam = 0;
    private int defenderInTeam = 0;
    private int midfielderInTeam = 0;
    private int forwardInTeam = 0;

    private int goalKeeperInSquad = 0;
    private int defenderInSquad = 0;
    private int midfielderInSquad = 0;
    private int forwardInSquad = 0;


    private int maxDefenderInSquad;
    private int maxMidfielderInSquad;
    private int maxForwardInSquad;

    private String tactic = null;

    private ArrayList<T> players = new ArrayList<>();
    private ArrayList<T> squad = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public boolean setTactic(String tactic) {
        if(tactic == null)
            return false;

        boolean checkTactic = tactic.equals("4 4 2") || tactic.equals("4 3 3") || tactic.equals("4 4 1 1") || tactic.equals("4 2 3 1") || tactic.equals("4 3 2 1") || tactic.equals("5 3 2") ||
        tactic.equals("3 4 3") || tactic.equals("4 3 1 2");
        //check if tactic is valid
        if(!checkTactic){
            System.out.println("Invalid tactic!");
            return false;
        }

        this.tactic = tactic;
        String[] tacticNums = tactic.split(" ");

        this.maxDefenderInSquad = Integer.parseInt(tacticNums[0]);
        this.maxMidfielderInSquad = Integer.parseInt(tacticNums[1]);
        this.maxForwardInSquad = Integer.parseInt(tacticNums[2]);

        squad = new ArrayList<>();

        this.goalKeeperInSquad = 0;
        this.defenderInSquad = 0;
        this.midfielderInSquad = 0;
        this.forwardInSquad = 0;

        return true;
    }

    public boolean addPlayerToTeam(T player) {

        //to check if the players characteristics are valid
        boolean checkName = player.getName() != null, checkAge = (player.getAge() >= 18), checkHeight = player.getHeight() >= 1.46, checkNumber = (player.getNumber() > 0) && (player.getNumber() < 100),
                checkPosition = player.getPosition().equals("forward") || player.getPosition().equals("midfielder") || player.getPosition().equals("defender") || player.getPosition().equals("goal keeper");
        boolean checkValidation = checkAge && checkHeight && checkName && checkNumber && checkPosition;

        //check if player has valid position and player is not null
        if(player == null)
            return false;
        //check if player is already in the team
        else if(players.contains(player)) {
            System.out.println("Player " + player.getName() + " already in team.");
            return false;
        }
        else if(player.isInATeam()) {
            System.out.println("Player is already in a team.");
            return false;
        }
        else if(!checkValidation) {
            System.out.println("Invalid player characteristics. Check your players information.");
            return false;
        }

        players.add(player);
        switch(player.getPosition()) {
            case "goal keeper": this.goalKeeperInTeam++; break;

            case "defender": this.defenderInTeam++; break;

            case "midfielder": this.midfielderInTeam++; break;

            case "forward": this.forwardInTeam++; break;

            default: return  false;
        }

        player.setInATeam(true);
        return true;
       }

    public boolean addPlayerToSquad(T player) {
        if(squad.size() == 11) {
            System.out.println("Squad is full. Can't add any more players.");
            return false;
        }
        else if(!players.contains(player)) {
            System.out.println("No such player exists in team.");
            return false;
        }
        else if(squad.contains(player)) {
            System.out.println("Player " + player.getName() + " already in squad.");
            return false;
        }
        else if(this.tactic == null) {
            System.out.println("First you must set the tactic.");
            return false;
        }


        switch(player.getPosition()) {
            case "goal keeper": if(this.goalKeeperInSquad == 1) {System.out.println("Only 1 goal keeper can be in the squad."); return false;} squad.add(player);
            this.goalKeeperInSquad++; break;

            case "defender": if(this.defenderInSquad == maxDefenderInSquad) {System.out.println("Reached max defender players for this tactic"); return  false;} squad.add(player);
            this.defenderInSquad++; break;

            case "midfielder": if(this.midfielderInSquad == maxMidfielderInSquad) {System.out.println("Reached max midfielder players for this tactic"); return  false;} squad.add(player);
                this.midfielderInSquad++; break;

            case "forward": if(this.forwardInSquad == maxForwardInSquad) {System.out.println("Reached max forward players for this tactic"); return  false;} squad.add(player);
                this.forwardInSquad++; break;

            default: return  false;
        }

        return true;
    }



    public boolean deletePlayerFromTeam(T player) {

        if(!players.contains(player)) {
            System.out.println("No such player exists in the team.");
            return false;
        }

        players.remove(player);
        if(this.squad.contains(player)) this.squad.remove(player);

        switch(player.getPosition()) {
            case "goal keeper": this.goalKeeperInTeam--; break;

            case "defender": this.defenderInTeam--; break;

            case "midfielder": this.midfielderInTeam--; break;

            case "forward": this.forwardInTeam--; break;

            default: return  false;
        }

        return true;
    }

    public boolean deletePlayerFromSquad(T player) {
        if(!squad.contains(player)) {
            System.out.println("No such player exists in squad.");
            return false;
        }

        squad.remove(player);

        switch (player.getPosition()) {
            case "goal keeper": this.goalKeeperInSquad--; break;

            case "defender": this.defenderInSquad--; break;

            case "midfielder": this.midfielderInSquad--; break;

            case "forward": this.forwardInSquad--; break;

            default: return  false;
        }
        return true;
    }

    public void printTeam() {
        if(players.size() == 0) {
            System.out.println("No player exists in the team.");
            return;
        }

        System.out.println("Players in team " + this.name + ": ");
        System.out.println();
        for(T i: players)
            i.printPlayer();
    }

    public void printSquad() {
        if(squad.size() == 0) {
            System.out.println("No player exists in the squad.");
            return;
        }

        System.out.println(this.name + " squad:");
        System.out.println();
        for(T i: squad)
            i.printPlayer();
    }


    @Override
    public int compareTo(Team<T> otherTeam) {

        if(otherTeam.getRanking() > this.ranking)
            return 1;
        else if(otherTeam.getRanking() < this.ranking)
            return -1;

        return 0;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getLoss() {
        return loss;
    }

    public int getTie() {
        return tie;
    }

    public int getRanking() {
        return ranking;
    }

    public int getGoalKeeperInSquad() {
        return goalKeeperInSquad;
    }

    public int getDefenderInSquad() {
        return defenderInSquad;
    }

    public int getMidfielderInSquad() {
        return midfielderInSquad;
    }

    public int getForwardInSquad() {
        return forwardInSquad;
    }

    public int getNumberOfPlayersInSquad() {
        return this.squad.size();
    }

    public String getTactic() {
        return tactic;
    }

    public int getGoalKeeperInTeam() {
        return goalKeeperInTeam;
    }

    public int getDefenderInTeam() {
        return defenderInTeam;
    }

    public int getMidfielderInTeam() {
        return midfielderInTeam;
    }

    public int getForwardInTeam() {
        return forwardInTeam;
    }

    public void matchWin() {
        this.won++;
    }
    public void matchLoose() {
        this.loss++;
    }
    public void matchTie() {
        this.tie++;
    }
}
