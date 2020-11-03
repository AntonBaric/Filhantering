package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // FileUtils.writeToFile();
        // FileUtils.writeToFile();

        /* List<Player> listOfPlayers = new ArrayList<>();
        listOfPlayers.add(new Player("Mandžukić", 33, 9, "Dinamo Zagreb"));
        listOfPlayers.add(new Player("Modrić", 34, 12, "Dinamo Zagreb"));
        listOfPlayers.add(new Player("Ibrahimovic", 35, 10, "Malmö FF"));
        listOfPlayers.add(new Player("Klose", 36, 14, "Bayern München"));

        FileUtils.writeObject(listOfPlayers); */

        List<Player> allPlayers = (List<Player>) FileUtils.readObject("Player.ser");
        System.out.println(allPlayers.toString());
    }
}
