package timer;

import model.PlayerCharacter;

import java.util.TimerTask;

public class Round extends TimerTask {

    PlayerCharacter player;

    public Round(PlayerCharacter player) {
        this.player = player;
    }

    public void run() {
        player.passedARound();
    }
}
