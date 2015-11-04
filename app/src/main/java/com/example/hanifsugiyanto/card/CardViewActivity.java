package com.example.hanifsugiyanto.card;

/**
 * Created by hanifsugiyanto on 04/11/15.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


    public class CardViewActivity extends Activity {

        TextView personName;
        TextView personAge;
        ImageView personPhoto1;
        ImageView personPhoto2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.card_view);
            personName = (TextView)findViewById(R.id.person_name);
            personAge = (TextView)findViewById(R.id.person_age);
            personPhoto1 = (ImageView)findViewById(R.id.person_photo1);
            personPhoto2 = (ImageView)findViewById(R.id.person_photo2);

            personName.setText("Emma Wilson");
            personAge.setText("23 years old");
            personPhoto1.setImageResource(R.drawable.emma);
            personPhoto2.setImageResource(R.drawable.emma);
        }
    }

