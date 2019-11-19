package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerCharacterTest {

    @Test
    public void name() {
        PlayerCharacter playerCharacter = new PlayerCharacter();

        int roll = playerCharacter.rollAnAction();

        Assertions.assertTrue(roll > 0 && roll <= 100, "Number is between 1 and 100");
    }

}