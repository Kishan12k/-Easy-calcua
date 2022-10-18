package com.example.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button  madd;
    private TextView  mresult;
    private EditText mnum1;
    private EditText mnum2;
    private Button  msubract;
    private Button  mmultiply;
    private Button  mdivide;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button madd = findViewById(R.id.add);
        mnum1 = findViewById(R.id.num1);
        mnum2 = findViewById(R.id.num2);
        mresult = findViewById(R.id.result);
        Button msubract = findViewById(R.id.subract);
        mnum1 = findViewById(R.id.num1);
        mnum2 = findViewById(R.id.num2);
        mresult = findViewById(R.id.result);
        Button mmultiply = findViewById(R.id.multiply);
        mnum1 = findViewById(R.id.num1);
        mnum2 = findViewById(R.id.num2);
        mresult = findViewById(R.id.result);
        Button mdivide = findViewById(R.id.divide);
        mnum1 = findViewById(R.id.num1);
        mnum2 = findViewById(R.id.num2);
        mresult = findViewById(R.id.result);

        madd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mnum1.getText().toString().length() == 0) {
                    mnum1.setText("0");
                }
                if (mnum2.getText().toString().length() == 0) {
                    mnum2.setText("0");
                }

                Float z = Float.valueOf(mnum1.getText().toString());
                Float h = Float.valueOf(mnum2.getText().toString());
                Float sum = z + h;
                mresult.setText(String.valueOf(sum));
            }
        });
        msubract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mnum1.getText().toString().length() == 0) {
                    mnum1.setText("0");
                }

                if (mnum2.getText().toString().length() == 0) {
                    mnum2.setText("0");
                }
                Float g = Float.valueOf(mnum1.getText().toString());
                Float f = Float.valueOf(mnum2.getText().toString());
                Float sub = g - f;
                mresult.setText(String.valueOf(sub));
            }
        });
        mmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mnum1.getText().toString().length() == 0) {
                    mnum1.setText("0");
                }
                if (mnum2.getText().toString().length() == 0)
                {
                    mnum2.setText("0");
                }
                Float k = Float.valueOf(mnum1.getText().toString());
                Float r = Float.valueOf(mnum2.getText().toString());
                Float multiply = k * r;
                mresult.setText(String.valueOf(multiply));


            }
        });
        mdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mnum1.getText().toString().length() == 0) {
                    mnum1.setText("0");
                }
                if (mnum2.getText().toString().length() == 0) {
                    mnum2.setText("0");
                }
                if (mnum2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "who taught u maths", Toast.LENGTH_SHORT).show();
                    mresult.setText(String.valueOf("error"));
                } else {

                    Float s1 = Float.valueOf(mnum1.getText().toString());
                    Float s2 = Float.valueOf(mnum2.getText().toString());
                    Float div = s1 / s2;
                    mresult.setText(String.valueOf(div));
                }

            }
        });









    }
}