package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //given
        User user1 = new Millenials("Eryk");
        User user2 = new ZGeneration("Kuba");
        User user3 = new YGeneration("Michal");

        //When
        String user1Sharing = user1.sharePost();
        String user2Sharing = user2.sharePost();
        String user3Sharing = user3.sharePost();

        //then
        assertEquals("Facebook", user1Sharing);
        assertEquals("Twitter", user2Sharing);
        assertEquals("Snapchat", user3Sharing);


    }
    @Test
    public void testIndividualSharingStrategy() {

        //given
        User user1 = new Millenials("Michal");

        //when
        String user1Sharing = user1.sharePost();
        user1.setSocialPublisher(new TwitterPublisher());
        String newUser1Sharing = user1.sharePost();

        //then
        assertEquals("Facebook", user1Sharing);
        assertEquals("Twitter", newUser1Sharing);


    }


}
