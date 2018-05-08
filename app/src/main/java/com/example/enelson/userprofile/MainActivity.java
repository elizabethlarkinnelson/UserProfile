package com.example.enelson.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePicImageView = (ImageView) findViewById(R.id.profile_picture);
        profilePicImageView.setImageResource(R.drawable.liz);

        TextView nameTextView = (TextView) findViewById(R.id.name);
        nameTextView.setText("Elizabeth");

        TextView birthdayTextView = (TextView) findViewById(R.id.birthday);
        nameTextView.setText("January");

        TextView countryTextView = (TextView) findViewById(R.id.country);
        nameTextView.setText("USA");
    }
}
