package controller;

import com.sun.xml.internal.bind.v2.TODO;
import model.PlayerCharacter;

import java.util.ArrayList;
import java.util.Iterator;

public class MobPartyController {  //TODO: You need to split MobPartyController into another class that is a MobCreator and remove the add/remove methods

    private ArrayList<PlayerCharacter> party;
    private int minutesBetweenRounds;

    public MobPartyController(int minutesBetweenRounds) {
        this.party = new ArrayList<PlayerCharacter>();
        this.minutesBetweenRounds = minutesBetweenRounds;
    }

    public ArrayList<PlayerCharacter> getParty() {
        return party;
    }

    public void addMemberToParty(String name) {
        PlayerCharacter playerCharacter = new PlayerCharacter(name);
        party.add(playerCharacter);
    }

    public void removeMemberFromParty(String name) {
        Iterator playerIterator = party.iterator();

        while (playerIterator.hasNext()) {
            PlayerCharacter character = (PlayerCharacter) playerIterator.next();
            if (character.getName().equals(name)) {
                playerIterator.remove();
            }
        }
    }

    public void startRound() {
        RoundTimerController roundTimerController = new RoundTimerController(minutesBetweenRounds);
    }
}
