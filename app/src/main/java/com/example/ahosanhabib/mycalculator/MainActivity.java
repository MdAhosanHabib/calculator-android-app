package com.example.ahosanhabib.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText number1,number2;
    private Button addbutton,subButton,mulButton,divButton;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.edit1);
        number2 = (EditText) findViewById(R.id.edit2);

        addbutton = (Button) findViewById(R.id.addButtonid);
        subButton = (Button) findViewById(R.id.subButtonid);
        mulButton = (Button) findViewById(R.id.mulButtonid);
        divButton = (Button) findViewById(R.id.divButtonid);

        resultText = (TextView) findViewById(R.id.resulttextviewid);

        addbutton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try{
            String num1 = number1.getText().toString();
            String num2 = number2.getText().toString();

            //convert to double

            double nmbr1 = Double.parseDouble(num1);
            double nmbr2 = Double.parseDouble(num2);

            if(v.getId()==R.id.addButtonid){

                double add = nmbr1 + nmbr2;
                resultText.setText("Result : "+add);

            }
            else if(v.getId()==R.id.subButtonid){

                double sub = nmbr1 - nmbr2;
                resultText.setText("Result : "+sub);

            }
            else if(v.getId()==R.id.mulButtonid){

                double mul = nmbr1 * nmbr2;
                resultText.setText("Result : "+mul);

            }
            else if(v.getId()==R.id.divButtonid){

                double div = nmbr1 / nmbr2;
                resultText.setText("Result : "+div);

            }
        }catch(Exception e){
            Toast.makeText(MainActivity.this,"Please Enter Any Number",Toast.LENGTH_SHORT).show();
        }


    }
}
