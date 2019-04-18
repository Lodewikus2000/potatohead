package com.example.myapplication;

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

        if (savedInstanceState != null) {


            for (String part: bodyParts){
                boolean visible = savedInstanceState.getBoolean(part);
                if (visible){
                    ImageView image = (ImageView) findViewById(getResources().getIdentifier(part, "id", this.getPackageName()));
                    image.setVisibility(View.VISIBLE);
                }
            }

            boolean nose = savedInstanceState.getBoolean("nose");
            boolean ears = savedInstanceState.getBoolean("ears");
            boolean mustache = savedInstanceState.getBoolean("mustache");
            boolean glasses = savedInstanceState.getBoolean("glasses");
            boolean hat = savedInstanceState.getBoolean("hat");
            boolean mouth = savedInstanceState.getBoolean("mouth");
            boolean shoes = savedInstanceState.getBoolean("shoes");
            boolean arms = savedInstanceState.getBoolean("arms");
            boolean eyes = savedInstanceState.getBoolean("eyes");
            boolean eyebrows = savedInstanceState.getBoolean("eyebrows");

        }
    }

    public void checkClicked(View v) {
        Log.d("potato", "clicked a checkbox");

        CheckBox checkbox = (CheckBox) v;

        // Save the name of the checkbox that was clicked.
        String part = checkbox.getText().toString();

        if (checkbox.isChecked()) {
            ImageView image = (ImageView) findViewById(getResources().getIdentifier(part, "id", this.getPackageName()));
            image.setVisibility(View.VISIBLE);
        } else {
            ImageView image = (ImageView) findViewById(getResources().getIdentifier(part, "id", this.getPackageName()));
            image.setVisibility(View.INVISIBLE);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        for (String part: bodyParts){
            Boolean visible = (findViewById(getResources().getIdentifier(part,"id", this.getPackageName())).getVisibility() == View.VISIBLE);
            outState.putBoolean(part, visible);
        }
    }
}