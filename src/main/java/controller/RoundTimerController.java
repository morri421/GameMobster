package controller;

import model.PlayerCharacter;
import timer.RoundTimer;

import java.util.Timer;

public class RoundTimerController {

    RoundTimer roundTimer;

    public RoundTimerController(int minutes, PlayerCharacter currentPlayer) {
        this.roundTimer = new RoundTimer(minutes, currentPlayer);
    }
}
