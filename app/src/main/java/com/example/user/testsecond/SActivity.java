package com.example.user.testsecond;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SActivity extends AppCompatActivity {
    String str;
    Button bt03;
    TextView tv03,tv04;
    String a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        tv03=(TextView) findViewById(R.id.tv03);
        tv04=(TextView) findViewById(R.id.tv04);
        bt03=(Button) findViewById(R.id.bt03);

        Intent i =getIntent();
        a=i.getStringExtra("1");//I는 getStringExtra을 써서 activity_main에 있는 KEY값을 받아서 a에 넣는다.
        b=i.getStringExtra("2");

        tv03.setText(a);
        tv04.setText(b);
        bt03.setText("Button");

        bt03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();//화면이 끝나서 현재화면이 사라지고 전 화면이 나옴
            }
        });


//        Log.e("!!!",str);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("!!!", "onStart");


    }
}
