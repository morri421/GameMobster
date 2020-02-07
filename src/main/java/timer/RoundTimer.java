package timer;

import java.util.Timer;

public class RoundTimer {

    Timer timer;

    public RoundTimer(int minutes) {
        this.timer = new Timer();
        timer.schedule(new Round(), minutes * 1000);
    }
}
