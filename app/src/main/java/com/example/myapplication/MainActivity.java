package com.example.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    private String[] bodyParts = {"nose", "ears", "mustache", "glasses", "hat", "mouth", "shoes", "arms", "eyes", "eyebrows"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We now use the sharedPreferences to remember Mr. Potatohead's state.
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);


        for (String part: bodyParts){
            boolean visible = prefs.getBoolean(part, false);
            if (visible){
                    ImageView image = (ImageView) findViewById(getResources().getIdentifier(
                            part, "id", this.getPackageName()));
                    image.setVisibility(View.VISIBLE);

                    CheckBox checkbox = (CheckBox) findViewById(getResources().getIdentifier(
                            part +"Check", "id", this.getPackageName()));
                    checkbox.setChecked(true);
                }
        }
    }

    public void checkClicked(View v) {
        Log.d("potato", "clicked a checkbox");


        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();


        CheckBox checkbox = (CheckBox) v;

        // Save the name of the checkbox that was clicked.
        String part = checkbox.getText().toString();

        if (checkbox.isChecked()) {
            ImageView image = (ImageView) findViewById(getResources().getIdentifier(part, "id", this.getPackageName()));
            image.setVisibility(View.VISIBLE);

            editor.putBoolean(part, true);
            editor.apply();

        } else {
            ImageView image = (ImageView) findViewById(getResources().getIdentifier(part, "id", this.getPackageName()));
            image.setVisibility(View.INVISIBLE);

            editor.putBoolean(part, false);
            editor.apply();
        }
    }
}