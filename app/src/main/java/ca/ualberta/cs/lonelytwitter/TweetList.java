package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhoang1 on 9/27/16.
 */
public class TweetList {
    /**
     * The Tweets. It is put into an ArrayList
     */
    List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add if it is not a duplicate tweet
     * @throws IllegalArgumentException
     * @param tweet the tweet
     */
    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Duplicate tweet");
        }
        tweets.add(tweet);
    }

    /**
     * Should return true if there is a tweet that equals() another tweet
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * Gets tweet and returns it
     *
     * @param i the index
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Returns tweets in chronological order
     *
     * @param tweet the tweet
     * @return the tweet
     */
    public Tweet getTweets(Tweet tweet){

        for (int x = 0; x < tweets.size(); x++) {
            return tweets.get(x);
        }

        return tweet;
    }

    /**
     * Delete the tweet
     *
     * @param a tweet
     */
    public void delete(Tweet a) {
        tweets.remove(a);
    }

    /**
     * Counts how many tweets are in the tweetList
     *
     * @param num the num
     * @return the count
     */
    public int getCount(int num){
        int count = 0;
        while (count < num){
            count++;
        }
        return count;
    }
}
