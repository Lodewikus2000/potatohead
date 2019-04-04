package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {

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

            if (nose) {
                ImageView image = (ImageView) findViewById(R.id.nose);
                image.setVisibility(View.VISIBLE);
            }
            if (ears) {
                ImageView image = (ImageView) findViewById(R.id.ears);
                image.setVisibility(View.VISIBLE);
            }
            if (mustache) {
                ImageView image = (ImageView) findViewById(R.id.mustache);
                image.setVisibility(View.VISIBLE);
            }
            if (mouth) {
                ImageView image = (ImageView) findViewById(R.id.mouth);
                image.setVisibility(View.VISIBLE);
            }
            if (shoes) {
                ImageView image = (ImageView) findViewById(R.id.shoes);
                image.setVisibility(View.VISIBLE);
            }
            if (arms) {
                ImageView image = (ImageView) findViewById(R.id.arms);
                image.setVisibility(View.VISIBLE);
            }
            if (glasses) {
                ImageView image = (ImageView) findViewById(R.id.glasses);
                image.setVisibility(View.VISIBLE);
            }
            if (hat) {
                ImageView image = (ImageView) findViewById(R.id.hat);
                image.setVisibility(View.VISIBLE);
            }
            if (eyebrows) {
                ImageView image = (ImageView) findViewById(R.id.eyebrows);
                image.setVisibility(View.VISIBLE);
            }
            if (eyes) {
                ImageView image = (ImageView) findViewById(R.id.eyes);
                image.setVisibility(View.VISIBLE);
            }
        }
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String part = checkbox.getText().toString();

        if (checkbox.isChecked()) {
            switch (part) {
                case "mustache":
                    findViewById(R.id.mustache).setVisibility(View.VISIBLE);
                    break;
                case "shoes":
                    findViewById(R.id.shoes).setVisibility(View.VISIBLE);
                    break;
                case "eyes":
                    findViewById(R.id.eyes).setVisibility(View.VISIBLE);
                    break;
                case "glasses":
                    findViewById(R.id.glasses).setVisibility(View.VISIBLE);
                    break;
                case "ears":
                    findViewById(R.id.ears).setVisibility(View.VISIBLE);
                    break;
                case "eyebrows":
                    findViewById(R.id.eyebrows).setVisibility(View.VISIBLE);
                    break;
                case "mouth":
                    findViewById(R.id.mouth).setVisibility(View.VISIBLE);
                    break;
                case "hat":
                    findViewById(R.id.hat).setVisibility(View.VISIBLE);
                    break;
                case "arms":
                    findViewById(R.id.arms).setVisibility(View.VISIBLE);
                    break;
                case "nose":
                    findViewById(R.id.nose).setVisibility(View.VISIBLE);
                    break;
            }
        } else {
            switch (part) {
                case "mustache":
                    findViewById(R.id.mustache).setVisibility(View.INVISIBLE);
                    break;
                case "shoes":
                    findViewById(R.id.shoes).setVisibility(View.INVISIBLE);
                    break;
                case "eyes":
                    findViewById(R.id.eyes).setVisibility(View.INVISIBLE);
                    break;
                case "glasses":
                    findViewById(R.id.glasses).setVisibility(View.INVISIBLE);
                    break;
                case "ears":
                    findViewById(R.id.ears).setVisibility(View.INVISIBLE);
                    break;
                case "eyebrows":
                    findViewById(R.id.eyebrows).setVisibility(View.INVISIBLE);
                    break;
                case "mouth":
                   findViewById(R.id.mouth).setVisibility(View.INVISIBLE);
                    break;
                case "hat":
                    findViewById(R.id.hat).setVisibility(View.INVISIBLE);
                    break;
                case "arms":
                    findViewById(R.id.arms).setVisibility(View.INVISIBLE);
                    break;
                case "nose":
                    findViewById(R.id.nose).setVisibility(View.INVISIBLE);
                    break;
            }
        }

    }

        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState); // always call super

            outState.putBoolean("eyes",(findViewById(R.id.eyes).getVisibility() == View.VISIBLE));
            outState.putBoolean("ears",(findViewById(R.id.ears).getVisibility() == View.VISIBLE));
            outState.putBoolean("hat",(findViewById(R.id.hat).getVisibility() == View.VISIBLE));
            outState.putBoolean("eyebrows",(findViewById(R.id.eyebrows).getVisibility() == View.VISIBLE));
            outState.putBoolean("shoes",(findViewById(R.id.shoes).getVisibility() == View.VISIBLE));
            outState.putBoolean("glasses",(findViewById(R.id.glasses).getVisibility() == View.VISIBLE));
            outState.putBoolean("arms",(findViewById(R.id.arms).getVisibility() == View.VISIBLE));
            outState.putBoolean("mustache",(findViewById(R.id.mustache).getVisibility() == View.VISIBLE));
            outState.putBoolean("mouth",(findViewById(R.id.mouth).getVisibility() == View.VISIBLE));
            outState.putBoolean("nose",(findViewById(R.id.nose).getVisibility() == View.VISIBLE));
        }
}