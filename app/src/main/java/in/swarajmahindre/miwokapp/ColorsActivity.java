package in.swarajmahindre.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "wetetti", R.drawable.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "takaakki", R.drawable.color_brown));
        words.add(new Word("gray", "topoppi", R.drawable.color_gray));
        words.add(new Word("black","kulullli", R.drawable.color_black));
        words.add(new Word("white ", "kelilli", R.drawable.color_white));
        words.add(new Word("dusky yellow", "topiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
