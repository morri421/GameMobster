package model;

public class PlayerCharacter extends Character {

    private String name;
    private int xp = 0;

    public PlayerCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void passedARound() {
        xp = xp + 10;
    }

    public int getXP() {
        return xp;
    }

}
