package com.example.docscan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView scanCard, browseCard, convertCard, recentCard, shareCard, settingsCard ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining cards
        scanCard = (CardView) findViewById(R.id.scan);
        browseCard = (CardView) findViewById(R.id.browse);
        convertCard = (CardView) findViewById(R.id.convert);
        recentCard = (CardView) findViewById(R.id.recent);
        shareCard = (CardView) findViewById(R.id.share);
        settingsCard = (CardView) findViewById(R.id.settings);

        //add click listern to the cards
        scanCard.setOnClickListener(this);
        browseCard.setOnClickListener(this);
        convertCard.setOnClickListener(this);
        recentCard.setOnClickListener(this);
        shareCard.setOnClickListener(this);
        settingsCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.scan : i = new Intent(this,Scan.class); startActivity(i); break ;
            case R.id.browse : i = new Intent(this,browse.class); startActivity(i); break ;
            case R.id.convert : i = new Intent(this,Convert.class); startActivity(i); break ;
            case R.id.recent : i = new Intent(this,Recent.class); startActivity(i); break ;
            case R.id.share : i = new Intent(this,Share.class); startActivity(i); break ;
            case R.id.settings : i = new Intent(this,Settings.class); startActivity(i); break ;
            default: break ;


        }
    }
}