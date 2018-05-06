package com.example.lenovo.autocompletetextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class MainActivity extends AppCompatActivity {

    String[] country = {"Australia", "Albania", "Algeria", "Angola", "Belgium", "Bhutan", "Canada", "China", "India"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //We can use any of the built_in android layout simple_list_item_1 and select_dialog_item
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country);

        AutoCompleteTextView ac_tv = (AutoCompleteTextView) findViewById(R.id.ac_tv);

        //Start character for search
        ac_tv.setThreshold(1);

        //Setting adapter
        ac_tv.setAdapter(adapter);

        //Setting textcolor after selection
        ac_tv.setTextColor(Color.BLUE);

    }


}
