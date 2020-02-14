package timer;

import model.PlayerCharacter;

import java.util.Timer;

public class RoundTimer {

    Timer timer;

    public RoundTimer(int minutes, PlayerCharacter player) {
        this.timer = new Timer();
        timer.schedule(new Round(player), minutes * 1000);
    }
}
