package in.swarajmahindre.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view){
        Intent i = new Intent(this, NumberActivity.class);
        startActivity(i);
    }

    public void openPhrasesActivity(View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

    public void openColors(View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void openFamilyMembers(View view){
        Intent i = new Intent(this, FamilyMembers.class);
        startActivity(i);
    }
}

