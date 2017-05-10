package com.tafe.mcintosh.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counterText;
    private Button subtractBtn;
    private Button addBtn;
    private Button resetBtn;
    private int counter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find and store objects
        counterText = (TextView) findViewById(R.id.counterText);
        subtractBtn = (Button) findViewById(R.id.subtractBtn);
        addBtn = (Button) findViewById(R.id.addBtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);

        // connect click listener to each button
        subtractBtn.setOnClickListener(btnTouched);
        addBtn.setOnClickListener(btnTouched);
        resetBtn.setOnClickListener(btnTouched);

        // reset the counter
        resetCounter();

    }

    private View.OnClickListener btnTouched = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.addBtn :
                    addOne();
                    break;
                case R.id.subtractBtn :
                    subtractOne();
                    break;
                case R.id.resetBtn :
                    resetCounter();
                    break;
            }

        }
    };

    private void resetCounter() {
        counter = 0;
        counterText.setText(String.valueOf(counter));
    }

    private void addOne() {
        counter ++;
        counterText.setText(String.valueOf(counter));
    }

    private void subtractOne() {
        counter --;
        counterText.setText(String.valueOf(counter));
    }
}
