package com.example.citas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void launchExplicitIntent(View view) {
       switch (view.getId())
       {
           case R.id.getQuo:
               //handle button 1
               break;
           case R.id.fav:
               //handle button 2
               break;
           case R.id.settings:
               Intent intentS= new Intent(this, SettingsActivity.class);
               startActivity(intentS);
               break;
           case R.id.about:
               Intent intentA = new Intent(this, AboutActivity.class);
               startActivity(intentA);
               break;
       }

    }
}