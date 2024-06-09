package com.markus.cinemaua;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        ImageButton backButton = findViewById(R.id.back_btn_description);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Intent intent = getIntent();
        if (intent != null) {
            String title = intent.getStringExtra("title");
            String description = intent.getStringExtra("description");
            ArrayList<String> showtimes = intent.getStringArrayListExtra("showtimes");
            String posterUrl = intent.getStringExtra("posterUrl");

            ImageView imageViewPoster = findViewById(R.id.imageViewPoster);
            Picasso.get().load(posterUrl).into(imageViewPoster);

            TextView textViewTitle = findViewById(R.id.textViewTitle);
            textViewTitle.setText(title);

            TextView textViewDescription = findViewById(R.id.textViewDescription);
            textViewDescription.setText(description);

            TextView textViewShowtimes = findViewById(R.id.textViewShowtimes);
            if (showtimes != null) {
                String showtimesString = TextUtils.join("\n \n", showtimes);
                textViewShowtimes.setText(showtimesString);
            }
        }
    }
}
