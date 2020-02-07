package controller;

import timer.RoundTimer;

import java.util.Timer;

public class RoundTimerController {

    RoundTimer roundTimer;

    public RoundTimerController(int minutes) {
        this.roundTimer = new RoundTimer(minutes);
    }
}
