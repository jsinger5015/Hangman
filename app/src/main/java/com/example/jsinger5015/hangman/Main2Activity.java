
package com.example.jsinger5015.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    static String[] words = {"Stomach", "Head", "Hand", "Drive", "Explain", "Stray", "Path", "Aquire", "Adopt", "Tables", "Backdrop", "Backfire",
            "Silky", "Moth", "Dumb", "Bearish", "Stupid", "Bimonthly", "Bisulfate", "Love", "Hate", "Like", "Luminous", "Spark", "Fire",
            "Breathing", "Document", "Computer", "Bystander", "Keyboard", "Righteously", "Waterbed", "Ocean",
            "Swim", "dive", "Die", "Republicans", "Hacker", "Flowchart", "Time", "Horse", "Dragon", "Cave", "Navy", "Army", "Glad", "Documentarily",
            "Pants", "Uncopyrightable", "Chair", "Mouse", "Ambidextrously", "Answer", "Picture", "Stem", "Shoe",
            "Plant", "Watch", "Lymph", "Guitar", "Trash", "Magnet", "Bored", "Neck", "Subordinately", "Consumable", "Ownership", "Police", "Unproblematic",
            "Loser", "Serial", "Bankruptcy"};


    static int c = 1;
    static int index = getIndex();
    static String usedWord = theWordUsed();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lines();
    }
    public void addLetter(View view) {
        TextView ltrs = (TextView) view;
        ltrs.setVisibility(View.INVISIBLE);
        withLetters(ltrs);
    }

    public void withLetters(TextView letter) {
        if (letInWord(letter)) {
            addLetters(letter);
        } else {
            notThere();
        }

    }


    public void lines() {
        TextView daWord = (TextView) findViewById(R.id.textView1);
        daWord.setText(numLines());
        TextView txt1 = new TextView(Main2Activity.this);
    }

    public String numLines() {
        int numLet = usedWord.length();
        String returning = "";

        for (int x = 0; x < numLet; x++) {
            returning += "_ ";
            System.out.println(usedWord.toUpperCase());
        }
        return returning;
    }

    public void addLetters(TextView let) {
        char wantedLet = let.getText().toString().charAt(0);
        int location = usedWord.indexOf(wantedLet);
        TextView zaWord = (TextView) findViewById(R.id.textView1);
        String zeWord = zaWord.getText().toString();
        String editor = zeWord.substring(0, location * 2) + wantedLet + zeWord.substring((location * 2) + 1);
        zaWord.setText(editor);
        if (editor.indexOf('_')== -1) {
            buttonA4();
        }
    }

    public void buttonA4() {
        Intent i = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(i);
    }

    public void notThere() { //add to the hangman
        if (c == 1) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance1);
            c++;
        } else if (c == 2) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance2);
            c++;
        } else if (c == 3) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance3);
            c++;
        } else if (c == 4) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance4);
            c++;
        } else if (c == 5) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance5);
            c++;
        } else if (c == 6) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance6);
            c++;
        } else if (c == 7) {
            ImageView gallows = (ImageView) findViewById(R.id.gallows);
            gallows.setImageResource(R.drawable.chance7);

            c++;
        } else if (c == 8) {
            c = 1;
            buttonA3();
            //go to activity 3

        }
    }

    public void buttonA3() {
        Intent i = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(i);
    }

    public boolean letInWord(TextView letter) {
        System.out.println(usedWord);
        System.out.println(letter.getText());
        return (usedWord.contains(letter.getText().toString()));
    }

    public static int getIndex() {
        return (int) (Math.random() * (words.length - 1));
    }

    public static String theWordUsed() {
        return words[index].toUpperCase();
    }
}