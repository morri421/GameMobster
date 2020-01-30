package controller;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MobPartyControllerTest {

    @Test
    public void addPlayerToMob() {
        MobPartyController mobPartyController = new MobPartyController();
        mobPartyController.addMemberToParty("Ryan");

        assertThat(mobPartyController.getParty().size(), is(1));

    }
}
