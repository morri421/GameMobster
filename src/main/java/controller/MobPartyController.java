package controller;

import model.PlayerCharacter;

import java.util.ArrayList;

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
}
