package com.Classing;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Create players for realmadrid first

        FootballPlayer bale = new FootballPlayer("Gerath Bale", 32, 1.85,82, 18, "forward");
        FootballPlayer vinicius = new FootballPlayer("Vinicius Jr", 21, 1.76,73,  20, "forward");
        FootballPlayer benzema = new FootballPlayer("Karim Benzema", 34, 1.85, 81, 9, "forward");
        FootballPlayer hazard = new FootballPlayer("Eden Hazard", 31, 1.75, 74, 7, "forward");
        FootballPlayer asensio = new FootballPlayer("Marco Asensio", 26, 1.82, 76, 11, "forward");
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
        realMadrid.addPlayerToTeam(asensio);
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






        //Now the same things for bayern munih team

        //create players
        FootballPlayer lewandowski = new FootballPlayer("Robert Lewandowski", 33, 1.85, 81, 9, "forward");
        FootballPlayer müller = new FootballPlayer("Thomas Müller", 32, 1.85, 76, 25, "forward");
        FootballPlayer sane = new FootballPlayer("Leroy Sane", 26, 1.83, 80, 19, "forward");
        FootballPlayer maxim = new FootballPlayer("Maxim Choupo-Moting", 32, 1.91, 84, 13, "forward");
        FootballPlayer tillman = new FootballPlayer("Malik Tillman", 19, 1.91, 84, 13, "forward");


        FootballPlayer davies = new FootballPlayer("Alphonso Davies", 21, 1.83, 75, 19, "midfielder");
        FootballPlayer kimmich = new FootballPlayer("Joshua Kimmich", 26, 1.77, 75, 6, "midfielder");
        FootballPlayer gnabry = new FootballPlayer("Serge Gnabry", 26, 1.76, 77, 7, "midfielder");
        FootballPlayer musiala = new FootballPlayer("Jamal Musiala", 19, 1.83, 70, 42, "midfielder");
        FootballPlayer goretzka = new FootballPlayer("Leon Goretzka", 27, 1.89, 82, 8, "midfielder");
        FootballPlayer tolisso = new FootballPlayer("Corentin Tolisso", 27, 1.81, 81, 24, "midfielder");
        FootballPlayer sabitzer = new FootballPlayer("Marcel Sabitzer", 27, 1.78, 76, 18, "midfielder");
        FootballPlayer roca = new FootballPlayer("Marc Roca", 25, 1.84, 77, 22, "midfielder");
        FootballPlayer coman = new FootballPlayer("Kingsley Coman", 25, 1.8, 76, 11, "midfielder");



        FootballPlayer süle = new FootballPlayer("Niklas Süle", 26, 1.95, 99, 4, "defender");
        FootballPlayer richards = new FootballPlayer("Omar Richards", 24, 1.74, 70, 3, "defender");
        FootballPlayer hernandez = new FootballPlayer("Lucas Hernandez", 26, 1.84, 79, 21, "defender");
        FootballPlayer pavard = new FootballPlayer("Benjamin Pavard", 25, 1.86, 81, 5, "defender");
        FootballPlayer sarr = new FootballPlayer("Bouna Sarr", 30, 1.77, 69, 20, "defender");
        FootballPlayer kouassi = new FootballPlayer("Tanguy Nianzou Kouassi", 19, 1.91, 85, 23, "defender");
        FootballPlayer stanisic = new FootballPlayer("Josip Stanisic", 21, 1.87, 77, 44, "defender");
        FootballPlayer upamecano = new FootballPlayer("Dayot Upamecano", 23, 1.86, 90, 2, "defender");


        FootballPlayer neuer = new FootballPlayer("Manuel Neuer", 35, 1.93, 93, 1, "goal keeper");
        FootballPlayer ulreich = new FootballPlayer("Sven Ulreich", 33, 1.92, 84, 26, "goal keeper");
        FootballPlayer früchtl = new FootballPlayer("Christian Früchtl", 22, 1.93, 84, 36, "goal keeper");



        //create team
        Team<FootballPlayer> bayernMünchen = new Team<>("FC Bayern München");

        //add players to team
        bayernMünchen.addPlayerToTeam(lewandowski);
        bayernMünchen.addPlayerToTeam(müller);
        bayernMünchen.addPlayerToTeam(sane);
        bayernMünchen.addPlayerToTeam(coman);
        bayernMünchen.addPlayerToTeam(maxim);
        bayernMünchen.addPlayerToTeam(tillman);


        bayernMünchen.addPlayerToTeam(davies);
        bayernMünchen.addPlayerToTeam(kimmich);
        bayernMünchen.addPlayerToTeam(gnabry);
        bayernMünchen.addPlayerToTeam(musiala);
        bayernMünchen.addPlayerToTeam(goretzka);
        bayernMünchen.addPlayerToTeam(tolisso);
        bayernMünchen.addPlayerToTeam(sabitzer);
        bayernMünchen.addPlayerToTeam(roca);


        bayernMünchen.addPlayerToTeam(süle);
        bayernMünchen.addPlayerToTeam(richards);
        bayernMünchen.addPlayerToTeam(hernandez);
        bayernMünchen.addPlayerToTeam(pavard);
        bayernMünchen.addPlayerToTeam(sarr);
        bayernMünchen.addPlayerToTeam(kouassi);
        bayernMünchen.addPlayerToTeam(stanisic);
        bayernMünchen.addPlayerToTeam(upamecano);


        bayernMünchen.addPlayerToTeam(neuer);
        bayernMünchen.addPlayerToTeam(ulreich);
        bayernMünchen.addPlayerToTeam(früchtl);



        //add players to squad

        bayernMünchen.setTactic("3 5 2");


        bayernMünchen.addPlayerToSquad(lewandowski);
        bayernMünchen.addPlayerToSquad(müller);


        bayernMünchen.addPlayerToSquad(gnabry);
        bayernMünchen.addPlayerToSquad(musiala);
        bayernMünchen.addPlayerToSquad(coman);
        bayernMünchen.addPlayerToSquad(davies);
        bayernMünchen.addPlayerToSquad(kimmich);


        bayernMünchen.addPlayerToSquad(pavard);
        bayernMünchen.addPlayerToSquad(süle);
        bayernMünchen.addPlayerToSquad(upamecano);


        bayernMünchen.addPlayerToSquad(ulreich);





        //paris saint german


        FootballPlayer messi = new FootballPlayer("Lionel Messi", 34, 1.69, 67, 30, "forward");
        FootballPlayer mbappe = new FootballPlayer("Kylian Mbappe", 23, 1.78, 73, 7, "forward");
        FootballPlayer neymar = new FootballPlayer("Neymar", 30, 1.75, 68, 10, "forward");
        FootballPlayer icardi = new FootballPlayer("Mauro Icardi", 29, 1.81, 75, 9, "forward");


        FootballPlayer xavi = new FootballPlayer("Xavi Simons", 18, 1.68, 58, 34, "midfielder");
        FootballPlayer diMaria = new FootballPlayer("Angel Di Maria", 34, 1.8, 75, 11, "midfielder");
        FootballPlayer veratti = new FootballPlayer("Marco Veratti", 29, 1.65, 60, 6, "midfielder");
        FootballPlayer wijnaldum = new FootballPlayer("Georginio Wijnaldum", 31, 1.75, 74, 18, "midfielder");
        FootballPlayer pereira = new FootballPlayer("Danilo Pereira", 30, 1.9, 83, 15, "midfielder");
        FootballPlayer paredes = new FootballPlayer("Leandro Paredes", 27, 1.8, 75, 8, "midfielder");
        FootballPlayer draxler = new FootballPlayer("Julian Draxler", 28, 1.85, 72, 23, "midfielder");
        FootballPlayer michut = new FootballPlayer("Edouard Michut", 19, 1.78, 68, 38, "midfielder");
        FootballPlayer gueye = new FootballPlayer("Idrissa Gueye", 32, 1.74, 66, 27, "midfielder");
        FootballPlayer herrera = new FootballPlayer("Ander Herrera", 32, 1.82, 73, 21, "midfielder");
        FootballPlayer ebimbe = new FootballPlayer("Eric Ebimbe", 21, 1.83, 66, 28, "midfielder");


        FootballPlayer ramos = new FootballPlayer("Sergio Ramos", 35, 1.84, 82, 4, "defender");
        FootballPlayer hakimi = new FootballPlayer("Achraf Hakimi", 23, 1.81, 73, 2, "defender");
        FootballPlayer mendes = new FootballPlayer("Nuno Mendes", 19, 1.76, 70, 25, "defender");
        FootballPlayer marquinhos = new FootballPlayer("Marquinhos", 27, 1.83, 79, 5, "defender");
        FootballPlayer kehrer = new FootballPlayer("Thilo Kehrer", 25, 1.86, 76, 24, "defender");
        FootballPlayer kimpembe = new FootballPlayer("Presnel Kimpembe", 26, 1.83, 77, 3, "defender");
        FootballPlayer bernat = new FootballPlayer("Juan Bernat", 29, 1.77, 67, 14, "defender");
        FootballPlayer diallo = new FootballPlayer("Abdou Diallo", 25, 1.87, 79, 22, "defender");
        FootballPlayer kurzawa = new FootballPlayer("Layvin Kurzawa", 29, 1.82, 74, 20, "defender");
        FootballPlayer dagba = new FootballPlayer("Colin Dagba", 23, 1.7, 62, 17, "defender");


        FootballPlayer donnarumma = new FootballPlayer("Gianluigi Donnarumma", 23, 1.96, 90, 50, "goal keeper");
        FootballPlayer navas = new FootballPlayer("Keylor Navas", 80, 1.85, 80, 1, "goal keeper");
        FootballPlayer letellier = new FootballPlayer("Alexandre Letellier", 31, 1.93, 93, 60, "goal keeper");
        FootballPlayer innocent = new FootballPlayer("Garissone Innocent", 21, 1.92, 40, 66, "goal keeper");




        //create team
        Team<FootballPlayer> parisSaintGerman = new Team<>("Paris Saint-Germain F.C.");

        //add players to team
        parisSaintGerman.addPlayerToTeam(messi);
        parisSaintGerman.addPlayerToTeam(mbappe);
        parisSaintGerman.addPlayerToTeam(neymar);
        parisSaintGerman.addPlayerToTeam(icardi);


        parisSaintGerman.addPlayerToTeam(xavi);
        parisSaintGerman.addPlayerToTeam(diMaria);
        parisSaintGerman.addPlayerToTeam(veratti);
        parisSaintGerman.addPlayerToTeam(wijnaldum);
        parisSaintGerman.addPlayerToTeam(pereira);
        parisSaintGerman.addPlayerToTeam(paredes);
        parisSaintGerman.addPlayerToTeam(draxler);
        parisSaintGerman.addPlayerToTeam(michut);
        parisSaintGerman.addPlayerToTeam(gueye);
        parisSaintGerman.addPlayerToTeam(herrera);
        parisSaintGerman.addPlayerToTeam(ebimbe);


        parisSaintGerman.addPlayerToTeam(ramos);
        parisSaintGerman.addPlayerToTeam(hakimi);
        parisSaintGerman.addPlayerToTeam(mendes);
        parisSaintGerman.addPlayerToTeam(marquinhos);
        parisSaintGerman.addPlayerToTeam(kehrer);
        parisSaintGerman.addPlayerToTeam(kimpembe);
        parisSaintGerman.addPlayerToTeam(bernat);
        parisSaintGerman.addPlayerToTeam(diallo);
        parisSaintGerman.addPlayerToTeam(kurzawa);
        parisSaintGerman.addPlayerToTeam(dagba);


        parisSaintGerman.addPlayerToTeam(donnarumma);
        parisSaintGerman.addPlayerToTeam(navas);
        parisSaintGerman.addPlayerToTeam(letellier);
        parisSaintGerman.addPlayerToTeam(innocent);



        //add players to squad

        parisSaintGerman.setTactic("4 3 3");


        parisSaintGerman.addPlayerToSquad(mbappe);
        parisSaintGerman.addPlayerToSquad(messi);
        parisSaintGerman.addPlayerToSquad(neymar);


        parisSaintGerman.addPlayerToSquad(paredes);
        parisSaintGerman.addPlayerToSquad(pereira);
        parisSaintGerman.addPlayerToSquad(veratti);


        parisSaintGerman.addPlayerToSquad(mendes);
        parisSaintGerman.addPlayerToSquad(kimpembe);
        parisSaintGerman.addPlayerToSquad(marquinhos);
        parisSaintGerman.addPlayerToSquad(hakimi);


        parisSaintGerman.addPlayerToSquad(donnarumma);

        
        
        
        
        
        //liverpool


        FootballPlayer salah = new FootballPlayer("Mohamed Salah", 29, 1.75, 73, 11, "forward");
        FootballPlayer díaz = new FootballPlayer("Luis Díaz", 25, 1.78, 65, 23, "forward");
        FootballPlayer mane = new FootballPlayer("Sadio Mané", 29, 1.75, 69, 10, "forward");
        FootballPlayer minamino = new FootballPlayer("Takumi Minamino", 27, 1.74, 67, 18, "forward");
        FootballPlayer jota = new FootballPlayer("Diogo Jota", 25, 1.78, 70, 20, "forward");
        FootballPlayer firmino = new FootballPlayer("Roberto Firmino", 30, 1.81, 76, 9, "forward");
        FootballPlayer origi = new FootballPlayer("Divock Origi", 26, 1.85, 76, 27, "forward");

       
        FootballPlayer elliott = new FootballPlayer("Harvey Elliott", 18, 1.7, 67, 67, "midfielder");
        FootballPlayer alcantara = new FootballPlayer("Thiago Alcântara", 30, 1.74, 71, 6, "midfielder");
        FootballPlayer morton = new FootballPlayer("Tyler Morton", 19, 1.75, 84, 80, "midfielder");
        FootballPlayer keïta = new FootballPlayer("Naby Keïta", 27, 1.72, 64, 8, "midfielder");
        FootballPlayer chamberlain = new FootballPlayer("Alex Oxlade-Chamberlain", 28, 1.8, 70, 15, "midfielder");
        FootballPlayer henderson = new FootballPlayer("Jordan Henderson", 31, 1.82, 80, 14, "midfielder");
        FootballPlayer fabinho = new FootballPlayer("Fabinho", 28, 1.88, 78, 3, "midfielder");
        FootballPlayer milner = new FootballPlayer("James Milner", 36, 1.75, 70, 7, "midfielder");
        FootballPlayer jones = new FootballPlayer("Curtis Jones", 21, 1.85, 75, 17, "midfielder");
        FootballPlayer bradley = new FootballPlayer("Conor Bradley", 18, 1.81, 64, 84, "midfielder");
        
        
        FootballPlayer dijk = new FootballPlayer("Virgil van Dijk", 30, 1.93, 92, 4, "defender");
        FootballPlayer arnold = new FootballPlayer("Trent Alexander-Arnold", 23, 1.75, 69, 66, "defender");
        FootballPlayer konate = new FootballPlayer("Ibrahima Konaté", 22, 1.94, 95, 5, "defender");
        FootballPlayer tsimikas = new FootballPlayer("Konstantinos Tsimikas", 25, 1.78, 70, 21, "defender");
        FootballPlayer robertson = new FootballPlayer("Andrew Robertson", 28, 1.78, 64, 26, "defender");
        FootballPlayer matip = new FootballPlayer("Joël Matip", 30, 1.95, 90, 32, "defender");
        FootballPlayer gomez = new FootballPlayer("Joe Gomez", 24, 1.88, 77, 12, "defender");


        FootballPlayer kelleher = new FootballPlayer("Caoimhin Kelleher", 23, 1.88, 75, 62, "goalkeeper");
        FootballPlayer becker = new FootballPlayer("Alisson Becker", 29, 1.91, 91, 1, "goalkeeper");
        FootballPlayer karius = new FootballPlayer("Loris Karius", 28, 1.89, 90, 22, "goalkeeper");

        
        
        Team<FootballPlayer> liverpool = new Team<>("Liverpool F.C.");

        //add players to team
        liverpool.addPlayerToTeam(salah);
        liverpool.addPlayerToTeam(diaz);
        liverpool.addPlayerToTeam(mane);
        liverpool.addPlayerToTeam(minamino);
        liverpool.addPlayerToTeam(jota);
        liverpool.addPlayerToTeam(firmino);
        liverpool.addPlayerToTeam(origi);


        liverpool.addPlayerToTeam(elliott);
        liverpool.addPlayerToTeam(alcantara);
        liverpool.addPlayerToTeam(morton);
        liverpool.addPlayerToTeam(keita);
        liverpool.addPlayerToTeam(chamberlain);
        liverpool.addPlayerToTeam(henderson);
        liverpool.addPlayerToTeam(fabinho);
        liverpool.addPlayerToTeam(milner);
        liverpool.addPlayerToTeam(jones);
        liverpool.addPlayerToTeam(bradley);

        liverpool.addPlayerToTeam(dijk);
        liverpool.addPlayerToTeam(arnold);
        liverpool.addPlayerToTeam(konate);
        liverpool.addPlayerToTeam(tsimikas);
        liverpool.addPlayerToTeam(robertson);
        liverpool.addPlayerToTeam(matip);
        liverpool.addPlayerToTeam(gomez);


        liverpool.addPlayerToTeam(kelleher);
        liverpool.addPlayerToTeam(becker);
        liverpool.addPlayerToTeam(karius);
        
        
        
        //add players to squad

        liverpool.setTactic("4 3 3");


        liverpool.addPlayerToSquad(salah);
        liverpool.addPlayerToSquad(mane);
        liverpool.addPlayerToSquad(luisDiaz);


        liverpool.addPlayerToSquad(keita);
        liverpool.addPlayerToSquad(fabinho);
        liverpool.addPlayerToSquad(henderson);


        liverpool.addPlayerToSquad(arnold);
        liverpool.addPlayerToSquad(matip);
        liverpool.addPlayerToSquad(dijk);
        liverpool.addPlayerToSquad(robertson);


        liverpool.addPlayerToSquad(becker);

        
        
        
        //barcelona

        FootballPlayer Dembele = new FootballPlayer("Ousmane Dembélé", 24, 1.78, 67, 7, "forward");
        FootballPlayer aubameyang = new FootballPlayer("Pierre-Emerick Aubameyang", 32, 1.87, 80, 25, "forward");
        FootballPlayer torres = new FootballPlayer("Ferran Torres", 22, 1.84, 77, 19, "forward");
        FootballPlayer traore = new FootballPlayer("Adama Traoré", 26, 1.78, 86, 11, "forward");
        FootballPlayer fati = new FootballPlayer("Ansu Fati", 19, 1.78, 66, 10, "forward");
        FootballPlayer depay = new FootballPlayer("Memphis Depay", 28, 1.76, 78, 9, "forward");
        FootballPlayer ezzalzouli = new FootballPlayer("Abde Ezzalzouli", 20, 1.77, 65, 33, "forward");
        FootballPlayer jong = new FootballPlayer("Luuk de Jong", 31, 1.88, 86, 17, "forward");
        FootballPlayer akhomach = new FootballPlayer("Ilias Akhomach", 17, 1.75, 70, 37, "forward");
        FootballPlayer braithwaite = new FootballPlayer("Martin Braithwaite", 30, 1.77, 73, 12, "forward");
        FootballPlayer pedrola = new FootballPlayer("Estanis Pedrola", 18, 1.85, 72, 39, "forward");

        
        
        
    }

}





//Three class:   League, Team, Player



//Player
/*
Every player can be a player of one sport type
 */



