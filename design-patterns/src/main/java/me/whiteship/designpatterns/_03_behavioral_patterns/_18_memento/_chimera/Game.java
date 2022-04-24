package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._chimera;

public class Game {

    private int teamAScore;
    private int teamBScore;

    public int getTeamAScore() {
        return teamAScore;
    }

    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    public GameSave save() {
        return new GameSave(this.teamAScore, this.teamBScore);
    }

    public void restore(GameSave gameSave){
        this.teamAScore = gameSave.getTeamAScore();
        this.teamBScore = gameSave.getTeamBScore();
    }

}
