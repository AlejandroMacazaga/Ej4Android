package com.example.ejercicios4_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner);
        ArrayAdapter <CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.paises, android.R.layout.simple_spinner_item);
        sp.setAdapter(adaptador);
        txt = findViewById(R.id.txt);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String s = (String) adapterView.getItemAtPosition(i);
                String[] populations = getResources().getStringArray(R.array.populations);
                for(String pop : populations) {
                    String[] pair = pop.split(":");

                    String key = pair[0];
                    String value = pair[1];
                    if (s.equals(key)) {
                        txt.setText(value);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}