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
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String part = checkbox.getText().toString();


        if (checkbox.isChecked() && part.equals("mustache")) {
            ImageView image = (ImageView) findViewById(R.id.mustache);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("mustache")) {
            ImageView image = (ImageView) findViewById(R.id.mustache);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("nose")) {
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("nose")) {
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("mouth")) {
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("mouth")) {
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("shoes")) {
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("shoes")) {
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("arms")) {
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("arms")) {
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("glasses")) {
            ImageView image = (ImageView) findViewById(R.id.glasses);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("glasses")) {
            ImageView image = (ImageView) findViewById(R.id.glasses);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("hat")) {
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("hat")) {
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("eyebrows")) {
            ImageView image = (ImageView) findViewById(R.id.eyebrows);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("eyebrows")) {
            ImageView image = (ImageView) findViewById(R.id.eyebrows);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("ears")) {
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("ears")) {
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && part.equals("eyes")) {
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked() && part.equals("eyes")) {
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.INVISIBLE);
        }
    }
}