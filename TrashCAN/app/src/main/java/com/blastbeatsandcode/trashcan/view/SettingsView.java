package com.blastbeatsandcode.trashcan.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.blastbeatsandcode.trashcan.R;

public class SettingsView extends AppCompatActivity implements TrashCanView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_view);
    }

    @Override
    public void update() {
        // TODO: Implement this
    }
}
