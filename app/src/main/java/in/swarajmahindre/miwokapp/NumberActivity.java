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

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "Lukko", R.drawable.number_one));
        words.add(new Word("Two", "otiiko", R.drawable.number_two));
        words.add(new Word("Three", "tolookosu", R.drawable.number_three));
        words.add(new Word("Four", "oyyiss", R.drawable.number_four));
        words.add(new Word("Five","massokka", R.drawable.number_five));
        words.add(new Word("Six", "temokka", R.drawable.number_six));
        words.add(new Word("Seven", "Kenekaku", R.drawable.number_seven));
        words.add(new Word("Eight", "Kawinta", R.drawable.number_eight));
        words.add(new Word("Nine", "wo'e" ,R.drawable.number_nine));
        words.add(new Word("ten", "no'aacha", R.drawable.number_ten));

        /**
        Log.v("NumberActivity","Word at index 0 ="+ words.get(0));
        Log.v("NumberActivity","Word at index 1 ="+ words.get(1));
        Log.v("NumberActivity","Word at index 2 ="+ words.get(2));
        Log.v("NumberActivity","Word at index 3 ="+ words.get(3));
        Log.v("NumberActivity","Word at index 4 ="+ words.get(4));
        Log.v("NumberActivity","Word at index 5 ="+ words.get(5));
        Log.v("NumberActivity","Word at index 6 ="+ words.get(6));
        Log.v("NumberActivity","Word at index 7 ="+ words.get(7));
        Log.v("NumberActivity","Word at index 8 ="+ words.get(8));
        Log.v("NumberActivity","Word at index 9 ="+ words.get(9));
         **/



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        }
    }
