package com.example.jsinger5015.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void buttonA2(View view) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addLetter(View view) {
        TextView ltrs = (TextView) view;
        ltrs.setVisibility(View.GONE);
        //withLetters(ltrs);

    }

    /*public void withLetters(TextView letter) {
        if (letInWord(letter)) addLetters();
        else notThere();
    }

    public void addLetters() {

    }

    public void notThere() { //add to the hangman

    }

    public boolean letInWord(TextView letter) {
        String hangWord = theWordUsed(ofWords(), getIndex(ofWords()));
        return (hangWord.contains(letter));
    }

    public static String[] ofWords() {
         String[] words = {"Stomach", "Head", "Hand", "Drive", "Explain", "Stray", "Path", "Aquire", "Adopt", "Tables", "Backdrop", "Backfire",
                "Silky", "Moth", "Dumb", "Bearish", "Stupid", "Bimonthly", "Bisulfate", "Love", "Hate", "Like", "Luminous", "Spark", "Fire",
                "Breathing", "Document", "Computer", "Bystander", "Keyboard", "Righteously", "Waterbed", "Ocean",
                "Swim", "dive", "Die", "Republicans", "Hacker", "Flowchart", "Time", "Horse", "Dragon", "Cave", "Navy", "Army", "Glad", "Documentarily",
                "Pants", "Uncopyrightable" };

        return words;
    }

    public int getIndex(String[] words) {
        words = ofWords();
        int index = (int) (Math.random() * (words.length - 1));
        return index;
    }

    public String theWordUsed(String[] words, int index) {
        words = ofWords();
        index = getIndex(words);
        return words[index].toLowerCase();
    }*/
}