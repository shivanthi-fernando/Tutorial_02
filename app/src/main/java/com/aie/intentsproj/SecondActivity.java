package com.aie.intentsproj;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.aie.intentsproj.FirstActivity.EXTRA_MESSAGE;

public class SecondActivity extends AppCompatActivity {

    Button Add_button;
    Button Deduct_button;
    Button Multiply_button;
    Button Devide_button;
    TextView result;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int n1 = intent.getIntExtra(EXTRA_MESSAGE,0);
        int n2 = intent.getIntExtra(EXTRA_MESSAGE,0);

        final TextView no_1 = (TextView) this.findViewById(R.id.no_1);
        no_1.setText(String.valueOf(n1));

        final TextView no_2 = (TextView) this.findViewById(R.id.no_2);
        no_2.setText(String.valueOf(n2));

        Add_button = (Button) findViewById(R.id.add);
        Deduct_button = (Button) findViewById(R.id.deduct);
        Multiply_button = (Button) findViewById(R.id.multiply);
        Devide_button = (Button) findViewById(R.id.devide);

        result = (TextView) findViewById(R.id.answer);

        Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(no_1.getText().toString());
                int num_2 = Integer.parseInt(no_2.getText().toString());

                int sum = num_1 + num_2;

                result.setText(Integer.toString(sum));
            }
        });

        Deduct_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(no_1.getText().toString());
                int num_2 = Integer.parseInt(no_2.getText().toString());

                int deduct = num_1 - num_2;

                result.setText(Integer.toString(deduct));
            }
        });

        Multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(no_1.getText().toString());
                int num_2 = Integer.parseInt(no_2.getText().toString());

                int multiply = num_1 * num_2;

                result.setText(Integer.toString(multiply));
            }
        });

        Devide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_1 = Integer.parseInt(no_1.getText().toString());
                int num_2 = Integer.parseInt(no_2.getText().toString());

                int devide = num_1 / num_2;

                result.setText(Integer.toString(devide));
            }
        });

    }
}
