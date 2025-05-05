/*******************************************************************************
 * *
 * *
 * IMPORTANT: READ BEFORE DOWNLOADING, COPYING AND USING. *
 * *
 * *
 * Copyright [2016~2025] [Longer Vision Technology (Canada) Ltd.] *
 * Licensed under the Educational Community License, Version 2.0 *
 * you may not use this file except in compliance with the License. *
 * *
 * *
 * "AP Computer Science A is an Advanced Placement course, an introductory *
 * college-level computer science course offered by the College Board. It *
 * focuses on object-oriented programming using the Java language, teaching *
 * students to design, implement, and test computer programs, as well as
 * explore concepts like data structures and algorithms. ." -- Cited from *
 * https://apstudents.collegeboard.org/courses/ap-computer-science-a *
 * *
 * *
 * All APCSA Free Response code is distributed on an "AS IS" BASIS, WITHOUT *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. *
 * And all rights are reserved to Longer Vision Technology (Canada) Ltd. *
 * You can use it, modify it, test the result, etc., but you are NOT *
 * allowed to redistributed it. However, you are encouraged to advertise *
 * for Longer Vision Technology (LVT). *
 * *
 * *
 * For those young talents who are interested in LVT course design, *
 * particularly, CCC Senior level competition, CCO (Canadian Computing *
 * Olympiad), AP (Advanced Placement), etc., please do NOT hesitate to *
 * find the contact via our website at: http://www.longervision.ca . *
 * *
 * Version: 1.0.0 *
 * Author: Pei, Jia *
 * Contact: jiapei@longervision.com *
 * URL: http://www.longervision.ca *
 * Create Date: 2025-04-30 *
 *******************************************************************************/

public class Scoreboard {
    private String nameTeam1;
    private String nameTeam2;
    private int pointsTeam1;
    private int pointsTeam2;
    private boolean team1Or2; // true/false: team1/team2

    public Scoreboard(String name1, String name2) {
        this.nameTeam1 = name1;
        this.nameTeam2 = name2;
        this.pointsTeam1 = 0;
        this.pointsTeam2 = 0;
        this.team1Or2 = true;
    }

    public void recordPlay(int points) {
        if (this.team1Or2) {
            if (points > 0)
                this.pointsTeam1 += points;
            else
                this.team1Or2 = false;
        } else {
            if (points > 0)
                this.pointsTeam2 += points;
            else
                this.team1Or2 = true;
        }
    }

    public String getScore() {
        return this.team1Or2 ? this.pointsTeam1 + "-" + this.pointsTeam2 + "-" + this.nameTeam1
                : this.pointsTeam1 + "-" + this.pointsTeam2 + "-" + this.nameTeam2;
    }

    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(3);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore();
        System.out.println(info);
        info = game.getScore();
        System.out.println(info);
    }

}
