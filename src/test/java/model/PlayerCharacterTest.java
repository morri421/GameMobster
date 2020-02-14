package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerCharacterTest {

    @Test
    public void playerCharacterRollsANumBetween0And100() {
        PlayerCharacter playerCharacter = new PlayerCharacter("Dave");

        int roll = playerCharacter.rollAnAction();

        Assertions.assertTrue(roll > 0 && roll <= 100, "Number is between 1 and 100");
    }

    @Test
    public void playerCharacterGets10ExperienceAfterPassingRound() {
        PlayerCharacter playerCharacter = new PlayerCharacter("David");

        playerCharacter.passedARound();

        Assertions.assertTrue(playerCharacter.getXP() == 10, "Each round a player gets 10 xp");
    }
}