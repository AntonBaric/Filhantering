package com.company;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private int age;
    private int nbr;
    private String club;

    public Player(String name, int age, int nbr, String club) {
        this.name = name;
        this.age = age;
        this.nbr = nbr;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
