package th.ac.su.homework3.modal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import th.ac.su.homework3.R;

public class WordItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_item);
    }

    public final int imageResId;
    public final String word;
    public final String word2;

    public WordItem(int imageResId, String word, String word2) {
        this.imageResId = imageResId;
        this.word = word;
        this.word2 = word2;
    }

}