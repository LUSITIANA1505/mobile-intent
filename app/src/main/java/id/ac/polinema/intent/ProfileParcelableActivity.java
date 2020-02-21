package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameTampil;
    private TextView nameTampil;
    private TextView ageTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here

        usernameTampil = findViewById(R.id.text_username);
        nameTampil = findViewById(R.id.text_name);
        ageTampil = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        User us = extras.getParcelable("user");
        if (extras != null) {

            // TODO: display value here

            usernameTampil.setText(us.getUsername());
            nameTampil.setText(us.getName());
            ageTampil.setText(String.valueOf(us.getAge()));
        }
    }
}
