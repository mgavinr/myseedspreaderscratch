package com.myseedspreader.grogers.myseedspreader;

import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import com.myseedspreader.grogers.myseedspreader.MainSeedSpreader;

public class MainActivity extends AppCompatActivity {

    MainSeedSpreader mainseed = new MainSeedSpreader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void act2(View view) {
        Log.d("MA", "We are switching views now!");
        this.mainseed.getMotd();
        setContentView(R.layout.activity_main2);
    }
}
