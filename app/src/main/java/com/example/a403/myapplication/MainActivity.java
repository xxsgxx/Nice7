package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    Button button, button2, button3, button4, button5;
    TextView textView;
    double num1, num2;
    double Result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초 간단하지 않은 계산기");

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        textView = (TextView) findViewById(R.id.Result);

        View.OnClickListener clisten = new View.OnClickListener() {
            public void onClick(View v) {
                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();
                if (s1.isEmpty())
                    Toast.makeText(getApplicationContext(), "Empty Value in Value1", Toast.LENGTH_LONG).show();
                else if(s2.isEmpty())
                    Toast.makeText(getApplicationContext(), "Empty Value in Value2", Toast.LENGTH_LONG).show();
                else {
                num1 = Double.parseDouble(s1);
                    num2 = Integer.parseInt(s2);

                    switch (v.getId()) {
                        case R.id.button:
                            Result = num1 + num2;
                            break;

                        case R.id.button2:
                            Result = num1 - num2;
                            break;

                    case R.id.button3:
                        Result = num1 * num2;
                        break;

                    case R.id.button4:
                        if(s2.equals("0")) {
                            Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_LONG).show();
                            return;
                        }
                        Result = num1 / num2;
                        break;

                    case R.id.button5:
                        Result = num1 % num2;
                        break;
                }


                }
                textView.setText("계산결과 : " + Result);
            }
        };
        button.setOnClickListener(clisten);
        button2.setOnClickListener(clisten);
        button3.setOnClickListener(clisten);
        button4.setOnClickListener(clisten);
        button5.setOnClickListener(clisten);
    }
}
