package com.jw.mac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView tv_v1;
    Button btn_cilek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_v1= (TextView) findViewById(R.id.tv_v1);
        btn_cilek= (Button) findViewById(R.id.btn_cilek);
        btn_cilek.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
