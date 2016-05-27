package com.example.jsinger5015.hangman;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    static String[] words = {"Stomach", "Head", "Hand", "Drive", "Explain", "Stray", "Path", "Aquire", "Adopt", "Tables", "Backdrop", "Backfire",
            "Silky", "Moth", "Dumb", "Bearish", "Stupid", "Bimonthly", "Bisulfate", "Love", "Hate", "Like", "Luminous", "Spark", "Fire",
            "Breathing", "Document", "Computer", "Bystander", "Keyboard", "Righteously", "Waterbed", "Ocean",
            "Swim", "dive", "Die", "Republicans", "Hacker", "Flowchart", "Time", "Horse", "Dragon", "Cave", "Navy", "Army", "Glad", "Documentarily",
            "Pants", "Uncopyrightable", "Chair", "Mouse", "Ambidextrously", "Answer", "Picture", "Stem", "Shoe",
            "Plant", "Watch", "Lymph", "Guitar", "Trash", "Magnet", "Bored", "Neck", "Subordinately", "Consumable", "Ownership", "Police", "Unproblematic",
            "Loser", "Serial","Bankruptcy" };

    TextView ts;

    static int index = getIndex();
    static String usedWord = theWordUsed();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ts = (TextView)findViewById(R.id.ts);
        lines();

    }

    public void addLetter(View view) {
        TextView ltrs = (TextView) view;
        ltrs.setVisibility(View.INVISIBLE);
        withLetters(ltrs);
    }

    public void withLetters(TextView letter) {
        if (letInWord(letter)){addLetters(letter);}
        else
        {notThere();}
    }


    public void lines(){
        TextView daWord = (TextView) findViewById(R.id.textView1);
        daWord.setText(numLines());
        TextView txt1 = new TextView(Main2Activity.this);
    }

    public String numLines(){
        int numLet = usedWord.length();
        String returning = "";

        for (int x = 0; x< numLet; x++){
            returning += " _";
            System.out.println(usedWord.toUpperCase());
        }
        return returning;
    }

    public void addLetters(TextView let) {
        char wantedLet = let.toString().charAt(0);
        int location = words[index].indexOf(wantedLet);
        TextView zaWord = (TextView) findViewById(R.id.textView1);
        String editor = zaWord.getText().toString().substring(0, location*2) +  wantedLet + zaWord.getText().toString().substring((location*2) +1);
        zaWord.setText(editor);

    }

    public void notThere() { //add to the hangman

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


