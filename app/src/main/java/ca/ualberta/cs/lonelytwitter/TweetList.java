package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhoang1 on 9/27/16.
 */
public class TweetList {
    List<Tweet> tweets = new ArrayList<Tweet>();
    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Duplicate tweet");
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public Tweet getTweets(Tweet tweet){

        for (int x = 0; x < tweets.size(); x++) {
            return tweets.get(x);
        }

        return tweet;
    }

    public void delete(Tweet a) {
        tweets.remove(a);
    }

    public int getCount(int num){
        int count = 0;
        while (count < num){
            count++;
        }
        return count;
    }
}
