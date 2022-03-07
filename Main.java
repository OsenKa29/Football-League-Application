package com.Classing;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create players for realmadrid first

        FootballPlayer bale = new FootballPlayer("Gerath Bale", 32, 1.85,82, 18, "forward");
        FootballPlayer vinicius = new FootballPlayer("Vinicius Jr", 21, 1.76,73,  20, "forward");
        FootballPlayer benzema = new FootballPlayer("Karim Benzema", 34, 1.85, 81, 9, "forward");
        FootballPlayer hazard = new FootballPlayer("Eden Hazard", 31, 1.75, 74, 7, "forward");
        FootballPlayer marco = new FootballPlayer("Marco Asensio", 26, 1.82, 76, 11, "forward");
        FootballPlayer jovic = new FootballPlayer("Luca Jovic", 24, 1.82, 85, 16, "forward");
        FootballPlayer rodrygo = new FootballPlayer("Rodrygo", 21, 1.74, 64, 21, "forward");
        FootballPlayer diaz = new FootballPlayer("Mariano Diaz", 28, 1.8, 76, 24, "forward");
        FootballPlayer layos = new FootballPlayer("Juan Miguel Latasa Fernandez Layos", 20, 1.91, 80, 29, "forward");


        FootballPlayer modric = new FootballPlayer("Luka Modric", 36, 1.72, 66, 10, "midfielder");
        FootballPlayer camavinga = new FootballPlayer("Eduardo Camavinga", 19, 1.82, 68, 25, "midfielder");
        FootballPlayer kroos = new FootballPlayer("Toni Kroos", 32, 1.83, 76, 8, "midfielder");
        FootballPlayer Isco = new FootballPlayer("Isco", 29, 1.76, 79, 22, "midfielder");
        FootballPlayer casemiro = new FootballPlayer("Casemiro", 30, 1.85, 84, 14, "midfielder");
        FootballPlayer vazquez = new FootballPlayer("Lucas Vazquez", 30, 1.73, 70, 17, "midfielder");
        FootballPlayer valverde = new FootballPlayer("Federico Valverde", 23, 1.82, 78, 15, "midfielder");
        FootballPlayer ceballos = new FootballPlayer("Dani Ceballos", 25, 1.79, 70, 19, "midfielder");
        FootballPlayer gonzalez = new FootballPlayer("Peter Gonzalez", 19, 1.78, 131, 44, "midfielder");


        FootballPlayer marcelo = new FootballPlayer("Marcelo Vieira", 33, 1.74, 75, 12, "defender");
        FootballPlayer alaba = new FootballPlayer("David Alaba", 29, 1.8, 78, 4, "defender");
        FootballPlayer carvajal = new FootballPlayer("Dani Carvajal", 30, 1.73, 74, 2, "defender");
        FootballPlayer militao = new FootballPlayer("Eder Militao", 24, 1.86, 79, 3, "defender");
        FootballPlayer nacho = new FootballPlayer("Nacho", 32, 1.8, 76, 6, "defender");
        FootballPlayer mendy = new FootballPlayer("Ferland Mendy", 26, 1.8, 73, 23, "defender");
        FootballPlayer vallejo = new FootballPlayer("Jesus Vallejo", 25, 1.84, 79, 5, "defender");
        FootballPlayer gutierrez = new FootballPlayer("Miguel Gutierrez", 20, 1.8, 73, 35, "defender");
        FootballPlayer zamora = new FootballPlayer("Rafael Marin Zamora", 19, 1.9, 76, 41, "defender");
        FootballPlayer fuentes = new FootballPlayer("Mario Gila Fuentes", 21, 1.85, 78, 64, "defender");


        FootballPlayer courtois = new FootballPlayer("Thibaut Courtois", 29, 2, 96, 1, "goal keeper");
        FootballPlayer lunin = new FootballPlayer("Andriy Lunin", 23, 1.92, 80, 13, "goal keeper");
        FootballPlayer ribera = new FootballPlayer("Toni Fuidias Ribera", 20, 1.95, 87, 40, "goal keeper");
        FootballPlayer andugar = new FootballPlayer("Luis Federico Lopez Andugar", 20, 1.92, 84, 26, "goal keeper");


        //then create the realmadrid team and start adding the players
        Team<FootballPlayer> realMadrid = new Team<>("Real Madrid");


        realMadrid.addPlayerToTeam(bale);
        realMadrid.addPlayerToTeam(vinicius);
        realMadrid.addPlayerToTeam(benzema);
        realMadrid.addPlayerToTeam(hazard);
        realMadrid.addPlayerToTeam(marco);
        realMadrid.addPlayerToTeam(jovic);
        realMadrid.addPlayerToTeam(rodrygo);
        realMadrid.addPlayerToTeam(diaz);
        realMadrid.addPlayerToTeam(layos);


        realMadrid.addPlayerToTeam(modric);
        realMadrid.addPlayerToTeam(camavinga);
        realMadrid.addPlayerToTeam(kroos);
        realMadrid.addPlayerToTeam(Isco);
        realMadrid.addPlayerToTeam(casemiro);
        realMadrid.addPlayerToTeam(vazquez);
        realMadrid.addPlayerToTeam(valverde);
        realMadrid.addPlayerToTeam(ceballos);
        realMadrid.addPlayerToTeam(gonzalez);


        realMadrid.addPlayerToTeam(marcelo);
        realMadrid.addPlayerToTeam(alaba);
        realMadrid.addPlayerToTeam(carvajal);
        realMadrid.addPlayerToTeam(militao);
        realMadrid.addPlayerToTeam(nacho);
        realMadrid.addPlayerToTeam(mendy);
        realMadrid.addPlayerToTeam(vallejo);
        realMadrid.addPlayerToTeam(gutierrez);
        realMadrid.addPlayerToTeam(zamora);
        realMadrid.addPlayerToTeam(fuentes);


        realMadrid.addPlayerToTeam(courtois);
        realMadrid.addPlayerToTeam(lunin);
        realMadrid.addPlayerToTeam(ribera);
        realMadrid.addPlayerToTeam(andugar);



        System.out.println(realMadrid.getForwardInTeam());
        System.out.println(realMadrid.getMidfielderInTeam());
        System.out.println(realMadrid.getDefenderInTeam());
        System.out.println(realMadrid.getGoalKeeperInTeam());


        //adding players to squad
        realMadrid.setTactic("4 3 3");


        realMadrid.addPlayerToSquad(benzema);
        realMadrid.addPlayerToSquad(vinicius);
        realMadrid.addPlayerToSquad(rodrygo);


        realMadrid.addPlayerToSquad(modric);
        realMadrid.addPlayerToSquad(casemiro);
        realMadrid.addPlayerToSquad(camavinga);


        realMadrid.addPlayerToSquad(mendy);
        realMadrid.addPlayerToSquad(alaba);
        realMadrid.addPlayerToSquad(militao);
        realMadrid.addPlayerToSquad(carvajal);

        realMadrid.addPlayerToSquad(courtois);

        realMadrid.printSquad();



        System.out.println(realMadrid.getNumberOfPlayersInSquad());




    }

}





//Three class:   League, Team, Player



//Player
/*
Every player can be a player of one sport type
 */



