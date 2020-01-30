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

//    @Test
//    public void testFailureTest() {
//        int one = 1;
//        int two = 2;
//        Assertions.assertTrue(one + two == 5, "1+2 does not equal 5");
//    }

}