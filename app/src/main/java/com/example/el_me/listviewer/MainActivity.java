package com.example.el_me.listviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView milistade = (ListView) findViewById(R.id.milistade);

        final ArrayList<String> Comida = new ArrayList<String>();

        Comida.add("Manzana");
        Comida.add("Pera");
        Comida.add("Sandía");
        Comida.add("Naranja");
        Comida.add("Melón");
        Comida.add("Uva");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Comida);


        milistade.setAdapter(arrayAdapter);
        milistade.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // We override the onItemClick function
            // AdapterView<> has an unidentified data type (?) so it can manage any type.
            // It is also an AdapterView so it can handle Lists, Spinners, Grids and so on
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //If for some reason we would want the list to disappear wen the user clicks on it:
                //parent.setVisibility(View.GONE);

                //If we wanted that the name the user clicks on appears on the log
                //Log.i("Person tapped: ",myFamily.get(position));

                //Toast to the person clicked
                Toast.makeText(getApplicationContext(),"La fruta que mas me gusta es " + Comida.get(position), Toast.LENGTH_LONG);

            }
        });

    }

}

