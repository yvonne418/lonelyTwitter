package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by yhoang1 on 9/27/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    /**
     * Instantiates a new Tweet list test.
     */
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    /**
     * Test add tweet.
     */
    public void testAddTweet(){
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Test has tweet.
     */
    public void testHasTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello");

        assertFalse(list.hasTweet(tweet));
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Test get tweet.
     */
    public void testGetTweet(){

        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello");
        Tweet b = new NormalTweet("Hi!");

        list.add(a);
        list.add(b);

        assertEquals(list.getTweet(0), a);
        assertEquals(list.getTweet(1), b);
    }

    /**
     * Test delete tweet.
     */
    public void testDeleteTweet(){
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        list.add(a);
        assertTrue(list.hasTweet(a));

        list.delete(a);
        assertFalse(list.hasTweet(a));
    }
}
