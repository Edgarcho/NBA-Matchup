package com.epicodus.nba_matchup.models;

import java.util.ArrayList;

/**
 * Created by Edgar on 4/11/2018.
 */

public class Player {
    private String firstName;
    private String lastName;
    private String jerseyNumber;
    private String position;
    private String age;
    private String birthDay;
    private String birthCity;
    private String birthCountry;
    private String twitter;
    private String playerImage;



    public Player(String firstName, String lastName, String jerseyNumber, String position, String age, String birthDay, String birthCity, String birthCountry, String twitter, String playerImage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.age = age;
        this.birthDay = birthDay;
        this.birthCity = birthCity;
        this.birthCountry = birthCountry;
        this.twitter = twitter;
        this.playerImage = playerImage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getAge() {
        return age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getPlayerImage() {
        return playerImage;
    }

}