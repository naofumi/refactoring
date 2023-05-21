package com.example.p150_replace_array_with_object;

public class ScoreBoard {
    private String[][] teamPerformances = new String[3][3];

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        for (String[] performance : scoreBoard.getTeamPerformances()) {
            System.out.println("name    : " + performance[0]);
            System.out.println("  wins  : " + performance[1]);
            System.out.println("  losses: " + performance[2]);
        }
    }

    public ScoreBoard() {
        String[] team1 = new String[3];
        team1[0] = "Liverpool";
        team1[1] = "15";
        team1[2] = "10";
        this.teamPerformances[0] = team1;
        String[] team2 = new String[3];
        team2[0] = "Manchester United";
        team2[1] = "13";
        team2[2] = "12";
        this.teamPerformances[1] = team2;
        String[] team3 = new String[3];
        team3[0] = "Arsenal";
        team3[1] = "11";
        team3[2] = "14";
        this.teamPerformances[2] = team3;
    }

    public String[][] getTeamPerformances() {
        return teamPerformances;
    }
}
