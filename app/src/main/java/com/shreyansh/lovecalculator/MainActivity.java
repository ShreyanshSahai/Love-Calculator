package com.shreyansh.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText male, female;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View view) {
        male = findViewById(R.id.maleText);
        female = findViewById(R.id.femaleText);
        result = findViewById(R.id.result);
        String mname = male.getText().toString();
        String fname = female.getText().toString();
        if(mname.equals("")) {
            Toast.makeText(this, "Please Enter the name of lover 1", Toast.LENGTH_SHORT).show();
        }
        if(fname.equals("")) {
            Toast.makeText(this, "Please Enter the name of lover 2", Toast.LENGTH_SHORT).show();
        }
        if(mname.equalsIgnoreCase("Shreyansh Sahai") || mname.equalsIgnoreCase("Shreyansh")) {
            result.setText("100%");
            return;
        }
        else {
            int sum = 0;
            for (char a : fname.toCharArray()) {
                sum += (int) a;
            }
            for (char a : mname.toCharArray()) {
                sum += (int) a;
            }
            while (sum > 100) {
                sum -= 54;
            }
            result.setText(sum + "%");
        }
    }
}