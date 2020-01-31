package controller;

import model.PlayerCharacter;

import java.util.ArrayList;
import java.util.Iterator;

public class MobPartyController {

    private ArrayList<PlayerCharacter> party;

    private int timeBetweenRounds;

    public MobPartyController() {
        this.party = new ArrayList<PlayerCharacter>();
        this.timeBetweenRounds = 0;
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
}
