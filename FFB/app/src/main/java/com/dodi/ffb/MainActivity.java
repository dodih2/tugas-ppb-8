package com.dodi.ffb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String[] produk = {
            "Smartphone Xiaomi 4X",
            "Smartphone Xiaomi 4A",
            "Smartphone Xiaomi 5A",
            "Notebook Xiaomi",
            "Charger Xiaomi MD-08-ES",
            "Charger Xiaomi MD-08-EF"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        DatePicker datePicker;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, produk);
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.txtProduk);
        textView.setThreshold(3);
        textView.setAdapter(adapter);

        datePicker = (DatePicker) findViewById(R.id.datepicker);
        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            }
        });

    }



    public void btnOnClick(View v) {
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.txtProduk);
        TextView tekse = (TextView) findViewById(R.id.txtnamafroduk);
        tekse.setText(textView.getText().toString());

    }

    public void btntime(View v) {
        Intent intent = new Intent(this, time.class);
        startActivity(intent);
    }


}