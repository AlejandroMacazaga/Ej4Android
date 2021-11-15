package com.example.ejercicios4_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lst;
    private ImageView img;
    private final static Webs[] webs = {
            new Webs("https://www.youtube.com", "Youtube", 1, R.drawable.youtube),
            new Webs("https://www.twitter.com", "Twitter", 2, R.drawable.twitter)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst = (ListView) findViewById(R.id.lst);
        lst.setAdapter(new AdaptadorWebs(this, webs));
    }

    class AdaptadorWebs extends ArrayAdapter<Webs> {
        private Webs[] ws;

        public AdaptadorWebs(Context context, Webs[] ws) {
            super(context, R.layout.list)
            this.ws = ws;

        }
        public AdaptadorWebs(@NonNull Context context, int resource) {
            super(context, resource);
        }
    }
}