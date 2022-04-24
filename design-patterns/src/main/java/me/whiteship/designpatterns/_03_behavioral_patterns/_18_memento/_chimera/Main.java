package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._chimera;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.setTeamAScore(123);
        game.setTeamBScore(345);

        GameSave save = game.save();

        game.setTeamAScore(555);
        game.setTeamBScore(999);

        game.restore(save);

        System.out.println(game.getTeamAScore());
        System.out.println(game.getTeamBScore());

    }
}
