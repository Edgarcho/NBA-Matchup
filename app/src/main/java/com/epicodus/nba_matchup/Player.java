package com.epicodus.nba_matchup;

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
    private String twitter;
    private String shootPosition;
    private String totalYears;
    private String totalSalary;
    private String annualSalary;
    private String playerImage;
    private String teamCity;
    private String team;

    public Player(String firstName, String lastName, String jerseyNumber, String position, String age, String birthDay, String birthCity, String twitter, String shootPosition, String totalYears, String totalSalary, String annualSalary, String playerImage, String teamCity, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.age = age;
        this.birthDay = birthDay;
        this.birthCity = birthCity;
        this.twitter = twitter;
        this.shootPosition = shootPosition;
        this.totalYears = totalYears;
        this.totalSalary = totalSalary;
        this.annualSalary = annualSalary;
        this.playerImage = playerImage;
        this.teamCity = teamCity;
        this.team = team;
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

    public String getTwitter() {
        return twitter;
    }

    public String getShootPosition() {
        return shootPosition;
    }

    public String getTotalYears() {
        return totalYears;
    }

    public String getTotalSalary() {
        return totalSalary;
    }

    public String getAnnualSalary() {
        return annualSalary;
    }

    public String getPlayerImage() {
        return playerImage;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public String getTeam() {
        return team;
    }
}