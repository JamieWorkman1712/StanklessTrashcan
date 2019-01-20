package com.blastbeatsandcode.trashcan.view;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.blastbeatsandcode.trashcan.R;
import com.blastbeatsandcode.trashcan.controller.CanController;
import com.blastbeatsandcode.trashcan.utils.Messages;

// MainActivity is the initial view for the application
public class MainActivity extends AppCompatActivity implements TrashCanView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Messages.makeToast(this, "Application loaded! Time to get STANKLESS!");
    }

    @Override
    public void update() {
        // TODO: Implement this
    }
}
