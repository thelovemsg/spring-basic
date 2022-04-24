package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._chimera;

public final class GameSave {

    private final int teamAScore;

    private final int teamBScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.teamBScore = blueTeamScore;
        this.teamAScore = redTeamScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public int getTeamAScore() {
        return teamAScore;
    }
}
