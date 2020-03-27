package com.aie.intentsproj;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

     public void ok_button(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        EditText no1 = (EditText) findViewById(R.id.no1);
        EditText no2 = (EditText) findViewById(R.id.no2);

        String number_1 = no1.getText().toString();
        String number_2 = no2.getText().toString();

        int n1 = 0, n2 = 0;
        try {
            n1 = Integer.valueOf(number_1);
            n2 = Integer.valueOf(number_2);
        }
        catch (NumberFormatException nfe){

        }
        intent.putExtra(EXTRA_MESSAGE, n1);
        intent.putExtra(EXTRA_MESSAGE, n2);
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

    }
}
