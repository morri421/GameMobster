package timer;

import controller.MobPartyController;
import model.PlayerCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundTest {

    @Test
    public void timedRoundAdds10XpAfterCompletion() throws InterruptedException {
        PlayerCharacter playerCharacter = new PlayerCharacter("Dave");
        RoundTimer roundTimer = new RoundTimer(1, playerCharacter);

        Thread.sleep(2000);

        Assertions.assertTrue(playerCharacter.getXP() == 10, "After one round, player gets 10xp");
    }

}
