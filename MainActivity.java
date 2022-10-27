package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // a public method to get the input numbers
    public boolean getNumbers() {

        e1 = (EditText) findViewById(R.id.num1);

        e2 = (EditText) findViewById(R.id.num2);

        t1 = (TextView) findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        // check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Please enter a value";
            t1.setText(result);

            return false;
        } else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);
        }

        return true;
    }

    public void doSum(View v) {

        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
            Toast.makeText(this, "Sum is " + sum, Toast.LENGTH_SHORT).show();

        }
    }

    public void doSub() {

        if (getNumbers()) {
            int sub = num1 - num2;
            t1.setText(Integer.toString(sub));
            Toast.makeText(this, "Subtraction is " + sub, Toast.LENGTH_SHORT).show();
        }
    }

    public void doMul() {

        if (getNumbers()) {
            int mul = num1 * num2;
            t1.setText(Integer.toString(mul));
            Toast.makeText(this, "Multiplication is " + mul, Toast.LENGTH_SHORT).show();
        }
    }

    public void doDiv() {

        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double div = num1 / (num2 * 1.0);
            t1.setText(Double.toString(div));
            Toast.makeText(this, "Division is " + div, Toast.LENGTH_SHORT).show();
        }
    }

}
