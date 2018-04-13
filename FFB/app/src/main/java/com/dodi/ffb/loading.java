package com.dodi.ffb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class loading extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        progressBar = (ProgressBar) findViewById(R.id.frogress);
        Thread thread = new Thread(){
            public void run(){
                super.run();
                for (int i=0; i<=100;){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    progressBar.setProgress(i);
                    i=i+10;

                }
            }
        };
        thread.start();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
