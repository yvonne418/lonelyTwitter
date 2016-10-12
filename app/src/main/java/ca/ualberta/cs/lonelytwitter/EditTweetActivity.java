package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        pos = intent.getIntExtra("position",0);

        String text = LonelyTwitterActivity.tweetList.get(pos).getMessage();

        TextView tweetText = (TextView) findViewById(R.id.textView);
        tweetText.setText(text);
    }
}
