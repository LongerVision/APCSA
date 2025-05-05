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
