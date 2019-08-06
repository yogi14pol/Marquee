package com.clicks.yogi.marquee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView MarqueTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarqueTextId = findViewById(R.id.MarqueText);
        MarqueTextId.setSingleLine();
        MarqueTextId.setSelected(true);
    }
}