package com.example.krupa.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Declare variable

        EditText edit1;
        EditText edit2;
        Button  plus;
        Button  minus;
        Button  mul;
        Button  div;
        Button  equal;
        TextView text;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.idfirst);
        edit2 = (EditText)findViewById(R.id.idsec);
        plus = (Button)findViewById(R.id.idplus);

        minus = (Button)findViewById(R.id.idminus);

        mul= (Button)findViewById(R.id.idmul);

        div = (Button)findViewById(R.id.iddiv);
        equal = (Button)findViewById(R.id.idequal);
        text = (TextView)findViewById(R.id.idresult);
        spinner=(Spinner)findViewById(R.id.id_spinner);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.mystring, android.R.layout.simple_expandable_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //set listener
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equal.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == plus.getId()) {
            int a = Integer.parseInt(String.valueOf(edit1.getText()));
            int b = Integer.parseInt(String.valueOf(edit2.getText()));
            int sum = a + b;
            text.setText(String.valueOf(sum));

        }

        if (v.getId() == minus.getId()) {
            int a = Integer.parseInt(String.valueOf(edit1.getText()));
            int b = Integer.parseInt(String.valueOf(edit2.getText()));
            int min = a - b;
            text.setText(String.valueOf(min));

        }
        if (v.getId() == mul.getId()) {
            int a = Integer.parseInt(String.valueOf(edit1.getText()));
            int b = Integer.parseInt(String.valueOf(edit2.getText()));
            int multi = a * b;
            text.setText(String.valueOf(multi));

        }
        if (v.getId() == div.getId()) {
            int a = Integer.parseInt(String.valueOf(edit1.getText()));
            int b = Integer.parseInt(String.valueOf(edit2.getText()));
            int divi = a / b;
            text.setText(String.valueOf(divi));

        }
        if (v.getId() == equal.getId()) {
            int a = Integer.parseInt(String.valueOf(edit1.getText()));
            int b = Integer.parseInt(String.valueOf(edit2.getText()));
            int sum = a + b;
            //text.setText(String.valueOf(sum));

            Intent i = new Intent(this, second.class);
            i.putExtra("my sum", String.valueOf(sum));
            startActivity(i);
        }


    }
}
